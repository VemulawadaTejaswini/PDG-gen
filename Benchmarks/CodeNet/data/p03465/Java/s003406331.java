#include <bits/stdc++.h>
#define pii pair<int,int>
#define pll pair<ll,ll>
#define fr first
#define sc second
#define ll  long long
#define mp make_pair
#define mod 1000000007

using namespace std;

ll dp[2001*2001+100];
ll x[2002*2002];
int main()  {
    int n,k=0;
    cin>>n;
    for(int i=0 ;i <n; i ++){
        scanf("%I64d",&x[i]);
    }

    for(int i=0 ;i <n; i ++){
        if(i)dp[i]= dp[i-1];
        dp[i] += x[i];
    }
    for(int i=n ;i <2*n ;i ++)
        dp[i] = x[i-n];
    sort(dp,dp+2*n);
    cout<<dp[n]<<endl;
    return 0;
}
