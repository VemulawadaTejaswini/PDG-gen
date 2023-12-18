#include<iostream>
#include <algorithm>
#include <string>
#include<math.h>
#define rep(i,n)for(int i=0;i<n;i++)
using namespace std;
int main() {
    char a, b;
    cin >> a >> b;
    if (a == b) {
        cout << "=" << endl;
    }
    else if (a < b) {
        cout << "<" << endl;
    }
    else {
        cout << ">" << endl;
    }
    return 0;
}