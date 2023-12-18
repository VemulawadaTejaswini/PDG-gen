import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Aksenov239 on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public void solveA() throws IOException {
        int n = nextInt();
        int c = nextInt();
        int k = nextInt();

        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = nextInt();
        }

        Arrays.sort(t);

        int ans = 0;
        for (int i = 0; i < n;) {
            int j = i;
            while (j < i + c && j < n && t[j] <= t[i] + k) {
                j++;
            }
            i = j;
            ans++;
        }
        out.println(ans);
    }

    public void solveB() throws IOException {
        int n = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }

        Arrays.sort(a);

        int l = -1;
        int r = n;
        while (l < r - 1) {
            int m = (l + r) / 2;
            long size = a[m];
            for (int i = 0; i < m; i++) {
                size += a[i];
            }
            int i = m + 1;
            while (i < n && 2 * size >= a[i]) {
                size += a[i];
                i++;
            }
            if (i == n) {
                r = m;
            } else {
                l = m;
            }
        }
        out.println(n - r);
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solveB();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
