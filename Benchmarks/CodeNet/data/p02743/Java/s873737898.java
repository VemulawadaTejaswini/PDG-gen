
#include <bits/stdc++.h>
using namespace std;
 
int main() {
  long long A,B,C;
  cin>>A>>B>>C;
  long double AA=sqrt(A);
  long double BB=sqrt(B);
  long double CC=sqrt(C);
  if(AA+BB<CC){
    cout<<"Yes"<<endl;
  }
  else{
    cout<<"No"<<endl;
  }
}