#include <bits/stdc++.h>
using namespace std;

int main() {

  int N;
  cin >> N;

  map<int, int> map;

  for (int i = 0; i < N; i++) {
    int A;
    cin >> A;
    map[A]++;
  }

  int count = 0;

  for (auto i: map) {
    if (i.second % 2 != 0) {
      count++;
    }
  }

  cout << count << endl;

}