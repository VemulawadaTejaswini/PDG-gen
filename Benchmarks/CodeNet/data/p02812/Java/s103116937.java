#include<bits/stdc++.h>
using namespace std;

#define ll long long 
#define pi  pair<int,int>
#define ti  tuple<int,int,int>
#define mt  make_tuple
#define mk  make_pair
#define vi  vector<int>
#define vll vector<ll>
#define fastInOut ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define pr(a) for(auto x:a) cout<<x<<" ";
#define prmap(m) for(auto x:m) cout<<x.first<<" "<<x.second<<"\n";


ll n,m;
int main() {
    fastInOut
    
    
    ll k,x;

   cin>>k;
    string s;
   cin>>s;
   int c=0;
   for(int i=0;i<k;i++){
     if(s[i]=='A'&&s[i+1]=='B'&&s[i+2]=='C'){
         c++;
         i++;
      }
   }
     cout<<c;
  /*  cin>>k>>x;
    if(k*500>=x)
          cout<<"Yes";
    else 
          cout<<"NO";
    */

  return 0;
}