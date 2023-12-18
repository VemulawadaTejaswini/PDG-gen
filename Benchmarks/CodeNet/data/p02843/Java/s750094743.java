#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
typedef pair<int, int> P;

int main() {
	int x;
	cin >> x;
	vector<bool> dp(x + 1);
	dp[0] = true;
	dp[100] = true;
	dp[101] = true;
	dp[102] = true;
	dp[103] = true;
	dp[104] = true;
	dp[105] = true;
	for(int i = 105; i <= x; i++){
		dp[i] = dp[i - 100] | dp[i - 101] | dp[i - 102] | dp[i - 103] | dp[i - 104] | dp[i - 105];
	}
	cout << dp[x] << endl;
}
