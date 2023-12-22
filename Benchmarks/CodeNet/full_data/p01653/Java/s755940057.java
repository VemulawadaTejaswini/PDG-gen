#include<bits/stdc++.h>
using namespace std;


#define int long long


#define rep(i,n) for(int i=0;i<(n);i++)
#define pb push_back
#define all(v) (v).begin(),(v).end()
#define fi first
#define se second
typedef vector<int>vint;
typedef pair<int,int>pint;
typedef vector<pint>vpint;

template<typename A,typename B>inline void chmin(A &a,B b){if(a>b)a=b;}
template<typename A,typename B>inline void chmax(A &a,B b){if(a<b)a=b;}

const int INF=1001001001001001001ll;

int N,M,S1,S2,T;
vector<pint>G[1111];

int dist[111][1111];

void solve(){
    S1--;S2--;T--;

    rep(i,N)G[i].clear();

    rep(i,M){
        int a,b;
        string s;
        cin>>a>>b>>s;
        a--;b--;

        int c;
        if(s=="x"){
            c=-1;
        }
        else{
            c=0;
            for(int j=0;j<s.size();j++)c=c*10+s[j]-'0';
        }

        G[a].pb({b,c});
        G[b].pb({a,c});
    }


    fill_n(*dist,111*1111,INF);
    dist[0][T]=0;
    priority_queue<tuple<int,int,int>,vector<tuple<int,int,int>>,greater<tuple<int,int,int>>>que;
    que.push(make_tuple(0,T,0));
    while(que.size()){
        int c,v,k;
        tie(c,v,k)=que.top();
        que.pop();
        if(dist[k][v]>c)continue;
        for(auto &e:G[v]){
            int nc,nk;
            if(e.se==-1){
                nc=c;
                nk=k+1;
            }
            else{
                nc=c+e.se;
                nk=k;
            }

            if(nk>100||dist[nk][e.fi]<=nc)continue;
            dist[nk][e.fi]=nc;
            que.push(make_tuple(nc,e.fi,nk));
        }
    }

    vint lis;
    lis.pb(0);
    for(int i=0;i<=100;i++){
        for(int j=0;j<=100;j++){
            if(i==j)continue;
            if(dist[i][S1]==INF||dist[j][S1]==INF)continue;
            int t=(dist[i][S1]-dist[j][S1])/(i-j);
            if(t<0)continue;
            lis.pb(t);
            lis.pb(t+1);
        }
    }
    for(int i=0;i<=100;i++){
        for(int j=0;j<=100;j++){
            if(i==j)continue;
            if(dist[i][S2]==INF||dist[j][S2]==INF)continue;
            int t=(dist[i][S2]-dist[j][S2])/(i-j);
            if(t<0)continue;
            lis.pb(t);
            lis.pb(t+1);
        }
    }

    sort(all(lis));lis.erase(unique(all(lis)),lis.end());
    lis.pb(lis.back()+1);

    int ans=LLONG_MAX;
    for(int t=0;t+1<lis.size();t++){
        int k=0,l=0;

        int x1=lis[t];
        int x2=lis[t+1];

        for(int i=1;i<=100;i++){
            if(dist[k][S1]+k*x1>dist[i][S1]+i*x1)k=i;
            if(dist[l][S2]+l*x1>dist[i][S2]+i*x1)l=i;
        }

        chmin(ans,abs((dist[k][S1]+k*x1)-(dist[l][S2]+l*x1)));
        chmin(ans,abs((dist[k][S1]+k*x2)-(dist[l][S2]+l*x2)));
    }

    cout<<ans<<endl;
}

signed main(){
    while(cin>>N>>M>>S1>>S2>>T,N||M||S1||S2||T)solve();
    return 0;
}