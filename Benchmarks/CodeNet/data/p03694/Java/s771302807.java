#include <bits/stdc++.h>
using namespace std;
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin>>n;
    int MAX=INT_MIN;
    int MIN=INT_MAX;
    int temp;
    for(int i=0;i<n;++i)
    {
        cin>>temp;
        MAX=max(MAX,temp);
        MIN=min(MIN,temp);
    }
    cout <<MAX-MIN<<endl;
    return 0;
}
