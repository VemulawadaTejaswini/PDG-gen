#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

    ll m, n;
    ll w[110];
    
    bool check(ll mid){
        ll sum=0, count=1;
        for(ll i=1; i<=n; i++){
            if(w[i]>mid)    return false;
            sum+=w[i];
            if(sum>mid){
                count++;
                sum=w[i];
            }
        }
        return count<=m;
    }
    
int main(void){
    while(cin >> m >> n){
        if(m+n==0) break;
        for(int i=1; i<=n; i++){
            cin >> w[i];
        }
        ll under=0, upper=1500000;
        while(upper-under>1LL){
            ll mid=(under+upper)/2;
            
            if(! check(mid)){
                under=mid;
            }
            else{
                upper=mid;
            }
        }
    
        cout << upper << "\n";
    }
    
    return 0;
}
