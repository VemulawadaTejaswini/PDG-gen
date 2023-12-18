import java.io.*;
import java.util.*;

public class Main {
    static OutputWriter out;

    public static void main(String[] args) throws Exception {
        MyScanner in = new MyScanner(System.in);
        out = new OutputWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        Arrays.sort(a);
        for (int i = n - 1; i > n - k - 1 && i > -1; i--) {
            a[i] = 0;
        }
        long ans = 0;
        for (int i = 0; i < n; i++)
            ans+=a[i];
        out.printLine(ans);
            out.flush();
    }

    static void MergeSort(long[] a, long[] b, long[] c, int p, int r) {
        if (p < r) {
            int q = (r + p) / 2;
            MergeSort(a, b, c, p, q);
            MergeSort(a, b, c, q + 1, r);
            Merge(a, b, c, p, q, r);
        }
    }

    static void Merge(long[] a, long[] b, long[] c, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        long[] R = new long[n1 + 1];
        long[] L = new long[n2 + 1];
        long[] R1 = new long[n1];
        long[] L1 = new long[n2];
        long[] R2 = new long[n1];
        long[] L2 = new long[n2];
        for (int i = 0; i < n1; i++) {
            R[i] = a[p + i];
            R1[i] = b[p + i];
            R2[i] = c[p + i];
        }
        R[n1] = Long.MAX_VALUE;
        for (int i = 0; i < n2; i++) {
            L[i] = a[q + i + 1];
            L1[i] = b[q + i + 1];
            L2[i] = c[q + i + 1];
        }
        L[n2] = Long.MAX_VALUE;
        int n = a.length;
        int j = 0;
        int k = 0;
        for (int i = p; i <= r; i++) {
            if (L[j] <= R[k]) {
                a[i] = L[j];
                b[i] = L1[j];
                c[i] = L2[j];
                j++;
            } else {
                a[i] = R[k];
                b[i] = R1[k];
                c[i] = R2[k];
                k++;
            }


        }
    }
}

class Graph {


    int n;
    ArrayList<Integer>[] adjList;

    public Graph(int n) {
        this.n = n;
        adjList = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adjList[i] = new ArrayList<>();
    }

}

class pair implements Comparable {

    int key;
    int value;

    public pair(Object key, Object value) {

        this.key = (int) key;
        this.value = (int) value;

    }

    @Override
    public int compareTo(Object o) {
        pair temp = (pair) o;
        return key - temp.key;
    }
}

class MyScanner {

    StringTokenizer st;
    BufferedReader br;

    public MyScanner(InputStream s) {
        br = new BufferedReader(new InputStreamReader(s));
    }

    public MyScanner(FileReader f) {
        br = new BufferedReader(f);
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() throws IOException {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if (x.charAt(0) == '-') {
            neg = true;
            start++;
        }
        for (int i = start; i < x.length(); i++)
            if (x.charAt(i) == '.') {
                res = Long.parseLong(sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            } else {
                sb.append(x.charAt(i));
                if (dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
        return res * (neg ? -1 : 1);
    }

    public boolean ready() throws IOException {
        return br.ready();
    }

    public boolean nextEmpty() throws IOException {
        String s = nextLine();
        st = new StringTokenizer(s);
        return s.isEmpty();
    }
}

class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }


    public void printLine(Object... objects) {
        print(objects);
        writer.println();
    }

    public void close() {
        writer.close();
    }

    public void flush() {
        writer.flush();
    }

}