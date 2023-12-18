#include <bits/stdc++.h>
using namespace std;

#define rep(i,x,y) for(ll i=(x);i<(y);i++)
#define rrep(i,x,y) for(ll i=(ll)(y)-1;i>=(x);i--)
#define all(x) (x).begin(),(x).end()
#ifdef LOCAL
#define dump(x)  cerr << #x << " = " << (x) << endl
#define debug(x) cerr << #x << " = " << (x) << " (L" << __LINE__ << ")" << " " << __FILE__ << endl
#define dassert(...) assert(__VA_ARGS__)
#else
#define dump(x)
#define debug(x)
#define dassert(...)
#endif
//#define int long long

typedef long long ll;
const ll MOD = 1e9 + 7;
const long double EPS = 1e-8;

void solve(long long N, std::vector<long long> A){
    vector<vector<ll>> dp(2001, vector<ll>(2001, 0));
    vector<pair<ll, int>> a(N);
    rep(i,0,N) a[i] = {A[i], i};
    sort(all(a), greater<>());
    ll answer = 0;
    rep(i,0,N+1) rep(j,0,N-i+1) {
        ll lValue = 0, rValue = 0;
        if (i>0) lValue = dp[i-1][j] + a[i+j-1].first * abs((i-1)-a[i+j-1].second);
        if (j>0) rValue = dp[i][j-1] + a[i+j-1].first * abs((N-j)-a[i+j-1].second);
        dp[i][j] = max(lValue, rValue);
        answer = max(dp[i][j], answer);
    }
    cout << answer << endl;
}

signed main(){
    // ios_base::sync_with_stdio(false);
    // cin.tie(NULL);
    long long N;
    scanf("%lld",&N);
    std::vector<long long> A(N);
    for(int i = 0 ; i < N ; i++){
        scanf("%lld",&A[i]);
    }
    solve(N, std::move(A));
    return 0;
}
