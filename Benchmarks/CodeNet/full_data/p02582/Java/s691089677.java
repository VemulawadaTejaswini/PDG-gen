#include <bits/stdc++.h>
#define rep(i,n) for(int i = 0; i < (int)(n); ++i)
#define MOD 1000000007

using namespace std;
using ll = long long;

int main() {
	string n;
	int ans;
	cin >> n;
	if (n == "SSS") ans = 0;
	else if (n[1] == 'S') ans = 1;
	if (n == "RRR") ans = 3;
	if (n == "SRR" || n == "RRS") ans = 2;
	if (n == "SRS") ans = 1;

	cout << ans << endl;
	return 0;
}
