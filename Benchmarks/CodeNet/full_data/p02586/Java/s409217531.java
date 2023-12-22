#include <bits/stdc++.h>
using namespace std;
 
using ll = long long;
using ld = long double;
using vi = vector<int>;
using vvi = vector<vector<int>>;
using vvvi = vector<vector<vector<int>>>;
using vl = vector<ll>;
using vvl = vector<vector<ll>>;
using vvvl = vector<vector<vector<ll>>>;
using vs = vector<string>;
using vb = vector<bool>;
#define FOR(i, m, n) for (int i = (m); i < (n); i++)
#define FORR(i, m, n) for (int i = (m); i >= (n); i--)
#define REP(i, n) FOR(i, 0, (n))
#define REPR(i, n) FORR(i, (n) - 1, 0)
#define REP1(i, n) FOR(i, 1, (n) + 1)
#define REPS(c, s) for (char c : s)
#define ALL(c) (c).begin(), (c).end()
#define SORT(c) sort(ALL(c))
#define REV(c) reverse(ALL(c))
#define sz(v) (int)v.size()
#define endl '\n'
template<class T> inline bool chmin(T& a, T b) {if (a > b) {a = b; return true;} return false;}
template<class T> inline bool chmax(T& a, T b) {if (a < b) {a = b; return true;} return false;}
template<class T> inline void prn(vector<T>& v) {int n = sz(v); REP(i, n) cout << v[i] << ' ';}
template<class T> inline void printv(vector<T>& v) {int n = sz(v); REP(i, n) cout << v[i] << (i == n - 1 ? endl : ' ');}
template<class T> inline void printvv(vector<vector<T>>& v) {for (auto u : v) printv(u);}
template<class T> inline void printlnv(vector<T>& v) {int n = sz(v); REP(i, n) cout << v[i] << endl;}
const int MOD = 1000000007;
const int INF = 1000000001;
const ll LINF = 1000000001000000001LL;
 
void solve();
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout << fixed << setprecision(numeric_limits<double>::max_digits10);
    solve();
    return 0;
}

void solve() {
    int r, c, k;
    cin >> r >> c >> k;
    vvl g(r, vl(c, 0));
    int y, x;
    ll v;
    REP(i, k) {
        cin >> y >> x >> v;
        y--;
        x--;
        g[y][x] = v;
    }
    vvl dp(r, vl(c));
    function<ll(int, int, int)> rec = [&](int h, int w, int t) {
        if (h == r - 1 and w == c - 1) return x;
        if (h + 1 < r) {
            if (chmax(dp[h + 1][w], dp[h][w])) rec(h + 1, w, 0);
            if (g[h + 1][w] > 0) if (chmax(dp[h + 1][w], dp[h][w] + g[h + 1][w])) rec(h + 1, w, 1);
        }
        if (w + 1 < c) {
            if (chmax(dp[h][w + 1], dp[h][w])) rec(h, w + 1, 0);
            if (g[h][w + 1] > 0) if (chmax(dp[h][w + 1], dp[h][w] + g[h][w + 1])) rec(h, w + 1, 1);
        }
    };
    rec(0, 0, 0);
    cout << dp[r - 1][c - 1] << endl;
}