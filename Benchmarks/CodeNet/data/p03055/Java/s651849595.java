#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define mp make_pair
#define pb push_back
#define x first
#define y second
#define pii pair<int, int>
#define p3i pair<pii, int>
#define pll pair<ll, ll>
#define p3l pair<pll, ll>
#define vi vector<int>
#define vpii vector<pii>
#define vp3i vector<p3i>
#define vpll vector<pll>
#define vp3l vector<p3l>
#define lseg L, (L+R)/2, N*2+1
#define rseg (L+R)/2+1, R, N*2+2
#define ub upper_bound
#define lb lower_bound
#define pq priority_queue
#define MN 1000000007
#define fox(k, x) for (int k=0; k<x; ++k)
#define fox1(k, x) for (int k=1; k<=x; ++k)
#define foxr(k, x) for (int k=x-1; k>=0; --k)
#define fox1r(k, x) for (int k=x; k>0; --k)
#define ms multiset
#define flood(x) memset(x, 0x3f3f3f3f, sizeof x)
#define drain(x) memset(x, 0, sizeof x)
#define rng() ((rand() << 14)+rand())
#define scan(X) do{while((X=getchar())<'0'); for(X-='0'; '0'<=(_=getchar()); X=(X<<3)+(X<<1)+_-'0');}while(0)
char _;
#define pi 3.14159265358979323846

int n, x, y;
pii ed;
vector<int> v[200005];
void dfs(int N, int P, int D){
  ed = max(mp(D, N), ed);
  fox(l, v[N].size()){
    if (v[N][l]==P) continue;
    dfs(v[N][l], N, D+1);
  }
}
int32_t main(){
  scanf("%i", &n);
  fox(l, n-1){
    scanf("%i%i", &x, &y);
    v[x].pb(y);
    v[y].pb(x);
  }
  ed = mp(-1, -1);
  dfs(1, -1, 1);
  ed.x = -1;
  dfs(ed.y, -1, 1);
  if (ed.x%3 == 2) printf("Second");
  else printf("First");
  return 0;
}
