import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long a = in.nextLong();
            long b = in.nextLong();
            long x = in.nextLong();

            System.out.println(count(b, x) - (a == 0 ? 0 : count(a - 1, x)));
        }
    }

    private static long count(long l, long x) {
        return 1 + l / x;
    }
}
