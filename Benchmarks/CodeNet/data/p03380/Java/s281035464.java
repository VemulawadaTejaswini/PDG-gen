import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        char[] c = new char[11 * N];
        int M = in.read(c, 0, c.length);
        int[] a = new int[N];
        int max = 0;
        for (int i = 0, j = 0; i < N; i++) {
            int x = 0;
            while (true) {
                int k = c[j++] - '0';
                if (0 <= k && k <= 9) {
                    x = 10 * x + k;
                } else {
                    break;
                }
            }
            max = Math.max(max, (a[i] = x));
        }

        int half = max / 2;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int now = Math.min(a[i], max - a[i]);
            int temp = Math.min(ans, max - ans);
            if (temp < now && now <= half) {
                ans = a[i];
            }
        }

        out.println(max + " " + ans);
    }
}
