#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace std;
using namespace __gnu_pbds;
typedef long long ll;
typedef double db;
typedef vector <ll> vll;
typedef pair <ll, ll> pll;
#define pb push_back
#define mp make_pair
#define MAX 1000000
#define mod 1000000007
#define all(_) _.begin(), _.end()
#define F first
#define S second
#define ordered_set tree<int, null_type,less<int>, rb_tree_tag,tree_order_statistics_node_update>
vll g[MAX];
ll c[MAX];
bool vis[MAX];
map <pll, bool> pr;
vector <pll> ed;
void dfs(ll cur, ll par)
{
    vis[cur] = true;
    for(auto x : g[cur])
    {
        if(x == par)
            continue;
        if(!vis[x])
            dfs(x, cur);
        else
        {
            if(!pr[mp(x, cur)])
            {
                ed.pb(mp(cur, x));
                c[cur]++;
                pr[mp(x, cur)] = true;
                pr[mp(cur, x)] = true;
            }
        }
    }
    if(par != -1)
    {
        if(c[cur] % 2)
            ed.pb(mp(cur, par)), c[cur]++;
        else
            ed.pb(mp(par, cur)), c[par]++;
    }
}
int main()
{
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL), cout.tie(NULL);
    ll n, i, u, v, m;
    cin >> n >> m;
    for(i = 0; i < m; i++)
    {
        cin >> u >> v;
        g[u].pb(v);
        g[v].pb(u);
    }
    if(m % 2 != 0)
    {
        cout << -1 << endl;
        return 0;
    }
    dfs(1, -1);
    for(auto x : ed)
        cout << x.F << ' ' << x.S << endl;
    return 0;
}