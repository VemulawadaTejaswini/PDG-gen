#include <cstdio>
#include <cstring>
#include <cmath>
#include <cstdlib>
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <queue>
#include <map>
#include <set>
using namespace std;
//________
#define pb        emplace_back
#define fi        first
#define se        second
#define ALL(x)    x.begin(),x.end()
#define err(...)  fprintf(stderr, __VA_ARGS__ )
#define show(x)   cerr << #x << ':' << (x) << endl
#define outl(x)   cout << (x) << '\n'
#define FAST()    cin.tie(0), ios::sync_with_stdio(false)
#define rep(i,n)     for(int i=0; i<(n); ++i)
#define reps(i,f,n)  for(int i=(f); i<=(n); ++i)
template<class A, class B>inline bool chmax(A &a, B b){return b>a ? a=b,1 : 0;}
template<class A, class B>inline bool chmin(A &a, B b){return b<a ? a=b,1 : 0;}
inline bool inside(int y, int x, int H, int W){return(y>=0 && x>=0 && y<H && x<W);}
constexpr int dx[] = {1, 0, -1, 0,  1, 1, -1, -1};
constexpr int dy[] = {0, 1, 0, -1,  -1, 1, 1, -1};
typedef long long ll;
typedef pair<int,int> pii;
#define let const auto
#define INF  0x3f3f3f3f
#define LINF 0x3f3f3f3f3f3f3f3f
#define NIL -1
//________


signed main()
{
   FAST();
   int N, M;
   map<string, int> a, b;

   cin >> N;
   rep(i, N) {
      string s;
      cin >> s;
      a[s]++;
   }

   cin >> M;
   rep(i, M) {
      string t;
      cin >> t;
      a[t]--;
   }

   int maxv = 0;
   for (auto it=a.begin(); it != a.end(); it++){
      maxv = max(it->second, maxv);
   }
   outl(maxv);
}

