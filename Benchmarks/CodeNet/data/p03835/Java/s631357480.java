#include <bits/stdc++.h>
using namespace std;

#define int long long

int K, S, ans = 0;

signed main() {
    cin >> K >> S;
    for (int i = 0; i <= K; i++) {
        for (int j = 0; j <= K; j++) {
            if (S >= i + j && S - i - j <= K) {
                ans++;
            }
        }
    }
    cout << ans << endl;
    return 0;
}
