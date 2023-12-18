import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();

            for (int i = A; i < A + K; i++) {
                System.out.println(i);
            }
            for (int i = B - (K - 1); i <= B; i++) {
                System.out.println(i);
            }
        }
    }
}
