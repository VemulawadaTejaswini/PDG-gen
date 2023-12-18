#include <bits/stdc++.h>
using namespace std;
#define mod 1000000007
int main()
{
    long long int n,a[51][51],i,j,k,x,y,z,l;
    cin>>n>>k;
    for(i=0;i<n;i++)for(j=0;j<n;j++)cin>>a[i][j];
    vector<long long int >dp(n,1);
    for(i=0;i<k;i++)
    {
        vector<long long int>new_dp(n,0);
        for(j=0;j<n;j++)
        {
            for(l=0;l<n;l++)
            {
                if(a[j][l])
                new_dp[l]=(new_dp[l]+dp[j]+mod)%mod;
            }
        }
        dp=new_dp;
    }
    long long int ans=0;
    for(i=0;i<n;i++)
    ans=(ans+dp[i]+mod)%mod;
    cout<<ans;
    return 0;
}