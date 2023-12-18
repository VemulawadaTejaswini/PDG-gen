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
    class Pair{
        long prev, diff;

        public Pair(long prev, long diff) {
            this.prev = prev;
            this.diff = diff;
        }
    }
    void solve() throws IOException {
        int n = readInt();

        long[] arr1 = new long[n];
        long[] arr2 = new long[n];

        for (int i=0; i<n; ++i) {
            arr1[i] = readInt();
            arr2[i] = arr1[i] * 2;
        }

        long[] prefPlus2 = new long[n + 2];
        long[] suffPlus1 = new long[n + 2];

        prefPlus2[1] = 1;
        ArrayDeque<Pair> q = new ArrayDeque<>();
        ArrayDeque<Pair> temp_q = new ArrayDeque<>();

        long prev = 0;
        for (int i=1; i<n; ++i){
            long cur = 0;
            prev++;
            if (arr2[i-1] >= arr2[i] * 4){
                long a1 = arr2[i - 1];
                long a2 = arr2[i];
                long count = 0;
                while (a2 * 4 < a1) {
                    count++;
                    a2 *= 4;
                }
                q.add(new Pair(prev, count));
                prev = 0;
            }else{
                Pair curPair = null;
                long count = prev;
                while (arr2[i-1] < arr2[i]){
                    if (curPair == null && q.size() > 0){
                        curPair = q.pollLast();
                        temp_q.add(new Pair(curPair.prev, curPair.diff));
                    }

                    if (curPair != null){
                        if (curPair.diff == 0) {
                            count += curPair.prev;
                            curPair = null;
                        }else{
                            curPair.diff--;
                        }
                    }
                    arr2[i - 1] *= 4;
                    cur += 2 * count;
                }
                while (temp_q.size() > 0){
                    q.add(temp_q.pollLast());
                }
            }
            prefPlus2[i + 1] = prefPlus2[i] + cur + 1;
        }
        prev = 0;
        q.clear();
        for (int i=n-2; i>=0; --i){
            long cur = 0;
            prev++;
            if (arr1[i + 1]  >= arr1[i] * 4 ){
                long a1 = arr1[i + 1];
                long a2 = arr1[i];
                long count = 0;
                while (a2 * 4 < a1) {
                    count++;
                    a2 *= 4;
                }
                q.add(new Pair(prev, count));
                prev = 0;
            }else{
                Pair curPair = null;
                long count = prev;
                while (arr1[i+1] < arr1[i]){
                    if (curPair == null && q.size() > 0){
                        curPair = q.pollLast();
                        temp_q.add(new Pair(curPair.prev, curPair.diff));
                    }

                    if (curPair != null){
                        if (curPair.diff == 0) {
                            count += curPair.prev;
                            curPair = null;
                        }else{
                            curPair.diff--;
                        }
                    }
                    arr1[i + 1] *= 4;
                    cur += 2 * count;
                }
                while (temp_q.size() > 0){
                    q.add(temp_q.pollLast());
                }
            }
            suffPlus1[i + 1] = suffPlus1[i + 2] + cur;
        }
        long ans = Long.MAX_VALUE;
        for (int i=0; i<=n; ++i){
            ans = Math.min(ans, suffPlus1[i+1] + prefPlus2[i]);
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