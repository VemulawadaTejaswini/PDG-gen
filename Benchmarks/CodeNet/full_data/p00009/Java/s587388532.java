#include<iostream>
#include<stdio.h>
#include<math.h>
int prime(int x)
{
    int i,j=1;
    int l;
    l=sqrt(x);
    for(i=2;i<=l+1;i++)
    {
        if(x%i==0)
        {
            j=0;
            break;

        }
    }
    //if(j==0)return 0;
    if(x==2||j==1) return 1;


}
using namespace std;
int main()
{
    int n;//=999999;
    //cout<<n<<endl;
    int j,i;int s=0;
    while(cin>>n)
    {
       s=0;

        for(i=2;i<=n;i++)
        {
            if(prime(i)==1){s++;}//cout<<i<<endl;}
        }
        cout<<s<<endl;

    }



    return 0;
}