import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] b = new int[n + 1];
        int[] w = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            if (a < 0) {
                b[i] = -a;
            } else {
                w[i] = a;
            }
        }
        Arrays.parallelPrefix(b, Integer::sum);
        Arrays.parallelPrefix(w, Integer::sum);
        int m = Integer.MAX_VALUE;
        for (int i = k; i <= n; i++) {
            m = Math.min(m, Math.min(b[i] - b[i - k], w[i] - w[i - k]));
        }
        System.out.println(w[n] - m);
    }
}