#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int H,W,N;
  cin >> H >> W >> N;
  int x=H;
  if(H!=W){
  	x=max(H,W);
  }
  int ans=N/x;
  if(x*ans!=N)ans++;
  cout << ans << endl;
}