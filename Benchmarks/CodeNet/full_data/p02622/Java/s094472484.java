#include <bits/stdc++.h>

#define ll long long
using namespace std;

int main() {
    string s, t;
    cin>>s>>t;
    ll ans = 0;
    for (int i = 0; i <= s.length(); ++i) {
        if  (s[i] != t[i]){
            ans++;
        }
    }
    cout<<ans;
}