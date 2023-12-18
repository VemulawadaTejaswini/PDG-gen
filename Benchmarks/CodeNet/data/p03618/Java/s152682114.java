import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    int min(int a, int b) {
        if (a >= b) {
            return b;
        }
        return a;
    }

    char s[];
    int n;

    public void solve() throws IOException {
        s = nextToken().toCharArray();
        n = s.length;

        long d[] = new long[26];
        for (int i = 0; i < n; i++) {
            d[s[i] - 'a']++;
        }
        long res = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                res += d[i]*d[j];
            }
        }
        out.print(res + 1);
    }


    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("sum2.in"));
//            out = new PrintWriter(new File("sum2.out"));
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}