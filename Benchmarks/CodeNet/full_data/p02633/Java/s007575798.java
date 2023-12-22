#include <bits/stdc++.h>
using namespace std;

int main() {
  int X;
  cin >> X;
  
  if (360%X == 0) {
    cout << 360 / X << endl;
  }
  
  else {
  	int A = std::lcm(360, X);
    int B = std::gcd(360, X);
    cout << A/(X/B) << endl;
  }
}
