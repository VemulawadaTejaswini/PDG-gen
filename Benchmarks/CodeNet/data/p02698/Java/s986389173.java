#include <bits/stdc++.h>
#define rep(i,n) for (ll i = 0; i < (n); ++i)
using namespace std;
typedef long long ll;
typedef pair<ll,ll> P;
typedef vector<vector<ll> > Graph;
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }
const ll INF = 1e16;

int n;
Graph G;
set<ll>s;
ll ans[200010];
vector<ll>a;

void dfs(int v,int p,set<ll> &s){
    ll now = a[v];
    auto itr = s.lower_bound(now);
    if(itr==s.end()){
        s.emplace(now);
    }
    else{
        s.erase(itr);
        s.emplace(now);
    }
    ans[v]=s.size();
    for(ll x : G[v]){
        if(x==p)continue;
        dfs(x,v,s);
    }
}

int main(){
    cin >> n;
    a.resize(n);
    rep(i,n)cin>>a[i];
    G.resize(n);
    rep(i,n-1){
        int a,b;
        cin >> a >> b;
        a--;b--;
        G[a].push_back(b);
        G[b].push_back(a);
    }
    dfs(0,-1,s);
    rep(i,n){
        cout << ans[i] << endl;
    }
    return 0;
}
