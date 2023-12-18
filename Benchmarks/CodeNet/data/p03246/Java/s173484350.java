import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
            }
            int[] occp = new int[100001];
            int[] occimp = new int[100001];
            for (int i = 0; i < n; i += 2) {
                occp[tab[i]]++;
            }
            for (int i = 1; i < n; i += 2) {
                occimp[tab[i]]++;
            }
            int bestp = 0, sbestp = 0;
            int besti = 0, sbesti = 0;
            for (int i = 1; i < 100001; i++) {
                if (occp[i] > occp[bestp]) {
                    sbestp = bestp;
                    bestp = i;
                } else if (occp[i] > occp[sbestp]) {
                    sbestp = i;
                }

                if (occimp[i] > occimp[besti]) {
                    sbesti = besti;
                    besti = i;
                } else if (occimp[i] > occimp[sbesti]) {
                    sbesti = i;
                }
            }
            int t1 = bestp;
            int t2 = besti;
            if (besti == bestp) {
                if (occimp[besti] > occp[bestp]) {
                    t1 = sbestp;
                } else if (occimp[besti] < occp[bestp]) {
                    t2 = sbesti;
                } else {
                    if (occimp[sbesti] >= occp[sbestp]) {
                        t2 = sbesti;
                    } else {
                        t1 = sbestp;
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (tab[i] != t1) {
                        ans++;
                    }
                } else {
                    if (tab[i] != t2) {
                        ans++;
                    }
                }
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

