import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long X = sc.nextLong();
            long K = sc.nextLong();
            long D = sc.nextLong();

            X = Math.abs(X);

            if (K <= X / D) {
                System.out.println(Math.abs(X - D * K));
                return;
            }

            long l = 0;
            long r = K;
            for (; l + 1 < r;) {
                long c = (l + r) / 2;
                if (c <= X / D) {
                    l = c;
                } else {
                    r = c;
                }
            }

            if ((K - l) % 2 == 0) {
                System.out.println(Math.abs(X - l * D));
            } else {
                System.out.println(Math.abs(X - (l + 1) * D));
            }
        }
    }
}
