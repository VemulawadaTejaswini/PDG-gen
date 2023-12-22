import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        for (; ; ) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) break;

            int[] d = new int[n];
            int[] v = new int[n];

            for (int i = 0; i < n; ++i) {
                d[i] = sc.nextInt() - 1;
                v[i] = sc.nextInt();
            }

            int[] maxRecommendation = new int[m];
            for (int i = 0; i < n; ++i) {
                maxRecommendation[d[i]] = Math.max(maxRecommendation[d[i]], v[i]);
            }

            int result = 0;
            for (int i = 0; i < m; ++i) {
                result += maxRecommendation[i];
            }

            out.println(result);
        }

        sc.close();
        out.close();
    }
}