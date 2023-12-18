

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    static long n;
    static long m;


    public static void main(String[] args) {
        n = sc.nextLong();
        m = sc.nextLong();

        long result = solve(n, m);
        System.out.println(result);
    }

    private static long solve(long n, long m) {
        long num = m / n;
        while (num > 0) {
            if (m % num == 0 && m / num >= n) {
                return num;
            }
            num--;
        }
        return 0;
    }
}
