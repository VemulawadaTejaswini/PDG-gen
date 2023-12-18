import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Roadwork
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Reader r = new Reader(System.in)) {
            int N = r.i();
            int Q = r.i();

            Work[] W = new Work[N];
            for (int i = 0; i < N; i++) {
                W[i] = new Work();
                W[i].S = r.i();
                W[i].T = r.i();
                W[i].X = r.i();
            }

            Arrays.sort(W, (o1, o2) -> {
                return Integer.compare(o1.X, o2.X);
            });

            List<Integer> D = new ArrayList<Integer>();
            Map<Integer, Integer> index = new HashMap<>();
            for (int i = 0; i < Q; i++) {
                int d = r.i();
                D.add(d);
                index.put(d, i);
            }

            int[] A = new int[Q];
            Arrays.fill(A, -1);

            for (int i = 0; i < N; i++) {
                Work w = W[i];

                int pos1 = Collections.binarySearch(D, w.S - w.X);
                if (pos1 < 0) {
                    pos1 = -(pos1 + 1);
                }

                int pos2 = Collections.binarySearch(D, w.T - w.X);
                if (pos2 < 0) {
                    pos2 = -(pos2 + 1);
                }

                //System.out.println(w.S + " " + w.T + " " + w.X + " " + pos1 + " " + pos2 + " " + D);

                if (pos1 == pos2) {
                    continue;
                }

                for (int p = pos1; p < pos2; p++) {
                    int q = D.remove(pos1);
                    A[index.get(q)] = w.X;
                }
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < Q; i++) {
                ans.append(A[i]).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

    static class Work {

        int S;

        int T;

        int X;

    }

    public static class Reader implements AutoCloseable {

        private BufferedReader br;

        private String[] buf;

        private int bufidx = -1;

        public Reader(InputStream in) {
            this.br = new BufferedReader(new InputStreamReader(in));
        }

        @Override
        public void close() throws Exception {
            br.close();
        }

        private void readBuf() throws IOException {
            if (bufidx == -1 || bufidx == buf.length) {
                buf = br.readLine().split(" ");
                bufidx = 0;
            }
        }

        public String s() throws IOException {
            readBuf();
            return buf[bufidx++];
        }

        public int i() throws IOException {
            return Integer.parseInt(s());
        }

        public long l() throws IOException {
            return Long.parseLong(s());
        }

        public double d() throws IOException {
            return Double.parseDouble(s());
        }

        public String[] sa() throws IOException {
            readBuf();
            if (bufidx != 0) {
                throw new RuntimeException("illegal read");
            }
            bufidx = -1;
            return buf;
        }

        public int[] ia() throws IOException {
            String[] sa = sa();
            int[] ia = new int[sa.length];
            for (int i = 0; i < sa.length; i++) {
                ia[i] = Integer.parseInt(sa[i]);
            }
            return ia;
        }

        public long[] la() throws IOException {
            String[] sa = sa();
            long[] la = new long[sa.length];
            for (int i = 0; i < sa.length; i++) {
                la[i] = Long.parseLong(sa[i]);
            }
            return la;
        }

        public double[] da() throws IOException {
            String[] sa = sa();
            double[] da = new double[sa.length];
            for (int i = 0; i < sa.length; i++) {
                da[i] = Double.parseDouble(sa[i]);
            }
            return da;
        }

        public int[][] im(int N) throws IOException {
            int[][] im = new int[N][];
            for (int i = 0; i < N; i++) {
                im[i] = ia();
            }
            return im;
        }

        public long[][] lm(int N) throws IOException {
            long[][] lm = new long[N][];
            for (int i = 0; i < N; i++) {
                lm[i] = la();
            }
            return lm;
        }

        public double[][] dm(int N) throws IOException {
            double[][] dm = new double[N][];
            for (int i = 0; i < N; i++) {
                dm[i] = da();
            }
            return dm;
        }

    }

}
