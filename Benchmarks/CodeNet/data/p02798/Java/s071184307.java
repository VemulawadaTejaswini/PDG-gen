/*
　　　∫ ∫ ∫
　　　ノヽ
　　（＿　 ）
　（＿　　　 ）
（＿＿＿＿＿＿ ）
　ヽ(´･ω･)ﾉ　
　　 |　 /
　　 UU
*/
#include <bits/stdc++.h>
typedef long long int64;
using namespace std;
using P = pair<int64, int64>;
typedef vector<int> vi;
const int MOD = (int)1e9 + 7;
const int64 INF = 1LL << 62;
const int inf = 1<<30;
template<class T>bool chmax(T &a, const T &b) { if (a<b) { a=b; return 1; } return 0; }
template<class T>bool chmin(T &a, const T &b) { if (b<a) { a=b; return 1; } return 0; }
#define REP(i, n) for (int i = 0; i < (n); i++)
#define FOR(i,s,n) for (int i = s; i < (n); i++)
#define ALL(obj) (obj).begin(), (obj).end() //コンテナじゃないと使えない!!
#define debug(x) cerr << #x << ": " << x << "\n";
#define mp make_pair
template <typename T>
ostream& operator<<(ostream& os, vector<T> &V){
    int N = V.size();
    REP(i,N){
        os << V[i];
        if (i!=N-1) os << " ";
    }
    os << "\n";
    return os;
}
template <typename T>
ostream& operator<<(ostream& os, pair<T,T> const&P){
    os << P.first;
    os << " ";
    os << P.second;
    return os;
}
template <typename T>
ostream& operator<<(ostream& os, set<T> &S){
    auto it=S.begin();
    while(it!=S.end()){
        os << *it;
        os << " ";
        it++;
    }
    os << "\n";
    return os;
}
template <typename T>
ostream& operator<<(ostream& os, deque<T> &q){
    for(auto it=q.begin();it<q.end();it++){
        os<<*it;
        os<<" ";
    }
     os<<endl;
    return os;
}
vector<pair<int,int>> dxdy = {mp(0,1),mp(1,0),mp(-1,0),mp(0,-1)};
//fixed<<setprecision(10)<<ans<<endl;

int N;
int solve(vector<int> A,vector<int> B,int mask){
    int res = inf;
    vector<int> C(N);
    debug(mask)
    REP(i,N){
        // debug((mask>>i&1))
        if (mask>>i &1) C[i] = B[i];
        else C[i] = A[i];
    }

    set<int> swaped;
    int cnt = 0;
    debug(C)
    REP(i,N){
        for(int j=N-1;j>i;j--){
            if(C[j] < C[j-1]){
                if((mask>>j&1) && (mask>>(j-1)&1)){
                    debug(j)
                    swap(C[j],C[j-1]);
                    cnt++;
                    swaped.insert(j-1);
                    swaped.insert(j);
                }else{
                    return inf;
                }
            }
        }
    }
    REP(i,N){
        if (mask>>i &1){
            if( swaped.find(i) == swaped.end()){
                //救済

                cerr<<"swapしてないのでNG\n";
                return inf;
            }
        }
    }

    cout << "OK" << mp(mask,cnt ) << endl;
    return cnt;
}

int main(){
    cin.tie(0);
    ios::sync_with_stdio(false);
    cin >> N;
    vector<int> A(N),B(N);
    REP(i,N){
        cin >> A[i];
    }REP(i,N){
        cin >> B[i];
    }

    int max_bit = 1<<N;
    int ans = inf;
    REP(mask, max_bit){
        chmin(ans,solve(A,B,mask));
    }

    cout << ans << endl;
}