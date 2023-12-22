#include <bits/stdc++.h>

//#define int long long

using namespace std;

signed main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int x, y;
    cin >> x >> y;
    if (2*x > y) {
        cout << "No\n";
        exit(0);
    }
    y -= 2*x;
    if (y%2==0 && y <= x) {
        cout << "Yes\n";
    } else {
        cout << "No\n";
    }
}
/*

 */
