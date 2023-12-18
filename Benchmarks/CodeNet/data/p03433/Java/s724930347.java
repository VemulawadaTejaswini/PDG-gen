#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
    int n, a, cnt;
    cin >> n >> a;
    if (n < 500)
    {
        cnt = n;
    }
    else
    {
        cnt += n % 500;
    }
    if (cnt <= a)
    {
        cout << "Yes" << endl;
    }
    else
    {
        cout << "No" << endl;
    }
}
