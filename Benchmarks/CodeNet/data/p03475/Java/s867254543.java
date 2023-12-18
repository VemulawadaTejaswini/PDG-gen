import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);

    public void run() {
        int N = in.nextInt();
        int[] C = new int[N-1];
        int[] S = new int[N-1];
        int[] F = new int[N-1];

        for (int i = 0; i < N - 1; i++) {
            C[i] = in.nextInt();
            S[i] = in.nextInt();
            F[i] = in.nextInt();
        }

        for (int s = 0; s < N; s++) {
            int cur = 0;
            for (int i = s; i < N - 1; i++) {
                cur = S[i] + ((Math.max(cur - S[i], 0) + F[i] - 1) / F[i]) * F[i] + C[i];
            }
            System.out.println(cur);
        }
    }


    public static void main(String[] args) {
        new Main().run();
    }
}
