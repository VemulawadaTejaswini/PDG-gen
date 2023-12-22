#include <bits/stdc++.h>

using namespace std;

typedef vector<int> vi;
typedef pair<int, int> ii;
typedef vector<ii> vii;
typedef long long ll;
typedef unsigned long long ull;

#define faster ios_base::sync_with_stdio(false);cin.tie(nullptr);cout.tie(nullptr);
#define debug(x) cout<<#x<<" = "<<(x)<< endl
#define nl "\n"
#define sp " "

const ll MOD = 1000000007;
ll n, a, b, pw[int(2e5 + 10)];
map<pair<ll,ll>, pair<ll, ll> > mp;

ll fix(ll x){
	return (x % MOD + MOD) % MOD;
}

int main() {
	faster
	cin >> n;
	pw[0] = 1;
	for(int i = 1; i <= n; i++){
		pw[i] = fix(2 * pw[i - 1]);
	}

	ll ans = 1, zero = 0;
	for(int i = 0; i < n; i++){
		cin >> a >> b;
		if(a == 0 && b == 0){
			zero++;
			continue;
		}

		ll g = __gcd(a,b);
		a /= g, b /= g;

		if(a < 0){
			a *= -1, b *= -1;
		}

		if(b > 0){
			mp[{a, b}].first++;
		}else{
			mp[{-b, a}].second++;
		}
	}

	for(auto it : mp){
		ans *= pw[it.second.first] + pw[it.second.second] - 1;
		ans = fix(ans);
	}

	cout << fix(ans + zero - 1) << nl;
}
