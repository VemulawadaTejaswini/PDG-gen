#include <bits/stdc++.h>

using namespace std;

int main()
{
    int x,a,b;
    cin >> x >> a >> b;
    int c=x-a;
    int d=c/b;
    cout << c-b*d << endl;
    return 0;
}