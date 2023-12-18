import java.util.*;
public class Main
{
    private static final long MOD = (long) 1e9 + 7;

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); long k = sc.nextInt(); long ans = 0;
        for (long i = k; i <= n + 1; i++) {
            long temp1 = (n * (n + 1)) / 2;
            long temp2 = ((n - i) * (n - i + 1)) / 2;
            long temp3 = (i * (i - 1)) / 2;
            long temp4 = temp1 - temp2 - temp3 + 1;
            ans = (ans + (temp4))%MOD;
        }
        System.out.println(ans);
    }


}