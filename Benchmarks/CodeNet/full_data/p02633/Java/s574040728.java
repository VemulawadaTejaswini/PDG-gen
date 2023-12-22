#include<iostream>
#include<vector>
#include<algorithm>
#include<set>
#include<deque>
#include<string>
using namespace std;
#define ll long long
#define pb push_back
#define end "\n"
#define lar 1000000007;
int main()
{
    ll i,cnt=1;
    cin>>i;
    while(1){
        if((i*cnt)%360==0)break;
        cnt+=1;
    }
    cout<<cnt;
}