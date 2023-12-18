/********************************************
 *Author*        :ZZZZone
 *Created Time*  : 一  2/ 5 11:22:16 2018
 * Ended  Time*  : 一  2/ 5 11:37:07 2018
*********************************************/

#include <cstdio>
#include <cstring>
#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <set>
#include <map>
#include <string>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <stack>
using namespace std;
typedef pair<int, int> PII;
typedef long long LL;
typedef unsigned long long ULL;

inline void OPEN(string s){
	freopen((s + ".in").c_str(), "r", stdin);
	freopen((s + ".out").c_str(), "w", stdout);
}

const int MaxN = 2000;
int pre[MaxN + 5], last[MaxN + 5], other[MaxN + 5], cost[MaxN + 5];
int a[MaxN + 5];
bool vis[MaxN + 5];
int n, m, all;
bool flag = true;

void build(int u, int v, int c){
	pre[++all] = last[u];
	last[u] = all;
	other[all] = v;
	cost[all] = c;
}

void dfs(int u, int sum){
	if(flag == false) return;
	if(vis[u] == false){
		vis[u] = true;
		a[u] = sum;
	}
	else{
		if(a[u] != sum) flag = false;
		return;
	}
	int ed = last[u];
	int dr, ned;
	while(ed != -1){
		dr = other[ed];
		ned = cost[ed];
		dfs(dr, sum + ned);
		ed = pre[ed];
	}
}


int main()
{
	memset(last, -1, sizeof(last)); all = -1;
	scanf("%d %d", &n, &m);
	for(int i = 1; i <= m; i++){
		int u, v, c;
		scanf("%d %d %d", &u, &v, &c);
		build(u, v, c);
		build(v, u, -c);
	}
	for(int i = 1; i <= n; i++)
		if(vis[i] == false) dfs(i, i);
	if(flag == true) printf("Yes\n");
	else printf("No\n");
    return 0;
}
