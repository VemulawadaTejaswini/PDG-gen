#include <bits/stdc++.h>
using namespace std;
int main(){
    int x, a, b;
    cin >> x >> a >> b;
    string ans;
    if(b - a > x) ans = "dangerous";
    else if(b - a <= x && b-a > 0) ans = "safe";
    else ans = "delicious";
    cout << ans;
}