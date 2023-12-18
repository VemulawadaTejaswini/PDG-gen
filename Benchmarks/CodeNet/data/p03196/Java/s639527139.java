import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    String fileName = "";
    int[][] steps = {{0,1}, {1, 0}};
    int T = 10080;
    int INF = Integer.MAX_VALUE / 10 - 123123;
    //////////////////////    SOLUTION   SOLUTION  SOLUTION    //////////////////////////////

    int[][] dist;
    int l = 30;
    void solve() throws IOException {
        long n = readLong();
        long p = readLong();
        long ans = 1;
        if (n == 1){
            out.println(p);
            return;
        }
        for (long i=2; i*i<=p; ++i){
            if (p%i == 0){
                long c = p;
                int pow = 0;
                while (c%i == 0) {
                    pow++;
                    c /= i;
                }
                if (pow >= n){
                    ans = Math.max(ans, i);
                }
                c = p;
                long div = p / i;
                pow = 0;
                while (c%div == 0) {
                    pow++;
                    c /= div;
                }
                if (pow >= n){
                    ans = Math.max(ans, i);
                }
            }
        }
        out.println(ans);
    }

    ////////////////////////////////////////////////////////////



    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a%b);
    }
    long binPow(long a, long pow, long MODULO){
        if (pow == 0) return 1;
        if (pow % 2 == 1) {
            return a * binPow(a, pow - 1, MODULO);
        } else {
            long c = binPow(a, pow / 2, MODULO);
            return c * c % MODULO;
        }
    }

    int minInt(int... values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) min = Math.min(min, value);
        return min;
    }

    int maxInt(int... values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) max = Math.max(max, value);
        return max;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        new Main().run();
    }

    void run() throws NumberFormatException, IOException {
        solve();
        out.close();
    };

    BufferedReader in;
    PrintWriter out;

    StringTokenizer tok;
    String delim = " ";

    Main() throws FileNotFoundException {
        try {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        } catch (Exception e) {
            if (fileName.isEmpty()) {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
            } else {
                in = new BufferedReader(new FileReader(fileName + ".in"));
                out = new PrintWriter(fileName + ".out");
            }

        }
        tok = new StringTokenizer("");
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            String nextLine = readLine();
            if (null == nextLine) {
                return null;
            }

            tok = new StringTokenizer(nextLine);
        }
        return tok.nextToken(delim);
    }

    int readInt() throws NumberFormatException, IOException {
        return Integer.parseInt(readString());
    }
    byte readByte() throws NumberFormatException, IOException {
        return Byte.parseByte(readString());
    }
    int[] readIntArray (int n) throws NumberFormatException, IOException {
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = readInt();
        }
        return a;
    }

    Integer[] readIntegerArray (int n) throws NumberFormatException, IOException {
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = readInt();
        }
        return a;
    }

    long readLong() throws NumberFormatException, IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(readString());
    }
}