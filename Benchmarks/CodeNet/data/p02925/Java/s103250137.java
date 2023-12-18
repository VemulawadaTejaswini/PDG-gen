import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[][] A;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new long[N][N - 1];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    A[i][j] = sc.nextLong();
                }
            }
        }
      System.out.println(-1);

}
