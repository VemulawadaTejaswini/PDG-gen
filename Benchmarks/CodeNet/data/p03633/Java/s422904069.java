import java.util.*;

public class Main {
//    private static final String ex = "2\n" +
//        "2\n" +
//        "3";
    private static final String ex = "5\n" +
            "2\n" +
            "5\n" +
            "10\n" +
            "1000000000000000000\n" +
            "1000000000000000000";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static long solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        long[] T = new long[N];
        for (int i = 0; i < N; i ++) {
            T[i] = Long.parseLong(scanner.nextLine());
        }

        long ret = T[0];
        for (int i = 1; i < T.length; i ++) {
            ret = lcm(ret, T[i]);
        }

        return ret;
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long tmpA = a;
            a = b;
            b = tmpA % b;
        }
        return a;
    }
}
