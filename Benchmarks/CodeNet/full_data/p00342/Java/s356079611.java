import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        double ans = 0.0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> x=new LinkedList<>();
        for (int i = 0; i < n; ++i) { x.add(sc.nextDouble()); }
        double max=Double.MIN_VALUE;
        Collections.sort(x);


        for (int i=0;i<n-1;++i)
        {
            double res=0.0;
            int c=i+1;
            int a=n-1;
            int b=n-2;
            if (i==n-3) { b=i-1;}
            else if (i==n-2)
            {
                a=i-1;
                b=i-2;
            }
            res=(x.get(a)+x.get(b))/(x.get(c)-x.get(i));
            if (max<res) {max=res;}
        }

        System.out.println(String.format("%.7f",max));
    }
}
