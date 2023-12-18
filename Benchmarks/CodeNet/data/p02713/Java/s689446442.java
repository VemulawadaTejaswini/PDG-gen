#include "bits/stdc++.h"
using namespace std;
typedef long long ll;
// const ll INF = 1e18;
# define rep(i, n) for(ll i=0, i##_len=(n); i<i##_len; ++i)
# define reps(i, n) for(ll i=1, i##_len=(n); i<=i##_len; ++i)
# define rrep(i, n) for(ll i=((int)(n)-1); i>=0; --i)
# define rreps(i, n) for(ll i=((int)(n)); i>0; --i)
# define all(x) (x).begin(), (x).end()

ll N;

int Main() {
    cin >> N;
    ll sum = 0;
    reps(i, N) {
        reps(j, N) {
            reps(k, N) {
                sum += gcd(i,gcd(j,k));
            }
        }
    }
    
    cout << sum << endl;
    return 0;
}

int main(){ios::sync_with_stdio(0);cin.tie(0);Main();return 0;}
