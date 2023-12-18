#include <bits/stdc++.h>
using namespace std;
#define SORT(a) sort((a).begin(), (a).end())
#define RSORT(a) reverse((a).begin(), (a).end())
#define rep(i, n) for (int i = 0; i < n; i++)
typedef long long ll;
const long long INF = 1LL << 60;

int main() {
  int h, w;
  cin >> h >> w;
  vector<string> s(h);
  rep(i, h) cin >> s[i];
  vector<vector<int>> a(h, vector<int>(w));

  for (int i = 0; i < h; i++) {
    int cur = 0;
    for (int j = 0; j < w; j++) {
      if (s[i][j] == '#') {
        cur = 0;
      } else {
        cur++;
      }
      a[i][j] = cur;
    }
  }
  vector<vector<int>> b(h, vector<int>(w));
  for (int i = 0; i < w; i++) {
    int cur = 0;
    for (int j = 0; j < h; j++) {
      if (s[j][i] == '#') {
        cur = 0;
      } else {
        cur++;
      }
      b[j][i] = cur;
    }
  }
  vector<vector<int>> c(h, vector<int>(w));
  for (int i = 0; i < h; i++) {
    int cur = 0;
    for (int j = w - 1; j >= 0; j--) {
      if (s[i][j] == '#') {
        cur = 0;
      } else {
        cur++;
      }
      c[i][j] = cur;
    }
  }
  vector<vector<int>> d(h, vector<int>(w));
  for (int i = 0; i < w; i++) {
    int cur = 0;
    for (int j = h - 1; j >= 0; j--) {
      if (s[j][i] == '#') {
        cur = 0;
      } else {
        cur++;
      }
      d[j][i] = cur;
    }
  }
  int res = 0;
  rep(i, h) {
    rep(j, w) {
      if (s[i][j] == '#') continue;

      res = max(res, a[i][j] + b[i][j] + c[i][j] + d[i][j] - 3);
    }
  }
  cout << res << endl;
}