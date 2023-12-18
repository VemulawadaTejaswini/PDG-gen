import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        new Main().go();
    }

    PrintWriter out;
    Reader in;
    BufferedReader br;

    Main() throws IOException {

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
        while (t > 0) {
            solve();
            //out.println();
            t--;
        }

        out.flush();
        out.close();
    }

    int inf = 2000000000;
    int mod = 1000000007;
    double eps = 0.00000001;

    int n;
    int m;

    //ArrayList<Pair>[] g = new ArrayList[2000000];

    void solve() throws IOException {

        String s1 = in.next();
        String s2 = in.next();

        if (!s1.equals(s2) && s2.indexOf('1') < 0) {

            System.out.println(-1);
            return;
        }

        int n = s1.length();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s1.charAt(i) - '0';
            b[i] = s2.charAt(i) - '0';
        }

        int ans = inf;

        for (int i = 0; i <= n; i++) {

            int fp = 0;
            while (b[fp] != 1)
                fp++;
            int last = -1;
            int sum = i;
            for (int j = n-1; j >= 0; j--) {

                if (b[j] == 1) {
                    last = j;
                }

                if (a[j] == 0) {
                    if (last == -1) {
                        sum += fp+1 + (n-j-1) + 1;
                    }
                    else {
                        sum += last - j + 1;
                    }
                }
            }
            //System.err.println(sum);
            ans = Math.min(ans, sum);
            int first = a[0];
            for (int j = 0; j < n-1; j++) {
                a[j] = a[j+1];
            }
            a[n-1] = first;
        }

        out.println(ans);
    }

    class Pair implements Comparable<Pair>{

        int a;
        int b;

        Pair(int a, int b) {

            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair p) {

            if (a > p.a) return 1;
            if (a < p.a) return -1;
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