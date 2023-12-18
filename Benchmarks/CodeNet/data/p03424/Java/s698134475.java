#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <string>
#include <algorithm>
#include <vector>
#include <set>
#include <map>
#include <list>
using namespace std;

#define MOD 1000000007
#define p(x) cout << x << endl;
#define el cout << endl;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)

int main(){
    cin.tie(0);
    ios::sync_with_stdio(false);
    
    int n;
    cin >> n;
    char s[n];
    rep(i, n) cin >> s[i];

    set<char> set;
    rep(i, n) set.insert(s[i]);

    if(set.size() == 4){
        p("Four");
    }else{
        p("Three");
    }
}
