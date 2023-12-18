#include <bits/stdc++.h>
#include <vector> 
# include <cstdint>
#define FOR(i,l,r) for(int i=(l);i<(r);++i)
#define RFOR(i,l,r) for(int i=(l);i>=(int)(r);i--)
#define rep(i,n)  FOR(i,0,n)
#define rrep(i,n)  RFOR(i,n-1,0)

#define int long long
using namespace std;
const int MX = 1e6;
const int inf = 1e13;
const int mod = 1e9+7;
#define ll long long
double dp[3010][3010];
signed main() {
    int n;
    cin >> n;
    rep(i,n) {
        double p;
        cin >> p;
        double np = 1-p;
        if(i==0) {
            dp[0][0] = np;
            dp[0][1] = p;
            continue;
        }
        rep(j,i+2) {
            if(i==0) dp[i][j] = dp[i-1][0]*np;
            else if(i==i+1) dp[i][j] = dp[i-1][j-1]*p;
            else dp[i][j] = dp[i-1][j-1]*p+dp[i-1][j]*np;
        } 
    }
    double ans = 0;
    FOR(i,n/2+1,n+1) {
        ans += dp[n-1][i];
        //cout << dp[n-1][i] << endl;
    }
    cout << setprecision(20)<<ans << endl;
  return 0;
}

