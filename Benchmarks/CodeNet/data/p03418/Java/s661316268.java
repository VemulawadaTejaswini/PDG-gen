import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for (int b = k + 1; b <= n; b++) {
            int laps = n / b;
            int extra = n % b;
            int bigger = b - k;
            ans += 1l * laps * bigger;
           ans += Math.max(0, extra - k + (k == 0 ? 0 : 1));
        }
        out.println(ans);
        out.flush();
        out.close();
    }


    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
