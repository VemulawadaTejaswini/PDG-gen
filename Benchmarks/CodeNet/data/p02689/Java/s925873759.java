import java.io.*;
import java.util.*;


public class main {

    public static void main(String[] args) {
        new main().run();
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));;
    PrintWriter out = new PrintWriter(System.out);
    StringTokenizer tok = new StringTokenizer("");

    void run() {
        try {
            long timeStart = System.currentTimeMillis();
            solve();

            out.close();

            long timeEnd = System.currentTimeMillis();
            System.err.println("Time = " + (timeEnd - timeStart));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    String delimiter = " ";

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            String nextLine = readLine();
            if (null == nextLine) return null;

            tok = new StringTokenizer(nextLine);
        }

        return tok.nextToken(delimiter);
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }


    void solve() throws IOException {
        int n = readInt(), m = readInt(), from, to, s;
        int[] h = new int[n];
        for (int i = 0; i < n; i++)
            h[i] = readInt();
        List<Integer>[] g;
        g = new List[n];
        for (int v = 0; v < n; ++v)
            g[v] = new ArrayList<>();
        for (int e = 0; e < m; ++e){
            from = readInt() - 1;
            to = readInt() - 1;
            g[from].add(to);
            g[to].add(from);
        }
        s = 0;
        boolean f;
        for (int i = 0; i < n; i++){
            f = true;
            for (int j:g[i]){
                if (h[j] >= h[i]){
                    f = false;
                    break;
                }
            }
            if (f)
                s++;
        }
        out.println(s);

    }
}