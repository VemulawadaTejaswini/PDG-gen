import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/testdata.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/testData.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver();
            solver.solve(in, out);
            out.close();
            // fin.close();
            // fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver
    {

        class Node implements Comparable<Node> {
            long value;
            int index;
            Node () {}
            Node (long value, int index) {
                this.value = value;
                this.index = index;
            }
            @Override
            public int compareTo(Node o) {
                if (this.value < o.value) return -1;
                else if (this.value > o.value) return 1;
                else return 0;
            }
        }

        public void solve (InputReader cin, PrintWriter cout)
        {
            try {
                int n;
                Node[] data;
                n = cin.nextInt();
                data = new Node[n + 2];
                data[0] = new Node(0, 0);
                for (int i = 1; i < n + 1; ++i) {
                    data[i] = new Node(0, i);
                    data[i].value = cin.nextLong();
                }
                data[n + 1] = new Node(Long.MAX_VALUE, n + 1);
                for (int i = 1; i < n + 1; ++i) {
                    data[i].value += data[i - 1].value;
                }
                Arrays.sort(data);
                int pt = 0;
                int num = 0;
                // BigInteger ret = BigInteger.ZERO;
                // BigInteger tmp;
                long ret = 0;
                long tmp = 0;
                while (pt < n + 1) {
                    while (pt < n + 1 && data[pt].value != data[pt + 1].value) pt++;
                    num = pt;
                    while (data[pt].value == data[num].value && pt < n + 1) pt++;
                    if (pt - num > 1) {
                        // tmp = BigInteger.ONE;
                        // for (int i = 1; i < pt - num; ++i) {
                        //     tmp = tmp.multiply(new BigInteger(String.valueOf(i)));
                        // }
                        // ret = ret.add(tmp);
                        tmp = 1;
                        for (int i = 1; i < pt - num; ++i) tmp *= i;
                        ret += tmp;
                    }
                }
                cout.println(ret);

            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong () {
            return Long.parseLong(next());
        }

        public double nextDouble () {
            return Double.parseDouble(next());
        }

    }

}