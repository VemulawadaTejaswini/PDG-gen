#include <bits/stdc++.h>
using namespace std;

map<string, bool> m;

long long palin(string str, int n)
{
	long long cnt = 1;
	string dp[n+5][n+5];
	m[str] = true;
	for (int i=0;i<n;++i) dp[i][i] = str;
	for (int i=0;i<n-1;++i)
	{
		dp[i][i+1] = str;
		swap(dp[i][i+1][i], dp[i][i+1][i+1]);
		if (!m[dp[i][i+1]])
		{
			m[dp[i][i+1]] = true;
			++cnt;
		}
	}
	for (int gap=2;gap<n;++gap)
	{
		for (int i=0;i<n-gap;++i)
		{
			int j = gap+i;
			dp[i][j] = dp[i+1][j-1];
			swap(dp[i][j][i], dp[i][j][j]);
			if (!m[dp[i][j]])
			{
				m[dp[i][j]] = true;
				++cnt;
			}
		}
	}
	return cnt;
}

int main()
{
	string a;
	cin >> a;
	int n = a.size();
	cout << palin(a, n) << endl;
	return 0;
}