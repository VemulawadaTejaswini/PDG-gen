import java.util.Arrays;
import java.util.Scanner;

/**
 * Prediction and Restriction
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int P = sc.nextInt();
            char[] T = sc.next().toCharArray();

            boolean[] win = new boolean[N];
            Arrays.fill(win, 0, K, true);

            for (int i = K; i < N; i++) {
                if (T[i] != T[i - K] || win[i - K] == false) {
                    win[i] = true;
                }
            }

            long ans = 0;
            for (int i = 0; i < N; i++) {
                if (win[i]) {
                    if (T[i] == 'r') {
                        ans += P;
                    } else if (T[i] == 's') {
                        ans += R;
                    } else if (T[i] == 'p') {
                        ans += S;
                    }
                }
            }

            System.out.println(ans);
        }
    }

}
