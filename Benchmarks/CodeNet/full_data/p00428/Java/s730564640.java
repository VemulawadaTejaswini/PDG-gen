import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int m = sc.nextInt(), n = sc.nextInt();
            if ((m | n) == 0) {
                break;
            }
            int[] r = new int[n];
            int[] p = IntStream.rangeClosed(1, n).toArray();
            Arrays.fill(r, 0);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    r[j] += sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (r[i] < r[j]) {
                        int t = r[i];
                        r[i] = r[j];
                        r[j] = t;
                        t = p[i];
                        p[i] = p[j];
                        p[j] = t;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(p[i] + (i < n - 1 ? " " : "\n"));
            }
        }
    }
}
