#include <bits/stdc++.h>

//#define int long long

using namespace std;

signed main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int res = -1;
    for (int i = 1; i <= 5; i++) {
        int x;
        cin >> x;
        if (x == 0) res = i;
    }
    cout << res << '\n';
}
/*

 */
