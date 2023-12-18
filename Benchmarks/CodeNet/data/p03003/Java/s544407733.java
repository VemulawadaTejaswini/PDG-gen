#include <iostream> // cin, cout, cerr, clog
#include <algorithm> // minmax, sort, swap
#include <numeric> // iota, accumulate, inner_product
#include <cstdio> // printf, scanf
#include <climits> // INT_MIN, LLONG_MIN
#include <cmath> // long, trig, pow
#include <string> // string, stoi, to_string
#include <vector> // vector
#include <queue> // queue, priority_queue
#include <stack> // stack
#include <map> // key-value pairs sorted by keys
#include <set> // set
#include <unordered_map> // hashed by keys
#include <unordered_set> // hashed by keys
#include <iomanip> // cout<<setprecision(n)

#define rep(i,n) for(int i = 0; i < n; i++)
#define ENDL "\n"
#define print(i) std::cout << (i) << "\n"

#define int long long // at least int64 > 9*10^18
#define all(v) v.begin(), v.end()

const int MOD = 1e9+7;

int pow(int v, int k){
	int res(1),tmp(v);
	while(k){
		if(k&1) res=(res*tmp)%MOD;
		tmp=(tmp*tmp)%MOD;
		k>>=1;
	}
	return res;
}

signed main() {
	int n,m;
	std::cin >> n >> m;
	std::vector<int> s(n);
	rep(i,n) std::cin >> s[i];
	std::vector<int> t(m);
	rep(i,m) std::cin >> t[i];
	std::vector<std::vector<int> > dp(n+1,std::vector<int>(m+1,0));
	rep(i,n)rep(j,m) {
		dp[i+1][j+1] = std::max(dp[i+1][j],dp[i][j+1]);
		if(s[i]==t[j]) dp[i+1][j+1] = dp[i][j]+1;
	}
	print(pow(2,dp[n][m]));
  return 0;
}
