??import java.util.*;

public class Main {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            System.out.println(Integer.bitCount(Math.abs(a)) + Integer.bitCount(Math.abs(b)));
        }
    }
}