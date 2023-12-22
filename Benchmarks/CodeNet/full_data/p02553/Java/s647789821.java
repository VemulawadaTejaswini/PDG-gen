import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();

            long max = (long) -1e18;
            max = Math.max(max, a * c);
            max = Math.max(max, a * d);
            max = Math.max(max, b * c);
            max = Math.max(max, b * d);
            System.out.println(max);
        }
    }
}
