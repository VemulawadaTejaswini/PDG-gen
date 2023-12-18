#include<stdio.h>
long gcd(long m,long n)
{
    if(n==0)
        return m;
        printf("%ld %ld\n",n,m%n);
    return gcd(n,m%n);

}

int main()
{
    long  a,b,gCommon,i,j,k,cnt=1;
    scanf("%ld%ld",&a,&b);

    gCommon = gcd(a,b);
  

        for(i=2; gCommon>1 && gCommon>=i*i ; )
        {
            for(j=0; gCommon%i==0; j++)
                gCommon/=i;
                    if(j>0)
                        cnt++;
                    if(i==2)
                        i++;
                    else
                        i+=2;
        }

        if(gCommon>=i)
            cnt++;
        printf("%ld\n",cnt);
        return 0;
}