import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static final String ex = "1\n" +
            "31415926535";
//    private static final String ex = "31415926535\n" +
//            "1";
//    private static final String ex = "87654\n" +
//            "45678";
//    private static final String ex = "87654\n" +
//            "138";
//    private static final String ex = "87654\n" +
//            "30";

    private static long solve(Scanner scanner) {
        long n = Long.parseLong(scanner.nextLine());
        long s = Long.parseLong(scanner.nextLine());

        if (s == 1) return n;

        int bMax = 1000000;

        for (long i = 2; i <= bMax; i ++) {
            if (s == calcS(n, i)) return i;
        }

        return -1;
    }

    private static long calcS(long n, long b) {
        long sum = 0;
        while (n > 0) {
            sum += n % b;
            n = n / b;
        }
        return sum;
    }

}

