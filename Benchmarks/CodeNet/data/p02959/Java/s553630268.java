import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int b[]=new int[n];
        for (int i=0;i<n+1;++i) a[i]=sc.nextInt();
        for (int i=0;i<n;++i) b[i]=sc.nextInt();


        for (int i=n-1;i>=0;--i)
        {
            int rp=b[i];
            if (rp>=a[i+1])
            {
                rp-=a[i+1];
                count+=a[i+1];
                a[i+1]=0;
                if (rp>=a[i])
                {
                    count+=a[i];
                    a[i]=0;
                }else
                {
                    a[i]-=rp;
                    count+=rp;
                }
            }else
            {
                a[i+1]-=rp;
                count+=rp;
                rp=0;
            }
        }
        System.out.println(count);
        //output
        //System.out.println(String.format("%.0f",answer));
    }
}