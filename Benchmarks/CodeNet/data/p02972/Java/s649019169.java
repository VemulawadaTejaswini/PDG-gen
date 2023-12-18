import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPreparingBoxes solver = new DPreparingBoxes();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPreparingBoxes {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                a[i] = in.nextInt();
            }
//        int[] cnt = new int[n + 1];
//        List<Integer> choices = new ArrayList<>();
//        for (int i = n; i >= 1; i--) {
//            if (cnt[i] % 2 != a[i]) {
//                choices.add(i);
//                for (int j = 1; j <= Math.sqrt(i); j++) {
//                    if (i % j == 0) {
//                        cnt[j]++;
//                    }
//                }
//            }
//        }
            int[] res = new int[n + 1];
            int num = 0;
            for (int i = n; i >= 1; i--) {
                int cnt = 0;
                for (int j = i; j <= n; j += i) {
                    cnt += res[j];
                }
                res[i] = Math.abs((a[i] - cnt) % 2);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < n + 1; i++) {
                if (res[i] == 1) {
                    num++;
                    sb.append(i).append(" ");
                }
            }
            out.println(num);
            out.println(sb);
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

