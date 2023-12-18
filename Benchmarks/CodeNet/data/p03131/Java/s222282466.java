import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long K = in.nextInt();
            long A = in.nextInt();
            long B = in.nextInt();
            if (A >= B || A + 1 == B) {
                System.out.println(K + 1);
                return;
            }
            long b = A;
            long count = A - 1;
            b += ((K - count) / 2) * (-A + B);
            count += ((K - count) / 2) * 2;
            if (count < K) {
                b++;
            }
            System.out.println(b);
        }
    }
}
