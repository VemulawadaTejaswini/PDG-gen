#include <bits/stdc++.h>
using namespace std;

void solve()
{
    string s;
    cin >> s;
    int c = 0;
    for (int i = 0; i < s.size() - 4; i++)
    {
        for (int j = i + 3; j < s.size(); j++)
        {
            unsigned long long x = stoull(s.substr(i, j + 1), nullptr, 10);
            if (x % (unsigned long long)2019 == 0)
                c++;
            if (j - i > 10)
                break;
        }
    }
    cout << c;
}
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    solve();
    return 0;
}