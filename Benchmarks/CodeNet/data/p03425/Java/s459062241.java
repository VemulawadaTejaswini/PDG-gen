#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    vector<string> s(n);
    int aa=0,bb=0,cc=0,dd=0,ee=0;
    string x;
    for(int i=0;i<n;i++){
        x=s.at(i);
        if(x[0]=='M'){
            aa++;
        }
        if(x[0]=='R'){
            bb++;
        }
        if(x[0]=='C'){
            cc++;
        }
        if(x[0]=='A'){
            dd++;
        }
        if(x[0]=='H'){
            ee++;
        }
    }
    long long ans=0;
    ans+=aa*bb*cc;
    ans+=aa*bb*dd;
    ans+=aa*bb*ee;
    ans+=aa*cc*dd;
    ans+=aa*cc*ee;
    ans+=aa*dd*ee;
    ans+=bb*cc*dd;
    ans+=bb*cc*ee;
    ans+=bb*dd*ee;
    ans+=cc*dd*ee;
    cout<<ans<<endl;
    
}
