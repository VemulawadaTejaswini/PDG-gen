#include<bits/stdc++.h>
using namespace std;

int main()
{
   int n,a,b;
   cin>>n>>a>>b;
   if(n>(a+b)){
    int x = n%(a+b);
    if(x>a){
        x=a;
    }
    cout<<x + (n/(a+b))*a;
   }
   else{
    cout<<a;
   }

}
