#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using pint = pair<int, int>;
#define REP(i, n) for(int i = 0; i < (int)(n); i++)
#define IREP(i, n) for(int i = (int)(n) - 1; i >= 0; i--)
#define ALL(x) (x).bigin(), (x).end()
#define MOD 1000000007
#define IMAX INT_MAX
#define IMIN INT_MIN
#define LMAX LLONG_MAX
#define LMIN LLONG_MIN
template<typename T> inline void chmin(T &a, T b){ if(a > b) a = b; }
template<typename T> inline void chmax(T &a, T b){ if(a < b) a = b; }
template<typename T> inline void xch(T &a, T &b){ T w = a; a = b; b = w; }

int main() {
    int n, k;
    cin >> n >> k;
    char s[n];
    cin >> s;
    s[k - 1] += 32;
    cout << s << endl;
    return 0;
}





