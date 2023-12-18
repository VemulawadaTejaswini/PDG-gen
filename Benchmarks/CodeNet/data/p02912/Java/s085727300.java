import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
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
        int m=sc.nextInt();
        long a[]=new long[n];
        for (int i=0;i<n;++i) a[i]=sc.nextLong();

        long aa[]=new long[n];
        System.arraycopy(a,0,aa,0,n);
        Arrays.sort(aa);
        int lm=m;

        while (lm>0)
        {
            aa[n-1]/=2;
            --lm;
            Arrays.sort(aa);
        }

        long ans=0;
        for (int i=0;i<n;++i) ans+=aa[i];

        System.out.println(ans);
    }
}