#include <iostream>
#include <vector>
#include <string.h>
#include <stack>
#include <queue>
#include <algorithm>
#include <climits>
#include <cmath>
#include <map>
#include <set>
#include <assert.h>
#define REP(i,n) for(ll i=0;i<(n);i++)
#define MOD 1000000007
//#define int long long
#ifdef int
const long long INF = LLONG_MAX / 10;
#else
const int INF = 1010101010;
#endif
using namespace std;
typedef long long ll;
typedef vector<vector<ll> > mat;
typedef pair<int, int> P;
//typedef pair<double, double> P;
const int dx[9] = {-1, 0, 0, 1, -1, -1, 1, 1, 0};
const int dy[9] = {0, -1, 1, 0, -1, 1, -1, 1, 0};

int H, W;
char maze[60][60];
int sx, sy;
int gx, gy;
int d[60][60];  //各点までの最短距離の配列

//(sx, sy)から(gx, gy)への最短経路を求める
int bfs()
{
  queue<P> que;
  REP(i,H) REP(j,W) d[i][j] = INF;
  que.push(P(sx, sy));
  d[sy][sx] = 0;

  while (que.size()) {
    P p = que.front(); que.pop();
    if (p.first == gx && p.second == gy) break;
    REP(i,4) {
      int nx = p.first + dx[i];
      int ny = p.second + dy[i];
      if (0 <= nx && nx < W && 0 <= ny && ny < H && maze[ny][nx] != '#' && d[ny][nx] == INF) {
        que.push(P(nx, ny));
        d[ny][nx] = d[p.second][p.first] + 1;
      }
    }
  }

  return d[gy][gx];
}

signed main()
{
  cin >> H >> W;
  int x = 0;
  REP(i,H) REP(j,W) {
    cin >> maze[i][j];
    if (maze[i][j] == '#') x++;
  }
  sx = 0, sy = 0, gx = W - 1, gy = H - 1;
  cout << bfs() << endl;
  cout << H * W - x - bfs() - 1 << endl;
}