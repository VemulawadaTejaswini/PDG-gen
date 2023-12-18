import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }

    void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        char[][] c = new char[n][m];
        for (int i = 0; i < n; i++)
        {
            c[i] = nextToken().toCharArray();
        }
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt[c[i][j]-'a']++;
            }
        }

        if (n % 2 == 0 && m % 2 == 0) {
            for (int i = 0; i < 26; i++) {
                if (cnt[i] % 4 != 0) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
            return;
        }
        if (n * m % 2 == 1) {
            int k4 = (n - 1) * (m - 1) / 4;
            int k2 = (n - 1) / 2 + (m - 1) / 2;
            for (int i = 0; i < 26; i++) {
                while (cnt[i] >= 4 && k4 > 0) {
                     cnt[i] -= 4;
                     k4--;
                }
                while (cnt[i] >= 2 && k2 > 0) {
                    cnt[i] -= 2;
                    k2--;
                }
            }
            if (k4 == 0 && k2 == 0) {
                out.println("Yes");
            } else {
                out.println("No");
            }
            return;
        }
        int k4 = 0;
        int k2 = 0;
        if (n % 2 == 0) {
            k4 = n / 2 * (m - 1) / 2;
            k2 = n / 2;
        } else {
            k4 = (n - 1) / 2 * (m) / 2;
            k2 = m / 2;
        }
        for (int i = 0; i < 26; i++) {
            while (cnt[i] >= 4 && k4 > 0) {
                cnt[i] -= 4;
                k4--;
            }
            while (cnt[i] >= 2 && k2 > 0) {
                cnt[i] -= 2;
                k2--;
            }
        }
        if (k4 == 0 && k2 == 0) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}