#include<bits/stdc++.h>
using namespace std;
#define rep(i, n) for (int i = 0; i < (int)(n); ++i)
typedef long long ll;
int calc(int d) {
  if (d == 0) {
    return 1;
  } else {
    bitset<30> b(d);
    return calc(d % b.count()) + 1;
  }
}
int main() {
  int n;
  string s;
  cin >> n >> s;
  bitset<2 * (int) pow(10, 5)> b(s);
  int a = b.count(), a1 = a - 1, a2 = a + 1;
//  cout << "a:" << a << ":" << a1 << ":" << a2 << endl;
  int b1 = 0, b2 = 0, c = 1;
  vector<int> v1(n), v2(n);
  v1[0] = 1, v2[0] = 1;
  if (b.test(0)) {
    b1 = 1;
    b2 = 1;
  }
  rep(i,n-1)
  {
    if (a > 1)
      v1[i + 1] = v1[i] * 2 % a1;
    v2[i + 1] = v2[i] * 2 % a2;
    if (b.test(i + 1)) {
      if (a > 1)
        b1 = (b1 + v1[i + 1]) % a1;
      b2 = (b2 + v2[i + 1]) % a2;
    }
  }
//  cout << "b:" << b1 << ":" << b2 << endl;
//  rep(i,n)
//    cout << " " << v2[i];
//  cout << endl;
  for (int i = n - 1; i >= 0; i--) {
    if (b.test(i)) {
      if (a > 1) {
        int d = (b1 + a1 - v1[i]) % a1;
        if (d == 0) {
          cout << 1 << endl;
        } else {
          cout << calc(d)<< endl;
        }
      } else
        cout << 0 << endl;
    } else {
      int d = (b2 + a2 + v2[i]) % a2;
      if (d == 0) {
        cout << 1 << endl;
      } else {
        cout << calc(d)<< endl;
      }
    }
  }
  return 0;
}
