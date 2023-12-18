//#pragma GCC optimize("O3")
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

const ll mod = 1000000007;

int gcd (int x, int y) {
    if (x < y) {
        return gcd(y, x);
    }
    if (y > 0) {
        return gcd(y, x % y);
    }
    return x;
}

ll todeg (ll x, ll deg) {
    if (deg < 0) {
        deg += (mod - 1);
    }
    if (deg == 0) {
        return 1;
    }
    ll ans = todeg(x, deg / 2);
    ans *= ans;
    ans %= mod;
    if (deg % 2 == 1) {
        ans *= x;
    }
    ans %= mod;
    return ans;
}

int main()
{
    /*ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);*/

    ll h, w, t;
    cin >> h >> w >> t;
    ll h1 = h / gcd(h, t);
    ll w1 = w / gcd(w, t);
    ll smolspos = (todeg(2, h1) + todeg(2, w1) + mod - 1) % mod;
    if (h1 % w1 == 0 || w1 % h1 == 0) {
        smolspos += 2;
    }
    cout << todeg(smolspos, (h / h1 * w / w1) % mod) << '\n';
    return 0;
}
