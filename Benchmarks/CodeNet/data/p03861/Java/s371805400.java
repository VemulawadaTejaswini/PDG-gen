#include <bits/stdc++.h>
using namespace std;

int main() {

  long a, b, x;
  cin >> a >> b >> x;

  long a_ = a / x;

  if (a % x == 0) {
    a_--;
  }

  long b_ = b / x;

  cout << b_ - a_ << endl;

}