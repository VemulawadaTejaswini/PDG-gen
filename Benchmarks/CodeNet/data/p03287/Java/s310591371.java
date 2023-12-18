#include <bits/stdc++.h>
const int INF = 1e9;
const int MOD = 1e9+7;
const long long LINF = 1e18;
#define dump(x)  cout << 'x' << ' = ' << (x) << ` `;
#define FOR(i,a,b) for(int i=(a);i<(b);++i)
#define REP(i,n) for(int i=0;i<(n);++i)
#define REPR(i,n) for(int i=n;i>=0;i--)
#define FOREACH(x,a) for(auto& (x) : (a) )
typedef long long ll;
using namespace std;
int main(int argc, char const *argv[]) {
    int n, m;
    cin >> n >> m;
    vector<ll> a(n);
    vector<int> s(n);
    REP(i,n) cin >> a[i];
    s[0] = a[0]%m;
    for (int i = 1; i < n; ++i) s[i] += ((s[i-1]+a[i])%m);
    sort(s.begin(), s.end());
    map<ll, ll> mp;
    ll ans = 0;
    REP(i,n) {
        if (s[i] == 0) ans++;
        mp[s[i]]++;
    }
    for (auto x: mp) ans += (x.second*(x.second-1))/2;
    cout << ans << endl;
    return 0;
}