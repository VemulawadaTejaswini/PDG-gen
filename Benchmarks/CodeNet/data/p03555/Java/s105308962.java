#include<iostream>
#include <algorithm>
#include <string>
#include<math.h>
#define rep(i,n)for(int i=0;i<n;i++)
using namespace std;
int main() {
    string a, b;
    cin >> a >> b;
    if (a[0] == b[2] && a[1] == b[1] && a[2] == b[0]) {
        cout << "YES" << endl;
    }
    else {
        cout << "NO" << endl;
    }
    return 0;
}