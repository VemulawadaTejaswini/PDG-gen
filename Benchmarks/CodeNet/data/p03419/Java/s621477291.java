import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextInt();
            long M = in.nextInt();

            if (Math.min(N, M) <= 2) {
                if (N == 1 && M == 1) {
                    System.out.println(1);
                } else if (N == 2 || M == 2) {
                    System.out.println(0);
                } else {
                    System.out.println(Math.max(N, M) - 2);
                }
            } else {
                System.out.println((N - 2) * (M - 2));
            }
        }
    }
}
