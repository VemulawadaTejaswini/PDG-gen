import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i<=n;++i)
        {
            int r = (int)Math.sqrt(i);
            int max = Math.pow(r,2)+r+r <= i ? r:r-1;
            //System.err.println("@"+i+" max = "+max);
            int count = 0;
            for (int x = 1;x<=max;++x)
            {
                for (int y = 1;y<=max;++y)
                {
                    for (int z = 1;z<=max;++z)
                    {
                        int sum = 0;
                        sum += (int) Math.pow(x,2) + (int) Math.pow(y,2) + (int) Math.pow(z,2)
                                + x*y + y*z + x*z;
                        if (sum == i) ++count;
                    }
                }
            }
            //System.err.println(i+":"+count);
            System.out.println(count);
        }
        sc.close();
    }
}