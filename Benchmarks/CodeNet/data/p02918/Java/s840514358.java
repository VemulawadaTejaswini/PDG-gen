import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        DFaceProducesUnhappiness solver = new DFaceProducesUnhappiness();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFaceProducesUnhappiness {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<DFaceProducesUnhappiness.Pair> a = new ArrayList<>();
            String s = sc.nextLine();
            a.add(new DFaceProducesUnhappiness.Pair(s.charAt(0), 1));
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == a.get(a.size() - 1).x) {
                    a.get(a.size() - 1).y++;
                } else {
                    a.add(new DFaceProducesUnhappiness.Pair(s.charAt(i), 1));
                }
            }
            int ans = 0;
            for (int i = 0; i < a.size(); i++) {
                ans += a.get(i).y - 1;
            }
            int ans1 = 0;
            int rem = k;
            for (int i = 1; i < a.size() - 1; i++) {
                if (a.get(i).x == 'R') {
                    ans1 += 2;
                    rem--;
                }
                if (rem == 0) {
                    break;
                }
            }
            if (rem > 0) {
                if (a.get(0).x == 'R') {
                    ans1++;
                    rem--;
                }
                if (a.get(a.size() - 1).x == 'R' && rem > 0) {
                    ans1++;
                }
            }

            int ans2 = 0;
            rem = k;
            for (int i = 1; i < a.size() - 1; i++) {
                if (a.get(i).x == 'L') {
                    ans2 += 2;
                    rem--;
                }
                if (rem == 0) {
                    break;
                }
            }
            if (rem > 0) {
                if (a.get(0).x == 'L') {
                    ans2++;
                    rem--;
                }
                if (a.get(a.size() - 1).x == 'L' && rem > 0) {
                    ans2++;
                }
            }
            out.print(ans + Math.max(ans1, ans2));
        }

        static class Pair {
            char x;
            int y;

            public Pair(char x, int y) {
                this.x = x;
                this.y = y;
            }

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

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

