#include<stdio.h>
#include<string.h>
#include<math.h>
int main()
{
    int n,len,i,j,x;
    int b;
    char a[10001];
    while(scanf("%d",&n)!=EOF)
    {
        getchar();
        while(n--)
        {
            memset(a,0,sizeof(a));
            gets(a);
            len=strlen(a);
            b=sqrt(len);
            if(b*b==len)
            {
                for(j=0; j<b; j++)
                    for(i=0; i<b; i++)
                        printf("%c",a[j+(int)b*i]);
                printf("\n");
            }
            else
                printf("INVALID\n");
        }
    }
    return 0;
}