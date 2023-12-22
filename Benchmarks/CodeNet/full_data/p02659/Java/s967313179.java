import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ;
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
        long a = readLong();
        double b = Double.parseDouble(readString());
        out.println((long) (a*b));

    }


}