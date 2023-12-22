#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define endl '\n'
#define all(x) (x).begin(),(x).end()
const int INF=1e9+5;
const ll oo=1e18+5;
const int N=2e5+5;
const int mod=1e9+7;

vector<vector<string>> s;
vector<int> cost;
ll dp[55][35][2];
int n;

bool isGud(const string& s,int l,int r){
	for(int i=l,j=r-1;i<j;++i,--j){
		if(s[i]!=s[j]) return 0;
	}
	return 1;
}

ll solve(int id,int suff,int dir){
	int len=(int)s[id][dir].size();
	if(isGud(s[id][dir],len-suff,len)) return 0;
	ll res=dp[id][suff][dir];
	if(res>=0) return res;
	res=INF;
	int rev=dir^1;
	for(int i=0;i<n;++i){
		int sizee=(int)s[i][rev].size();
		if(sizee<=suff){
			if(s[i][rev]==s[id][dir].substr(len-suff,sizee)){
				res=min(res,cost[i]+solve(id,suff-sizee,dir));
			}
		}
		else{
			if(s[id][dir].substr(len-suff)==s[i][rev].substr(0,suff)){
				res=min(res,cost[i]+solve(i,sizee-suff,rev));
			}
		}
	}
	return res;
}

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	cin>>n;
	s.resize(n,vector<string>(2));
	cost.resize(n);
	for(int i=0;i<n;++i){
		cin>>s[i][0]>>cost[i];
		s[i][1]=s[i][0];
		reverse(all(s[i][1]));
	}
	ll ans=oo;	
	memset(dp,255,sizeof(dp));
	for(int i=0;i<n;++i){
		ll cur=cost[i]+solve(i,(int)s[i][0].size(),0);
		ans=min(ans,cur);
	}
	if(ans>=INF) ans=-1;
	cout<<ans;
	return 0;
}
