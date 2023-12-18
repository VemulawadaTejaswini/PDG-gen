#include <bits/stdc++.h>
using namespace std;

int main() {
  vector<int> vec(3);
  for(int i = 0; i < 3; i++){
    cin >> vec[i];
  }
  sort(vec.begin(), vec.end());
  reverse(vec.begin(), vec.end());
  int count = 0;
  count = vec[2] - vec[1];
  vec[1] = vec[2];
  vec[0] += count;
  if((vec[1] - vec[0]) % 2 == 0){
    count += (vec[1] - vec[0])/2;
    cout << count <<endl;
  }
  else{
    count += (vec[1] - vec[0])/2 +2;
    cout << count <<endl;
  }
}
