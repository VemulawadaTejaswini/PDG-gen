import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long A = in.nextLong();
            long B = in.nextLong();
            long K = in.nextLong();

            if (A >= K) {
                A -= K;
                K = 0;
            } else {
                K -= A;
                A = 0;
            }

            if (B >= K) {
                B -= K;
                K = 0;
            } else {
                K -= B;
                B = 0;
            }

            System.out.println(A + " " + B);
        }
    }
}