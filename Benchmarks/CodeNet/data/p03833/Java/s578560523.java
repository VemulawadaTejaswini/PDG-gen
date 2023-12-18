//通ったことにする。糞問。

#include <cstdio>
#include <algorithm>
 
#define Rep(i, n) for (int i = 1; i <= n; i ++)
#define Rep0(i, n) for (int i = 0; i <= n; i ++)
#define RepG(i, x) for (int i = head[x]; i; i = edge[i].next)
 
using namespace std;
 
typedef long long LL;
 
const int N = 5010;
const int M = 210;
 
int n, m, b[N][M], a[N], st[N], nxt[M][N], f[M];
 
LL sa[N];
 
struct T{ LL x, tg;} t[N * 4];
 
void up(int x) { t[x].x = max(t[x << 1].x, t[x << 1 | 1].x);}
 
void pushdown(int x)
{	
	t[x << 1].x += t[x].tg, t[x << 1 | 1].x += t[x].tg;
	t[x << 1].tg += t[x].tg, t[x << 1 | 1].tg += t[x].tg;
	t[x].tg = 0; 
}
 
void modify(int x, int l, int r, int l0, int r0, LL c)
{
	if (l0 <= l && r <= r0){
		t[x].x += c, t[x].tg += c;
		return;
	}
	pushdown(x);
	int mid = (l + r) >> 1;
	if (l0 <= mid) modify(x << 1, l, mid, l0, r0, c);
	if (r0 > mid) modify(x << 1 | 1, mid + 1, r, l0, r0, c);
	up(x);
}
 
LL query(int x, int l, int r, int l0, int r0)
{
	if (l0 <= l && r <= r0) return t[x].x;
	pushdown(x);
	int mid = (l + r) >> 1; LL ret = -1e18;
	if (l0 <= mid) ret = query(x << 1, l, mid, l0, r0);
	if (r0 > mid) ret = max(query(x << 1 | 1, mid + 1, r, l0, r0), ret);
	return ret;
}
 
int main()
{
	//freopen("bar.in", "r", stdin);
	//freopen("bar.out", "w", stdout);
	
	scanf("%d%d", &n, &m);
	
	for (int i = 2; i <= n; i ++) scanf("%d", &a[i]);
	Rep(i, n) Rep(j, m) scanf("%d", &b[i][j]);
	
	Rep(k, m) {
		int top = 0;
		for (int i = n; i; i --) {
			while (top && b[st[top]][k] <= b[i][k]) top --;
			if (top) nxt[k][i] = st[top];
			else nxt[k][i] = n + 1;
			st[++ top] = i;
		}
	}
	
	Rep(i, n) {
		LL sum = 0;
		Rep(k, m){
			f[k] = max(f[k], b[i][k]);
			sum += f[k];
		}
		sa[i] = sa[i - 1] + a[i], sum -= sa[i];
		modify(1, 1, n, i, i, sum);
	}
	
	LL ans = query(1, 1, n, 1, n);
	
	Rep(i, n - 1) {
		Rep(k, m) for (int j = i + 1; j != nxt[k][i]; j = nxt[k][j])
			modify(1, 1, n, j, nxt[k][j] - 1, b[j][k] - b[i][k]);
		LL tmp = query(1, 1, n, i + 1, n) + sa[i + 1];
		ans = max(ans, tmp);
	}
	
	printf("%lld\n", ans);
	
	return 0;
}