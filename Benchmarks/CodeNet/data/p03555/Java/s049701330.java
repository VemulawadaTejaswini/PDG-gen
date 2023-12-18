#include <bits/stdc++.h>
using namespace std;

int main() {
       string s, t;
       cin >> s >> t;
       if(s[0] == t[2] && s[2] == t[0] && s[1] == t[1]) cout << "YES" << endl;
       else cout << "NO" << endl;
       return 0;
}