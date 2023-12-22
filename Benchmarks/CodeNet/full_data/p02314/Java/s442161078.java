#include <stdio.h>
#include <algorithm>
#include <string.h>
using namespace std;

const int MAX_N=50000;
const int MAX_M=20;
const int INF=-1;
int d[MAX_M];
int dp[MAX_M+1][MAX_N+1];
int n,m;

void solve(){
	for(int i=0;i<=m;i++){
		for(int j=0;j<=n;j++){
                      if(i==0){
                            dp[i][j]=0;
                              }
			if(j<d[i]){
				dp[i+1][j]=dp[i][j];
			}
			else{
				dp[i+1][j]=min(dp[i][j],dp[i][j-d[i]]+1);
			}
		}

	}
}
int main(){
	scanf("%d %d",&n,&m);
	for(int i=0;i<m;i++){
		scanf("%d ",&d[i]);
	}
	memset(dp,INF,sizeof(dp));
	solve();
	printf("%d\n",dp[m][n]);
	return 0;
}