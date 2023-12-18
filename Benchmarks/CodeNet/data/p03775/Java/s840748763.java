
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        int min = Integer.MAX_VALUE;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i != 0)
                continue;
            long j = n / i;
            min = Math.min(calc(i, j), min);
        }
        System.out.println(min);
    }

    public static int calc(long i, long j) {
        int digitI = Long.toString(i).length();
        int digitJ = Long.toString(j).length();
        return Math.max(digitI, digitJ);
    }
}
