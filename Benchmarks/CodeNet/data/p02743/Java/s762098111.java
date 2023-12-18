#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <vector>
#include <cmath>
#include <queue>
using namespace std;
#define mem(a,b) memset(a,b,sizeof(a))
typedef long long ll;
typedef pair<int,int> PII;


int main(){
    ll a, b, c;
    cin >> a >> b >> c;
    ll x = (c - a - b) * (c - a - b);
    ll y = 4 * a * b;
    if(x > y) cout << "Yes" << endl;
    else cout << "No" << endl;
    return 0;
}