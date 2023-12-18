#include<map>
#include<set>
#include<unordered_map>
#include<bitset>
#include<cstdio>
#include<iostream>
#include<algorithm>
#include<vector>
#include<queue>
#include<string>
#include<chrono>
#include<stack>
#include<fstream>
#include<list>
#define REP(i,x,y) for(ll i=x;i<=y;i++)
#define SIZE(a) ll(a.size())
#define vll vector<ll> 
#define MEMSET(a, n, m) for(ll i=0;i<=n;i++) a[i] = m
#define BIT(n) (ll(1)<<n)
#define UNIQUE(v) v.erase(unique(v.begin(),v.end()),v.end()) 
#define UNIQUE_ARRAY(a,n) n = unique(a + 1, a + x + 1) - a - 1
#define SORT(a,n) sort(a+1,a+n+1)
#define SORT_O(a,n,order) sort(a+1,a+n+1,order)
#define PER(i,y,x) for(ll i=y;i>=x;i--)
typedef long long ll;
using namespace std;


struct edge
{
	long long to; long long len;
	bool operator<(const edge& rhs) const {
		return len > rhs.len;
	}
};

ll const MAX = 200005;
ll a[MAX], b[MAX];
ll n;

bool ok(ll mid) {
	unordered_map<ll, ll> mp;
	stack<ll> st;
	st.push(0);
	REP(i, 1, n) {
		ll cur = b[i];
		if (cur == -1) continue;
		while (st.top() > cur) {
			ll t = st.top();
			st.pop();
			mp[t] = 0;
		}
		if (st.top() < cur) {
			st.push(cur);
		}
		mp[cur]++;
		ll uuu = cur;
		while (mp[uuu] >= mid) {
			mp[uuu] = 0;
			uuu--;
			mp[uuu]++;
			if (uuu <= 0) {
				return false;
			}
		}
	}
	return true;
}

int main() {
	cin >> n;
	REP(i, 1, n) {
		cin >> a[i];
	}
	bool flag = 1;
	REP(i, 1, n - 1) {
		if (a[i] >= a[i + 1]) {
			flag = 0;
		}
	}
	if (flag) {
		cout << 1 << endl;
		return 0;
	}

	ll cur = 0;
	REP(i, 1, n) {
		if (cur >= a[i]) {
			b[i] = a[i];
		}
		else {
			b[i] = -1;
		}
		cur = a[i];
	}
	ll lb = 1; ll ub = 200005;
	while (ub > lb + 1) {
		ll mid = (ub + lb) / 2;
		if (ok(mid)) {
			ub = mid;
		}
		else {
			lb = mid;
		}
	}
	cout << ub << endl;
}

