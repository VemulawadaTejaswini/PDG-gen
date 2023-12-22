#include <iostream>
using namespace std;

int main(){
  int n;
  int ans = 0;
  while(1){
    ans = 0;
    cin >> n;
    if(n == 0)break;
    while(n){
      n = n/5;
      ans += n;
    }
    cout << ans << endl;

  }
}