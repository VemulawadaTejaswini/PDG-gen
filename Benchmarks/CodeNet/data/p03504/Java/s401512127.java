import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRecording solver = new DRecording();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRecording {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            BitSet[] rep = new BitSet[c];
            for (int i = 0; i < c; i++) {
                rep[i] = new BitSet(200005);
            }
            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                int ch = sc.nextInt() - 1;
                rep[ch].set(s, t + 1);
            }
            int ans = 0;
            for (int i = 1; i < 100001; i++) {
                int act = 0;
                for (int j = 0; j < c; j++) {
                    if (rep[j].get(i)) {
                        act++;
                    }
                }
                ans = Math.max(ans, act);
            }
            out.println(ans);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
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

