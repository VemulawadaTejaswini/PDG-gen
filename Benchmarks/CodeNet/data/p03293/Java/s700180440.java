#include <bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < n; i++)
using namespace std;

int main() {
    string s, t;
    bool flag = false;
    cin >> s >> t;
    rep(i, s.length()) {
        string temp = s.substr(i, s.length()) + s.substr(0, i);
        if(temp == t) flag = true;
    }
    if(flag) cout << "Yes" << endl;
    else cout << "No" << endl;
}