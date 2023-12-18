import java.util.*;

public class Main {
    public static int solve(long n) {
        long a = 1;
        long b;
        long border = (long)Math.sqrt(n);
        int min = getNumDigit(n);

        while (a <= border) {
            if (n % a == 0) {
                b = n / a;
                if (getNumDigit(Math.max(a, b)) <= min) {
                    min = getNumDigit(Math.max(a,b));
                }
            }
            a++;
        }
        return min;
    }

    public static int getNumDigit(long n) {
        return Long.toString(n).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(solve(N));
    }
}
