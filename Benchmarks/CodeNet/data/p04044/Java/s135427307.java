#include<iostream>
#include <algorithm>
#include <string>
#include<math.h>
#include<stdio.h>
#include<vector>
#define rep(i,n)for(int i=0;i<n;i++)
//printf("%.yf\n",x); xを小数点以下y桁で
using namespace std;
int main() {
    int a, b;
    cin >> a >> b;
    vector<string>data(a);
    rep(i, a) {
        cin >> data[i];
    }
    sort(data.begin(), data.end());
    rep(i, a) {
        cout << data[i];
    }
    cout << endl;
   return 0;
}
