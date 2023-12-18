#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double Double;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)

// chmax, chmin
template <class T> inline bool chmax(T &a, T b) {
  if (a < b) {
    a = b;
    return 1;
  }
  return 0;
}
template <class T> inline bool chmin(T &a, T b) {
  if (a > b) {
    a = b;
    return 1;
  }
  return 0;
}

void solve(std::vector<long long> H) {}

int main() {
  std::vector<long long> H(2);
  for (int i = 0; i < 2; i++) {
    scanf("%lld", &H[i]);
  }
  solve(std::move(H));
  return 0;
}
