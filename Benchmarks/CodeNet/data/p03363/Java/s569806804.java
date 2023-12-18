#include<iostream>
#include<vector>
using namespace std;
int main(){
  int n;
  int count = 0;
  cin >> n;
  vector<int>a(n);
  vector<int>b(n+1);

  for (size_t i = 0; i < n; i++) {
    cin >> a[i];
  }
  for (size_t i = 0; i < n+1; i++) {
    if(b[i]==0){
      b[0] = 0;
    }else{
      b[i] = b[i-1] + a[i-1];
    }
  }
  for (size_t i = 0; i < n+1; i++) {
    for (size_t j = n; j > i; j--) {
      if(b[i] == b[j]){
        count++;
      }
    }
  }
  cout << count <<endl;
}
