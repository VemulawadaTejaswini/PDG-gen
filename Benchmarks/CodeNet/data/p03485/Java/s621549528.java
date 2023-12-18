#include<iostream>
#include <algorithm>
#include <string>
#include<math.h>
#define rep(i,n)for(int i=0;i<n;i++)
using namespace std;
int main() {
    int a, b;
    cin >> a >> b ;
    cout << (a%b==0?a/b:a/b+1) << endl;
    return 0;
}