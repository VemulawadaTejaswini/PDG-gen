import java.util.*;

public class Main
{

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        SortedSet<Integer> set = new TreeSet<>();

        while(k-- > 0)
        {
            int p = kb.nextInt();
            set.add(p);
            p = kb.nextInt();
            set.add(p);
        }

        long dp[] = new long[n+1];

        dp[1] = 1l;

        for(int i = 1 ; i <= n ; i++)
        {
            for(int p : set)
            {
                if(p < i)
                    dp[i] = (dp[i] + dp[i-p]) % 998244353l;
            }
        }

        //for(int i = 0 ; i <= n ;i++)
        //    System.out.print(dp[i] + " ");
        //System.out.println();

        System.out.println(dp[n]);
    }
}