
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
#define pi 3.1415926535898
#define ll long long
#define int long long
typedef std::pair<long long,long long> pll;
typedef std::pair<int,int> pii;
typedef std::vector<int> vi;
typedef std::vector<long long> vll;
typedef double db;
const ll mod=1e9+7;
ll powmod(ll a,ll b,ll p){ll res=1;a%=p;while(b){if(b&1) res=res*a%p;a=a*a%p;b>>=1;}return res;}
ll gcd(ll a,ll b) {return b?gcd(b,a%b):a;}
signed main()
{
    int t=1;
    //cin>>t;
    while (t--){
        int x,n;
        cin>>x>>n;
        set<int> set;
        for (int i = 0; i < n ; ++i) {
            int ni;
            cin>>ni;
            set.insert(ni);
        }
        if(n==0) {
            cout<<x<<endl;
            break;
        }
        int i=0;
        while (1){
            if(!set.count(x-i)) {
                cout<<x-i<<endl;
                break;
            }
            if(!set.count(x+i)){
                cout<<x+i<<endl;
                break;
            }
            i++;
        }

    }
}