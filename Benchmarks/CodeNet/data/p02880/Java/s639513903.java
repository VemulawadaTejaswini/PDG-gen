#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
    ll i,j,m,n,a,b,k,count=0;
    cin>>n;
    for(i=1;i<10;i++)
    {
        for(j=1;j<10;j++)
        {
            if(i*j==n)
            {
                cout<<"Yes"<<endl;
                count=1;
                break;
            }
        }

    }
    if(count==0)
    {
        cout<<"No"<<endl;
    }


}
