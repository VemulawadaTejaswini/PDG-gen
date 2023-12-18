import java.util.*;
class Main
{
       public static void main(String [] args)
    {            
             int n;
           Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          int i,j,k,co=0;
          int a[]=new int[n];
           int b[]=new int[n];
            int c[]=new int[n];
         for(j=1;j<=3;j++)
          {  for(i=0;i<n;i++)
         {
             if(j==1)
             {
                 a[i]=sc.nextInt();
                }
                if(j==2)
             {
                 b[i]=sc.nextInt();
                }
                if(j==3)
             {
                 c[i]=sc.nextInt();
                }
            }
        }
        int cu=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {if(c[k]>b[j]&&b[j]>a[i])
                {co++;
                }
            }
            }
        }
           System.out.print((co));
             }
}