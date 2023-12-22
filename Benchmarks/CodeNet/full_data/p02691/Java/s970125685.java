import java.io.*;
import java.util.*;


class E {

    public static void main(String[] args) {
        new E().run();
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
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
        int n = readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = readInt();
        }
        int s = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if(Math.abs(i - j) == a[i] + a[j])
                    s++;
            }
        }
        out.println(s);
    }


}