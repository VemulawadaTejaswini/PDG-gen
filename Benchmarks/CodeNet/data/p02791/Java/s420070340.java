#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int p[n];
    for(int i = 0; i < n; i++) cin >> p[i];
    int out;
    out = n;
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            if(p[i] > p[j]){
                out--;
                break;
            }
        }
    }
    cout << out << endl;
}