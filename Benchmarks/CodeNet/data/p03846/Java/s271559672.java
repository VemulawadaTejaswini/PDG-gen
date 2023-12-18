#include <bits/stdc++.h>
using namespace std;

int main() {

  int N;
  cin >> N;

  vector<int> number(100100);
  for (int i = 0; i < N; i++) {
    int a;
    cin >> a;
    number[a]++;
  }

  int mod = 1000000000 + 7;
  
  bool valid = true;

  if (N % 2 != 0) {
    if (number[0] != 1) {
      valid = false;
    } else {
      for (int i = 1; i < N; i++) {
        if (i % 2 == 0) {
          if (number[i] != 2) {
            valid = false;
            break;
          }
        } else {
          if (number[i] != 0) {
            valid = false;
            break;
          }
        }
      }
    }
  } else {
    if (number[0] != 0) {
      valid = false;
    } else {
      for (int i = 1; i < N; i++) {
        if (i % 2 == 0) {
          if (number[i] != 0) {
            valid = false;
            break;
          }
        } else {
          if (number[i] != 2) {
            valid = false;
            break;
          }
        }
      }
    }
  }

  if (valid){

    int count = 1;

    for (int i = 1; i <= N / 2; i++) {
      count = (count * 2) % mod;
    }

    cout << count << endl;

  } else {

    cout << 0 << endl;
  
  }

}