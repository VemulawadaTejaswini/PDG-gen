import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long init = Math.abs(n-k);

        if (init > n) System.out.println(n);
        else if (n < k) System.out.println(n);
        else if (n == k || k == 1 || (n%2 == 0 && k%2 == 0)) System.out.println(0);
        else System.out.println(1);

        sc.close();
    }
}