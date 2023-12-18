#include <stdio.h>
#include <iostream>
#include <algorithm>
using namespace std;
int a[100005];
int main()
{
    int n,k=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    sort(a,a+n);
    for(int i=0;i<n; )
    {
       if(a[i]==a[i+1])
            i=i+2;
       else
       {
           k++;
           i++;
       }

    }
    printf("%d\n",k);
    return 0;

}
