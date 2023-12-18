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
        long ans = 0;

        //input
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 1;i<=m;++i)
        {
            for (int j = 1;j<=d;++j)
            {
                if (j<10)
                {
                    continue;
                }
                int d2 = j/10;
                int d1 = j-(d2*10);
                int dd = d2*d1;
                if (dd==i)
                {
                    if (d1>=2 && d2>=2)
                    {
                        ++count;
                    }
                }
            }
        }
        //output
        System.out.println(count);
        //System.out.println(String.format("%.0f",answer));
    }
}