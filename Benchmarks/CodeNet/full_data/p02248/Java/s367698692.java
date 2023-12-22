#include <iostream>
#include <cstring>
using namespace std;
typedef unsigned long long ull;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    char t[1000001], p[10001];
    cin>>t>>p;
    int tl=strlen(t);
    int pl=strlen(p);
    if(pl>tl) return 0;
    const ull base = 1000000007ULL;
    ull bt = 1;
    for(int i=0; i<pl; i++) bt*=base;
    ull th=0, ph=0;
    for(int i=0; i<pl; i++){
        ph*=base;
        ph+=p[i];
        th*=base;
        th+=t[i];
    }
    for(int pos=0; pos<=tl-pl; pos++) {
        if(th==ph) {
            if(memcmp(t+pos, p, pl)==0) cout<<pos<<'\n';
        }
        th*=base;
        th-=bt*t[pos];
        th+=t[pos+pl];
    }
    return 0;
}