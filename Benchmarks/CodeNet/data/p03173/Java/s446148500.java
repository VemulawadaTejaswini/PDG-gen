#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll dp[401][401];
ll mx=10000000000000000ll;
int main()
{
    ll n;
    cin>>n;
    ll a[n+1];
    ll s[n+1];
    for(int i=1;i<=n;i++)
        cin>>a[i];
    s[0]=0;

    for(int i=1;i<=n;i++)
        s[i]=s[i-1]+a[i];

    for(int i=n;i>=1;i--)
    {
        dp[i][i]=0;
        for(int j=i+1;j<=n;j++)
        {
            dp[i][j]=mx;
            for(int k=i;k<j;k++)
                dp[i][j]=min(dp[i][j],s[j]-s[i-1]+dp[i][k]+dp[k+1][j]);
        }
    }
    cout<<dp[1][n]<<endl;
    return 0;
}
