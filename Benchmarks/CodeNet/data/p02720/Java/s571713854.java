#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<long long> v;
void dfs(ll x, ll num, ll st, ll cc){
	if(v.size() > 100050) return;
	if(num == 0) num += x;
	else {
		num *= 10;
		num += x;
	}
	if(cc > st) return;
	if(cc == st){
		v.push_back(num);
		return;
	}
	if(x-1 >= 0) dfs(x-1,num,st,cc+1);
	if(x+1 <= 9) dfs(x+1,num,st,cc+1);
	dfs(x,num,st,cc+1);
	return;
}

int main(){
	
	ll k; cin>>k;
	for(int i = 1; i <= 10; i++){
		for(int j = 1; j <= 9; j++){
			dfs(j,0,i,1);
		}
	}
	sort(v.begin(),v.end());
	cout<<v[k-1]<<"\n";
}