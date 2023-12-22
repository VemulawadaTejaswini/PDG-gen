#pragma GCC optimize("Ofast")
#include <iostream> // cout, endl, cin
#include <string> // string, to_string, stoi
#include <vector> // vector
#include <algorithm> // min, max, swap, sort, reverse, lower_bound, upper_bound
#include <utility> // pair, make_pair
#include <tuple> // tuple, make_tuple
#include <cstdint> // int64_t, int*_t
#include <cstdio> // printf
#include <map> // map
#include <queue> // queue, priority_queue
#include <set> // set
#include <stack> // stack
#include <deque> // deque
#include <unordered_map> // unordered_map
#include <unordered_set> // unordered_set
#include <bitset> // bitset
#include <cctype> // isupper, islower, isdigit, toupper, tolower
#include <iomanip> // setprecision
#include <complex> // complex
#include <functional>
#include <math.h> 
#define enld '\n'
using namespace std;
using ll = long long;
using P = pair<int,int>;
constexpr ll INF = 1e18;
constexpr int inf = 1e9;
// constexpr ll mod = 1000000007;
constexpr ll mod2 = 998244353;
const int dx[8] = {1, 0, -1, 0,1,1,-1,-1};
const int dy[8] = {0, 1, 0, -1,1,-1,1,-1};
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }
// ---------------------------------------------------------------------------

ll dp[3001][3001][4][4];

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  for(int i=0; i<3001; i++){
    for(int j=0; j<3001; j++){
      for(int k=0; k<4; k++){
        for(int l=0; l<4; l++){
          dp[i][j][k][l] = 0;
        }
      }
    }
  }
  int R,C,K;
  cin >> R >> C >> K;
  vector<vector<ll>> G(R,vector<ll> (C,0));
  for(int i=0; i<K; i++){
    int r,c,v;
    cin >> r >> c >> v;
    r--;c--;
    G[r][c] = v;
  }
  for(int i=0; i<R; i++){
    for(int j=0; j<C; j++){
      for(int k=0; k<=3; k++){
        for(int l=0; l<=3; l++){
          // 行移動
          chmax(dp[i+1][j][k][0],dp[i][j][k][l]);
          if(l != 3){
            chmax(dp[i+1][j][k+1][0],dp[i][j][k][l] + G[i][j]);
          }
          // 列移動
          chmax(dp[i][j+1][0][l],dp[i][j][k][l]);
          if(k != 3){
            chmax(dp[i][j+1][0][l+1],dp[i][j][k][l] + G[i][j]);
          }
        }
      }
    }
  }
  ll ans = 0;
  for(int i=0; i<=3; i++){
    for(int j=0; j<=3; j++){
      chmax(ans,dp[R][C-1][i][j]);
      chmax(ans,dp[R-1][C][i][j]);
    }
  }
  cout << ans << "\n";
  return 0;
}