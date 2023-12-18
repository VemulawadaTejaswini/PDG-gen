#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define MOD 1000000007
int n;
ll dp[1000001];
ll exp(int r){
    ll prod = 1;
    for(int i=1;i<=r;i++){
        prod*=2;
        prod%=MOD;
    }
    return prod;
    
}
int main(){
    cin >> n;
 //   dp[n] = n;
    if(n==1){
        cout << 1;
    }
    else{
        ll ans = exp(n-2);
        ans*=n;
        ans%=MOD;
        ans*=(n-1);
        ans%=MOD;
        ans+=n;
        ans%=MOD;
        cout << ans << endl;
    }
}
