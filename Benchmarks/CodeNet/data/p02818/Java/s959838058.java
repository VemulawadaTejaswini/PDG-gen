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
                A = 0;
                K -= A;
            }

            if (B >= K) {
                B -= K;
                K = 0;
            } else {
                B = 0;
                K -= B;
            }

            System.out.println(A + " " + B);
        }
    }
}