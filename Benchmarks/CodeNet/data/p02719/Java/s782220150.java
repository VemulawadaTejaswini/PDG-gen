import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long init = Math.abs(n-k);

        if (init >= n) System.out.println(n);
        else if (k == 1 || (n%2 == 0 && k %2 == 0)) System.out.println(0);
        else System.out.println(1);

        sc.close();
    }
}