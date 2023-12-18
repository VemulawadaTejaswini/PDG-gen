#include <bits/stdc++.h>
#define FOR(i,a,b) for(int i=(a);i<(b);++i)
#define REP(i,n)  FOR(i,0,n)
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;
    if(A <= C && C <= B) cout << "Yes" << endl;
    else cout << "No" << endl; 
    return 0;
}
