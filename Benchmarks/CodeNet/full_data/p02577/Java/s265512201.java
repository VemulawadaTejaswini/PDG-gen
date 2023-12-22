#include <bits/stdc++.h>
using namespace std;
using ll = long long;

constexpr char NL = '\n';
constexpr int MOD = 1e9 + 7;

struct safe_hash {
    static uint64_t splitmix64(uint64_t x) {
        x += 0x9e3779b97f4a7c15;
        x = (x ^ (x >> 30)) * 0xbf58476d1ce4e5b9;
        x = (x ^ (x >> 27)) * 0x94d049bb133111eb;
        return x ^ (x >> 31);
    }

    size_t operator()(uint64_t x) const {
        static const uint64_t FIXED_RANDOM = chrono::steady_clock::now().time_since_epoch().count();
        return splitmix64(x + FIXED_RANDOM);
    }
};

void solve()
{
    string n; cin >> n;
    int val = 0;
    for (char c : n) {
        val += c - '0';
    }
    cout << (val % 9 == 0 ? "Yes" : "No") << NL;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}