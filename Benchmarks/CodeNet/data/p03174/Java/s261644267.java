#include <bits/stdc++.h>
using namespace std;

const int mxn = 21;
int dp[mxn + 1][1 << mxn], a[mxn][mxn];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) cin >> a[i][j];
    dp[0][0] = 1;
    for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) if (a[i][j]) for (int mask = 0; mask < 1 << n; ++mask) if (!(mask & (1 << j))) {
        dp[i + 1][mask | (1 << j)] += dp[i][mask];
        dp[i + 1][mask | (1 << j)] %= 1000000007;
    }
    cout << dp[n][(1 << n) - 1] << endl;
}