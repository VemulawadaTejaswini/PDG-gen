#include<bits/stdc++.h>
#define pi acos(-1.0)
using namespace std;

const int maxn = 1e5 + 10;
int a[maxn], b[maxn];

int main() {
  #ifdef LOCAL
  freopen("in", "r", stdin);
  freopen("out", "w", stdout);
  #endif

  ios::sync_with_stdio(false);
  int n;
  cin >> n;
  for (int i = 0; i <= n; ++i) cin >> a[i];
  for (int i = 0; i < n; ++i) cin >> b[i];
  long long ans = 0;
  for (int i = 0; i < n; ++i) {
    ans += min(a[i], b[i]);
    b[i] -= min(a[i], b[i]);
    int tmp = min(a[i + 1], b[i]);
    ans += min(a[i + 1], b[i]);
    b[i] -= tmp;
    a[i + 1] -= tmp;
  }
  cout << ans;
  return 0;
}