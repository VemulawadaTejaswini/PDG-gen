#include<bits/stdc++.h>

using namespace std;

int main(){
  
  int a,b,c,d;
  cin >> a >> b >> c >> d;
  
  while(true){
  	c -= b;
    if(c <= 0) {
      cout << "Yes";
      break;
    }
    a -= d;
    if(a <= 0){
      cout << "No";
      break;
    }
  } 
  cout << "\n";
 return 0; 
}