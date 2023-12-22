#include <iostream>
#include <queue>
#include <vector>
#include <cstdio>
#include <algorithm>
using namespace std;

#define all(c) (c).begin(), (c).end()
#define loop(i,a,b) for(int i=(a);i<int(b);i++)
#define rep(i,b) loop(i,0,b)

typedef int Capacity;
typedef int Cost;
struct MCF {
    struct Edge {
        int dst;
        Capacity cap, cap_orig;
        Cost cost;
        int revEdge; bool isRev;
        Edge(int dst, Capacity cap, Cost cost, int revEdge, bool isRev)
            :dst(dst), cap(cap), cap_orig(cap), cost(cost), revEdge(revEdge), isRev(isRev) {}
    };
    int n;
    vector<vector<Edge> > g;
    enum : Cost { inf = 1<<29 };
    enum : int { MAX_V = 200 };

    MCF(int n_) : n(n_), g(vector<vector<Edge> >(n_)){}

    pair<int,int> add_edge(int src, int dst, Capacity cap, Cost cost) {
        g[src].emplace_back(dst, cap, cost, g[dst].size(), false);
        g[dst].emplace_back(src, 0, -cost, g[src].size() - 1, true);
        return make_pair(g[src].size()-1, g[dst].size()-1);
    }
    int mcf(int s, int t, int f) {
        int res = 0;
        // vector<Cost> h(g.size()), dist(g.size());
        // vector<int> prevv(g.size()), preve(g.size());
        static Cost h[MAX_V], dist[MAX_V];
        static int prevv[MAX_V], preve[MAX_V];
        rep(i,n)h[i] = 0;
        while (f > 0) {
            typedef pair<Cost,int> pcv;
            priority_queue<pcv, vector<pcv>, greater<pcv> > q;
            rep(i,n) dist[i] = inf;
            dist[s] = 0;
            q.emplace(pcv(0, s));
            while (q.size()) {
                pcv p = q.top(); q.pop();
                int v = p.second;
                if (dist[v] < p.first) continue;
                rep(i,g[v].size()){
                    Edge &e = g[v][i];
                    if (e.cap > 0 && dist[e.dst] > dist[v] + e.cost + h[v] - h[e.dst]) {
                        dist[e.dst] = dist[v] + e.cost + h[v] - h[e.dst];
                        prevv[e.dst] = v;
                        preve[e.dst] = i;
                        q.emplace(pcv(dist[e.dst], e.dst));
                    }
                }
            }
            if (dist[t] == inf) {
                return -1;
            }
            rep(v,n) h[v] += dist[v];
            // s-t 間最短路に沿って目一杯流す
            int d = f;
            for (int v = t; v != s; v = prevv[v]) {
                d = min(d, g[prevv[v]][preve[v]].cap);
            }
            f -= d;
            res += d * h[t];
            for (int v = t; v != s; v = prevv[v]) {
                Edge &e = g[prevv[v]][preve[v]];
                e.cap -= d;
                g[v][e.revEdge].cap += d;
            }
        }
        return res;
    }

    // 流れたフロー=元々の容量-現在の容量を表示
    void view(){
        rep(i,g.size()){
            rep(j,g[i].size())if(!g[i][j].isRev){
                Edge& e = g[i][j];
                printf("%3d->%3d (flow:%d)\n", i, e.dst, e.cap_orig - e.cap);
            }
        }
    }
};

int main(){
    int n;
    while(cin>>n){
        MCF mcf(n*2+2);
        int p[111];
        rep(i,n) cin >> p[i];
        rep(i,n){
            mcf.add_edge(n*2,i,1,0);
            mcf.add_edge(n+i,n*2+1,1,0);
        }
        rep(i,n)rep(j,n)if(i!=j){
            int x = find(p,p+n,i+1)-p;
            mcf.add_edge(i,n+j,1,(i+1)*abs(x-j));
        }
        cout << mcf.mcf(n*2,n*2+1,n) << endl;
    }
}