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
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i=0;i<n;++i) a[i]=sc.nextLong();
        long b[] = new long[n];
        for (int i=0;i<n;++i) b[i]=sc.nextLong();
        long c[] = new long[n];
        for (int i=0;i<n;++i) c[i]=sc.nextLong();

        


        //System.out.println(String.format("%.0f",answer));
    }
}