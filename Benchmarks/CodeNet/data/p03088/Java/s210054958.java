#include <bits/stdc++.h>
using namespace std;
using ll=long long;
const int MOD=1e9+7;

ll dp[101][4][4][4];
bool check(int a,int b,int c,int d){
  if(a*100+b*10+c==123||b*100+c*10+d==123)return false;
  swap(a,b);if(a*100+b*10+c==123||b*100+c*10+d==123)return false;swap(a,b);
  swap(b,c);if(a*100+b*10+c==123||b*100+c*10+d==123)return false;swap(b,c);
  swap(c,d);if(a*100+b*10+c==123||b*100+c*10+d==123)return false;swap(c,d);
  return true;
}
ll f(int idx,int a,int b,int c){
  if(~dp[idx][a][b][c])return dp[idx][a][b][c];
  if(idx==3)return 1;
  ll res=0;
  for(int i=0;i<4;i++)if(check(i,a,b,c))res+=f(idx-1,i,a,b);
  return dp[idx][a][b][c]=res%MOD;
}

signed main(){
  memset(dp,-1,sizeof(dp));
  int n;cin>>n;
  ll ans=0;
  for(int i=0;i<64;i++){
    int a=i%4,b=(i/4)%4,c=(i/16)%4;
    if(check(a,b,c,-1))ans+=f(n,a,b,c);
  }
  cout<<ans%MOD<<endl;
}
