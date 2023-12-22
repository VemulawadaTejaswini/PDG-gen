#include <iostream>
using namespace std;
typedef long long ll;
const int N=2e5+5;
int ans[N];
int pow(ll x,int y,int mod){
    ll ans=1;
    while(y){
        if(y&1) ans=ans*x%mod;
        x=x*x%mod;
    }
    return ans;
}
ll x1[N],x2[N];
void init(){
    for(int i=1; i<N; i++) {
        int y=i,z=0;
        while(y) {
            if(y&1) z++;
            y>>=1;
        }
        ans[i]=ans[i%z]+1;
    }
}

int main() {
    init();
    int n;
    string s;
    cin>>n;
    cin>>s;
    int cnt=0;
    ll sum1=0,sum2=0;
    for(int i=0;i<n;i++){
        if(s[i]=='1')cnt++;
    }
    x1[0]=x2[0]=1;
    for(int i=1;i<n;i++){
        x1[i]=x1[i-1]*2%(cnt-1);
        x2[i]=x2[i-1]*2%(cnt+1);
    }
    for(int i=0;i<n;i++){
        if(s[i]=='1'){
            sum1=(sum1+x1[n-i-1])%(cnt-1);
            sum2=(sum2+x2[n-i-1])%(cnt+1);
        }
    }
    for(int i=0;i<n;i++){
        int sum;
        if(s[i]=='1'){
            sum=(sum1-x1[n-i-1]+cnt-1)%(cnt-1);

        }
        else {
            sum=(sum2+x2[n-i-1])%(cnt+1);
        }
        cout<<ans[sum]+1<<"\n";
    }
    return 0;
}
