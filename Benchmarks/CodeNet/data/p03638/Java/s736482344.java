    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            boolean local = false;
            if (args.length > 0 && args[0].equals("LOCAL"))
                local = true;

            new Main(local).go();
        }

        boolean LOCAL;
        PrintWriter out;
        Reader in;
        BufferedReader br;

        Main(boolean local) throws IOException {

            this.LOCAL = local;

            try {

                //br = new BufferedReader( new FileReader("input.txt") );
                in = new Reader("input.txt");
                out = new PrintWriter( new BufferedWriter(new FileWriter("output.txt")) );
            }
            catch (Exception e) {

                //br = new BufferedReader( new InputStreamReader( System.in ) );
                in = new Reader();
                out = new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)) );
            }
        }

        void go() throws IOException {

            int t = 1;

            if (this.LOCAL)
                t = in.nextInt();

            while (t > 0) {

                solve();
                t--;

                if (LOCAL)
                    out.println();

            }

            out.flush();
            out.close();
        }


        int inf = 2000000000;
        int mod = 1000000007;
        double eps = 1e-9;

        int n;
        int m;

        //ArrayList<Integer>[] g = new ArrayList[200010];

        void solve() throws IOException {

            int n = in.nextInt();
            int m = in.nextInt();

            int k = in.nextInt();

            int[] a = new int[k];

            for (int i = 0; i < k; i++)
                a[i] = in.nextInt();

            int s = 0;
            int c = 0;

            int[][] ans = new int[n][m];

            for (int i = 0; i < n; i++) {

                if (s == 0)
                    for (int j = 0; j < m; j++) {

                        if (a[c] == 0)
                            c++;

                        ans[i][j] = c+1;

                        a[c]--;
                    }

                if (s == 1)
                    for (int j = m-1; j >= 0; j--) {

                        if (a[c] == 0)
                            c++;

                        ans[i][j] = c+1;
                        a[c]--;
                    }

                s = 1 - s;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.print(ans[i][j]+" ");
                }
                out.println();
            }

        }

        class Pair implements Comparable<Pair>{

            int a;
            int b;

            Pair(int a, int b) {

                this.a = a;
                this.b = b;
            }

            public int compareTo(Pair p) {

    //            if (a > p.a) return 1;
    //            if (a < p.a) return -1;
                if (b > p.b) return 1;
                if (b < p.b) return -1;
                return 0;
            }
        }

        class Item {

            int a;
            int b;
            int c;

            Item(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

        }

        class Reader {

            BufferedReader  br;
            StringTokenizer tok;

            Reader(String file) throws IOException {
                br = new BufferedReader( new FileReader(file) );
            }

            Reader() throws IOException {
                br = new BufferedReader( new InputStreamReader(System.in) );
            }

            String next() throws IOException {

                while (tok == null || !tok.hasMoreElements())
                    tok = new StringTokenizer(br.readLine());
                return tok.nextToken();
            }

            int nextInt() throws NumberFormatException, IOException {
                return Integer.valueOf(next());
            }

            long nextLong() throws NumberFormatException, IOException {
                return Long.valueOf(next());
            }

            double nextDouble() throws NumberFormatException, IOException {
                return Double.valueOf(next());
            }


            String nextLine() throws IOException {
                return br.readLine();
            }

        }

    }