#include <stdio.h>
#include <math.h>
#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
#include <string>
#include <map>
using namespace std;
typedef long long int lli;
#define urept(soeji, start, n) for (int soeji = start; soeji < n; soeji++)
#define drept(soeji, start, n) for (int soeji = start; soeji > n; soeji--)
int main(void)
{
    int N;
    cin >> N;
    long int tmp;
    vector<long int> A;
    for (int i = 0; i < N; i++)
    {
        cin >> tmp;
        A.push_back(tmp);
    }
    sort(A.begin(), A.end());
    decltype(A)::iterator result = unique(A.begin(), A.end());
    A.erase(result, A.end());
    if (A.size() < N)
    {
        cout << "NO" << endl;
    }
    else
    {
        cout << "YES" << endl;
    }
    return 0;
}