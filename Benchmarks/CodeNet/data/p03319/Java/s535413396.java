#include <bits/stdc++.h>
using namespace::std;

#define all(x) (x).begin(), (x).end()
#define sz(x) (int)(x).size()

typedef long long ll;
typedef array<int, 3> tri;
typedef long double ld;

template <class T> istream& operator>>(istream& I, vector<T>& v) {for (T &e: v) I >> e; return I;}
template <class T> ostream& operator<<(ostream &O, const vector<T>& v) {for (const T &e: v) O << e << ' '; return O;}
template <class T1, class T2> ostream& operator<<(ostream &O, const pair<T1,T2>& p) {return O << '(' << p.first << ' ' << p.second << ')';}





void _main() {
        int n, k; cin >> n >> k;
        vector<int> a(n); cin >> a;
        int m = *min_element(all(a));
        int ans = n;
        for (int i = 0; i < n; i++) {
                if (a[i] == m) {
                        int cnt = 0;
                        for (auto j: {n - i}) {
                                cnt += (n - k + k - 2) / (k - 1);
                        }
                        ans = min(ans, cnt + 1);
                }
        }

        cout << ans;
}




signed main() {
        ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
//        freopen("input.txt", "r", stdin);
        int _t = 1;
//        cin >> _t;
        while (_t--) _main();
        return 0;
}