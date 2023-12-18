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

        PriorityQueue<Long> aa=new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<a.length;++i) aa.add(a[i]);

        for (int i=0;i<m;++i)
        {
            long lm=aa.poll();
            lm/=2;
            aa.add(lm);
        }

        long ans=0;
        for (int i=0;i<n;++i) ans+=aa.poll();

        System.out.println(ans);
    }
}