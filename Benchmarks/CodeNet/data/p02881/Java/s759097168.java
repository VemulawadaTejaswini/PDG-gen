import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextLong();
            long min = (long) 1e18;
            for (int i = 1, sqrt = (int) (Math.sqrt(N) + 1); i <= sqrt; i++) {
                if (N % i == 0) {
                    min = Math.min(min, i - 1 + (N / i) - 1);
                }
            }
            System.out.println(min);
        }
    }
}
