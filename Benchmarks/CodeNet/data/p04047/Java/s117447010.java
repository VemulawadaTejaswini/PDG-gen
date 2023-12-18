#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    vector<int> l(n * 2);
    for(int i = 0; i < n * 2; i++){
        cin >> l[i];
    }
    sort(l.begin(), l.end());
    int ans = 0;
    for(int i = n * 2 - 2; i >= 0; i -= 2)
        ans += l[i];
    cout << ans << endl;
}