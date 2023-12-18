#pragma GCC optimize ("O3")
#pragma GCC target ("sse4")

#include <bits/stdc++.h>

using namespace std;
 
typedef long long ll;
typedef long double ld;
typedef complex<ld> cd;

typedef pair<int, int> pi;
typedef pair<ll,ll> pl;
typedef pair<ld,ld> pd;
typedef pair<int, pi> pii;

typedef vector<int> vi;
typedef vector<ld> vd;
typedef vector<ll> vl;
typedef vector<pi> vpi;
typedef vector<pl> vpl;
typedef vector<cd> vcd;

#define fax(i, a) for (int i = 0; i < (a); i++)
#define f0x(i, a, b) for (int i = (a); i < (b); i++)
#define faxd(i,a,b) for (int i = (b)-1; i >= (a); i--)
#define f0xd(i,a) for (int i = (a)-1; i >= 0; i--)
#define trav(a, x) for (auto& a : x)
#define memeset memset

#define mp make_pair
#define pb push_back
#define f first
#define s second
#define lb lower_bound
#define ub upper_bound

#define sz(x) (int)x.size()
#define all(x) begin(x), end(x)
#define rsz resize

const int MOD = 1000000007; // 998244353
const ll INF = 1e18;
const int MX = 200005;
const ld PI = 4*atan((ld)1);

template<class T> void ckmin(T &a, T b) { a = min(a, b); }
template<class T> void ckmax(T &a, T b) { a = max(a, b); }
vector<int> adj[MX]; bool vis[MX];
void dfs(int v){
	vis[v] = true;
	for(int e : adj[v]){
		if(!vis[e]){
			dfs(e);
		}
	}
}
int main() {
   ios::sync_with_stdio(false);
   cin.tie(0);
	int n,m; cin >> n >> m;
	ll ans = 0;
	fax(i,m){
		int u,v,w; cin >> u >> v >> w;
		u--; v--;
		adj[u].pb(v); adj[v].pb(u);
	}
	fax(i,n){
		if(!vis[i]){
			dfs(i);
			++ans;
		}
	}
	cout << ans;
}
