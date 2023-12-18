#include<bits/stdc++.h>
#define int long long
using namespace std;
const int maxn = 2e5 + 10;
const int mod = 1e9 + 7;
int pow_mod(int a, int n, int mod) {
	if (n == 0)
		return 1;
	int ans = pow_mod(a, n / 2, mod);
	ans = ans * ans % mod;
	if (n % 2 == 1)
		ans = ans * a % mod;
	return ans;
}
//扩展GCD
int ex_gcd(int a, int b, int &x, int &y) {
	if (b == 0) {
		x = 1;
		y = 0;
		return a;
	}
	int g = ex_gcd(b, a % b, x, y);
	int temp = x;
	x = y;
	y = temp - a / b * y;
	return g;
}
//扩展欧几里得的另一种写法
void ex_gcd(int a, int b, int &d, int &x, int &y) {
	//求解ax+by=gcd(a,b)的一组解
	if (!b) {
		d = a, x = 1, y = 0;
	} else {
		ex_gcd(b, a % b, d, y, x);
		y -= x * (a / b);
	}
}
//逆元
int inv(int a, int mod) {
	int X, Y;
	int g = ex_gcd(a, mod, X, Y);
	if (g != 1)
		return -1;
	return (X % mod + mod) % mod;
}
vector<int> G[maxn];
int sz[maxn];
int fa[maxn];
void dfs(int u, int f) {
	sz[u] = 1;
	fa[u] = f;
	for (int i = 0; i < G[u].size(); i++) {
		int v = G[u][i];
		if (v == f)
			continue;
		dfs(v, u);
		sz[u] += sz[v];
	}
}
int p[maxn];
signed main() {
	int n;
	scanf("%lld", &n);
	for (int i = 1; i < n; i++) {
		int u, v;
		scanf("%lld%lld", &u, &v);
		G[u].push_back(v);
		G[v].push_back(u);
	}
	dfs(1, -1);
	int ans = 0;
	int inv2 = inv(2, mod);
	for (int i = 1; i <= n; i++) {
		int tot = G[i].size();
		if (G[i].size() == 1)
			continue;
		int now = 1;
		for (int j = 0; j < tot; j++) {
			int v = G[i][j];
			int siz = 0;
			if (v == fa[i])
				siz = n - sz[i];
			else
				siz = sz[v];
			p[j] = (1 - inv(pow_mod(2, siz, mod), mod) + mod) % mod; //点黑的概率
			now *= ((1 - p[j] + mod) % mod);
			now %= mod;
		}
		int cur = now;
		for (int j = 0; j < tot; j++) {
			cur += now * inv((1 - p[j] + mod) % mod, mod) % mod * p[j] % mod;
			cur %= mod;
		}
		ans += inv2 * (1 - cur + mod) % mod;
		ans %= mod;
	}
	cout << ans << endl;
	return 0;

}
