#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,x;
    while(~scanf("%d%d%d",&a,&b,&x))
    {
        if(x>a&&a+b>x)
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
    return 0;
}
