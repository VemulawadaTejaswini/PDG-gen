import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            long A = sc.nextLong();
            long B = sc.nextLong();
            long r = N / (A + B);
            long count = r * A;
            count += Math.min(N - r * (A + B), A);
            System.out.println(count);
        }
    }
}
