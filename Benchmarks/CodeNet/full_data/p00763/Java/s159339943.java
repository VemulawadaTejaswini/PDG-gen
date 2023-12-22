#include <stdio.h>

#define inf 1000000000

struct company_info{
	int rail[100][100];
	int p;
	int dst[51];
	int cost[10001];
};

int main(){
	int n, m, c, s, g;
	struct company_info company[20];
	int i, j, k, l;
	int x, y, d, ci;
	int r;
	int dp[100][100];

	while(1){
		scanf("%d %d %d %d %d", &n, &m, &c, &s, &g);

		s--; g--;

		for(i=0; i<c; i++){
			for(j=0; j<n; j++){
				for(k=0; k<n; k++){
					if(j==k){
						company[i].rail[j][k] = 0;
						dp[j][k] = 0;
					}else{
						company[i].rail[j][k] = inf;
						dp[j][k] = inf;
					}
				}
			}
		}

		for(i=0; i<m; i++){
			scanf("%d %d %d %d", &x, &y, &d, &ci);
			x--; y--; ci--;
			company[ci].rail[x][y] = d;
			company[ci].rail[y][x] = d;
		}

		for(i=0; i<c; i++){
			scanf("%d", &(company[i].p));
		}

		for(i=0; i<c; i++){
			for(j=1; j<company[i].p; j++){
				scanf("%d", &(company[i].dst[j]));
			}
			company[i].dst[j] = 10000;
			k = 1;
			company[i].cost[0] = 0;
			for(j=1; j<=company[i].p; j++){
				scanf("%d", &r);
				for(k; k<=company[i].dst[j]; k++){
					company[i].cost[k] = company[i].cost[k-1] + r;
				}
			}
		}

		for(l=0; l<c; l++){
			for(k=0; k<n; k++){
				for(i=0; i<n; i++){
					for(j=0; j<n; j++){
						if(company[l].rail[i][j]>company[l].rail[i][k] + company[l].rail[k][j]){
							company[l].rail[i][j] = company[l].rail[i][k] + company[l].rail[k][j];
						}
					}
				}
			}
			for(i=0; i<n; i++){
				for(j=0; j<n; j++){
					if(company[l].rail[i][j]!=inf){
						company[l].rail[i][j] = company[l].cost[company[l].rail[i][j]];
					}
					if(dp[i][j]>company[l].rail[i][j]){
						dp[i][j] = company[l].rail[i][j];
					}
				}
			}
		}

		for(k=0; k<n; k++){
			for(i=0; i<n; i++){
				for(j=0; j<n; j++){
					if(dp[i][j]>dp[i][k] + dp[k][j]){
						dp[i][j] = dp[i][k] + dp[k][j];
					}
				}
			}
		}

		printf("%d\n", dp[s][g]);
	}

}