import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final char []s = sc.next().toCharArray();
        int r = 0, g = 0, b = 0;
        for (int i = 0;i < n;++i)
        {
            if (s[i] == 'R') ++r;
            if (s[i] == 'G') ++g;
            if (s[i] == 'B') ++b;
        }

        long ans = (long) r*g*b;
        long sub = 0;
        for (int i = 0;i < n;++i)
        {
            for (int j = i+1;j < n;++j)
            {
                int k = 2*j-i;
                if (s[i] == s[j]) continue;
                if (k >= n) continue;

                if (s[i] != s[k] && s[j] != s[k]) ++sub;
            }
        }

        System.out.println(ans-sub);
        sc.close();
    }
}