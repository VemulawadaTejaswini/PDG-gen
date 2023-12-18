#include<bits/stdc++.h>
#define rep(i,n) for(int i=0; i<n; i++)
#define rrep(i,n) for(int i=n-1; i>=0; i--)

using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef pair<int,int> pi;
typedef long double lb;

const int INF=1<<27;
const int MOD=(int)1e9+7;

int main(void)
{
    int n, m;
    ll x[100010];
    ll y[100010];
    cin >> n >> m;
    rep(i,n) cin >> x[i];
    rep(i,m) cin >> y[i];
    ll sum_x = 0;
    ll sum_y = 0;
    rep(i,n){
        sum_x += (2*(i+1) - n - 1) * x[i];
        sum_x %= MOD;
    }
    rep(i,m){
        sum_y += (2*(i+1) - m - 1) * y[i];
        sum_y %= MOD;
    }
    ll ans = (sum_x * sum_y) % MOD;
    cout << ans << endl;
    return 0;
}

