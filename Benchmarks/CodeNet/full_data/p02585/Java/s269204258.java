#include <bits/stdc++.h>

#define ll long long

using namespace std;

int main() {
	int n, k; cin >> n >> k;
	vector<int> p(n + 1), c(n + 1);
	for (int i = 1; i <= n; ++i) cin >> p[i];
	for (int i = 1; i <= n; ++i) cin >> c[i];
	
	ll res = 0;
	vector<ll> sc(n+1);
	for (int i = 1; i <= n; ++i) {
		int next = p[i], step = k, cnt = 0;
		vector<bool> visit(n+1);
		while (step > 0) {
			sc[i] += c[next];
			++cnt;
			--step;
			if (i == next) {
				step = k % cnt;
				sc[i] *= k / cnt;
			}
			next = p[next];
		}
		res = max(res, sc[i]);
	}
	cout << res;
}