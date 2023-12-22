#include <bits/stdc++.h>
using namespace std;
#define rep(i,n) for(int i=0;i<(int)(n);i++)

int main() {
  int n, q, b, c, af;
  int sum=0;
  cin>>n;
  vector<int> a(n);
  vector<int> num(100010);
  rep(i,n){
  	cin>>a.at(i);
    af=a.at(i);
    sum+=a.at(i);
    num.at(af-1)=num.at(af-1)+1;
  }
  cin>>q;
  rep(i,q){
  	cin>>b >>c;
    sum=sum+(c-b)*num.at(b-1);
    cout<<sum<<endl;
    num.at(c-1)+=num.at(b-1);
    num.at(b-1)=0;
  }
}