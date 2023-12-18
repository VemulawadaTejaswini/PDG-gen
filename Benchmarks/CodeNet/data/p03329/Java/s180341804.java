#include<bits/stdc++.h>
using namespace std;
int dp[100010];
int main(){
	int n;
	cin>>n;
	for(int i=0;i<100010;i++){
		dp[i]=i;
	}
	int a[12]={1,6,36,216,1296,1296*6,1296*36,9,81,729,729*9,729*81};
	sort(a,a+10);
	for(int i=0;i<100010;i++){
		for(int j=0;j<12;j++){
			if(i>=a[j]){
				dp[i]=min(dp[i],dp[i-a[j]]+1);
			}
		}
	}
	cout<<dp[n]<<endl;
	return 0;
}
