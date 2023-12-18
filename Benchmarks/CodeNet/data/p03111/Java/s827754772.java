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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                tab[i] = sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;
            for (int mask1 = 1; mask1 < (1 << n); mask1++) {
                ArrayList<Integer> bamboosForA = new ArrayList<>();
                int bitCount = 0;
                for (int i = 0; i < n; i++) {
                    if ((mask1 & (1 << i)) > 0) {
                        bitCount++;
                        bamboosForA.add(i);
                    }
                }
                if (bitCount == n) {
                    continue;
                }
                for (int mask2 = 1; mask2 < (1 << n); mask2++) {
                    if ((mask1 & mask2) != 0) {
                        continue;
                    }
                    ArrayList<Integer> bamboosForB = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        if ((mask2 & (1 << i)) > 0) {
                            bitCount++;
                            bamboosForB.add(i);
                        }
                    }
                    if (bitCount == n) {
                        continue;
                    }
                    for (int mask3 = 1; mask3 < (1 << n); mask3++) {
                        if ((mask1 & mask3) != 0 || (mask2 & mask3) != 0) {
                            continue;
                        }
                        ArrayList<Integer> bamboosForC = new ArrayList<>();
                        for (int i = 0; i < n; i++) {
                            if ((mask3 & (1 << i)) > 0) {
                                bamboosForC.add(i);
                            }
                        }
                        int tailleA = 0;
                        for (int i : bamboosForA) {
                            tailleA += tab[i];
                        }
                        int tailleB = 0;
                        for (int i : bamboosForB) {
                            tailleB += tab[i];
                        }
                        int tailleC = 0;
                        for (int i : bamboosForC) {
                            tailleC += tab[i];
                        }
                        ans = Math.min(ans, 10 * (bamboosForA.size() - 1) + 10 * (bamboosForB.size() - 1) + 10 * (bamboosForC.size() - 1) + Math.abs(a - tailleA) + Math.abs(b - tailleB) + Math.abs(c - tailleC));
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

