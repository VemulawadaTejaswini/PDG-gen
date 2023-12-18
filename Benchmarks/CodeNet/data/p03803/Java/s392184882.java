#include<iostream>
#include <algorithm>
#include <string>
#define rep(i,n)for(i=0;i<n;i++)
using namespace std;
int main() {
	int a,b;
    cin >> a >> b;
    if (a == b) {
        cout << "Draw" << endl;
    }
    else if (a == 1) {
        cout << "Alice" << endl;
    }
    else if (b == 1) {
        cout << "Bob" << endl;
    }
    else {
        if (a > b) {
            cout << "Alice" << endl;
        }
        else {
            cout << "Bob" << endl;
        }
    }
	return 0;
}
