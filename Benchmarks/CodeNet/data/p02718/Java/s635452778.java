import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int temp=m;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>(sum/(temp*4)))
            {
                m--;
                if(m==0) {
                    k = 1;
                    System.out.println("Yes");
                    break;
                }
            }
        }
        if(k==0)
            System.out.println("No");
    }
}
