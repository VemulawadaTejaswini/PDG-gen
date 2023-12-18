import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static void exchange(int[] cookies, int turn) {
        int c = (cookies[turn] >> 1);
        cookies[turn] = c;
        cookies[turn ^ 1] += c;
    }

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out))
        {
            final int[] AB = new int[2];
            AB[0] = in.nextInt();
            AB[1] = in.nextInt();
            final int K = in.nextInt();

            int turn = 0;
            for (int k = 0; k < K; ++k) {
                exchange(AB, turn);
                turn ^= 1;
            }

            out.printf("%d %d%n", AB[0], AB[1]);
        }
    }
}
