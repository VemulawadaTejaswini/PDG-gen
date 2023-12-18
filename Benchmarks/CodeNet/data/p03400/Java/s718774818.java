#include <bits/stdc++.h>

using namespace std;

int main(){
    int n, d, x;
    cin >> n >> d >> x;
    int a[n];
    for(int i = 0; i < n; ++i) cin >> a[i];
    int c = 0;
    for(int i = 0; i < n; ++i){
        c += d / a[i] + 1;
        if(d % a[i] == 0) c--;
    }
    cout << c + x << endl;
}