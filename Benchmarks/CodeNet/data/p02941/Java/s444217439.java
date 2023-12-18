#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cout.precision(12);
    cout << fixed;

    int n;
    cin >> n;
    vector<int> a(n), b(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> b[i];
    }
    set<pair<int, int> > s;
    for (int i = 0; i < n; i++) {
        s.insert({b[i], i});
    }
    long long ans = 0;
    while (!s.empty()) {
        auto p = *s.rbegin();
        s.erase(p);
        int x = p.first;
        int i = p.second;
        if (a[i] > b[i]) {
            cout << -1 << endl;
            return 0;
        }
        if (a[i] == b[i]) {
            continue;
        }
        int i0 = (i+n-1)%n;
        int i1 = (i+1)%n;
        int once = (b[i0] + b[i1]);
        int mx = max(b[i0], b[i1]);
        mx = max(mx, a[i]);
        int need = b[i] - mx;
        if (need < 0) {
            cout << -1 << endl;
            return 0;
        }
        int times = (need + once - 1) / once;
        ans += times;
        b[i] -= once * times;
        if (b[i] < a[i]) {
            cout << -1 << endl;
            return 0;
        }
        if (b[i] > a[i]) {
            s.insert({b[i], i});
        }
    }
    cout << ans << endl;

    return 0;
}
