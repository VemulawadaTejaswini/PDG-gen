#include <stdio.h>

int main(void){
        int n,m;
        int nsum,msum;
        int s;
        scanf("%d"" %d ", &n,&m);
        if ( n < 2)
                nsum = 0;
        else if ( n > 1)
                nsum = n * (n - 1) / 2;

        if ( m < 2)
                msum = 0;
        else if ( m > 1)
                msum = m * (m - 1) / 2;

        s = nsum + msum ;
     printf("%d\n",s);

        return 0;
}
