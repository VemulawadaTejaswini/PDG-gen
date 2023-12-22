#include<iostream>
#include<string>
#include<algorithm>
#include<map>
#include<set>
#include<utility>
#include<vector>
#include<cmath>
#include<cstdio>
#define loop(i,a,b) for(int i=a;i<b;i++) 
#define rep(i,a) loop(i,0,a)
#define pb push_back
#define mp make_pair
#define it ::iterator
#define all(in) in.begin(),in.end()
const double PI=acos(-1);
const double ESP=1e-10;
using namespace std;
int main(){
  int m;
  int co=0;
  while(cin>>m,m){
    co++;
    int n;
    char d;
    cin>>n;
    vector<int>w(n),v(n);
    vector<vector<int> >dp(n+1);
    rep(i,m+1)dp[0].pb(0);
    rep(i,n)cin>>v[i]>>d>>w[i];
    rep(i,n){
      //dp[i].pb(0);
      rep(j,m+1){
	if(w[i]>j)dp[i+1].pb(dp[i][j]);
	else dp[i+1].pb(max(dp[i][j],dp[i][j-w[i]]+v[i]));
      }
    }
    int maxi=0;
    rep(i,m)if(dp[n][i]==dp[n][m]){maxi=i;break;}

    cout<<"Case "<<co<<":"<<endl;
    cout<<dp[n][m]<<endl;
    cout<<maxi<<endl;
  }


}