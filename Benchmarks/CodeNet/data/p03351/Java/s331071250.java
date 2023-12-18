#include <bits/stdc++.h>
using namespace std;

int main(){
  int a,b,c,d;
  cin >> a >> b >> c >> d;
  if(abs(c-a)<=d){
    cout << "Yes";
  }else{
    if(abs(b-a)<=d&&abs(c-b)<=d&&((b<=a&&b>=c)||(b>=a&&b<=c))){
      cout << "Yes";
    }else{
      cout << "NO";
    }
  }

}
