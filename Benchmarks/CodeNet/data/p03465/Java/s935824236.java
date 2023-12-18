import java.io.*;
import java.util.*;

public class Main {

    final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
        // Sworn to fight and die
    }

    void init() throws FileNotFoundException {
        if (1 > 0) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    public void run() {
        try {
            long t1 = System.currentTimeMillis();
            init();
            solve();
            out.close();
            long t2 = System.currentTimeMillis();
            System.err.println("Time = " + (t2 - t1));
        } catch (Exception e) {
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    public long check(int[] a, long start) {
        long current = start;
        for (int i = 0; i < a.length; i++) {
            if (current % a[i] != 0) {
                current = (current / a[i]) * a[i];
            }
        }
        return current;
    }

    public void solve() throws IOException {
        int n = readInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
            sum += a[i];
        }

        if (n == 1) {
            out.print(a[0]);
            return;
        }

        int mid = sum / 2;
        BitSet currentBitSet = new BitSet();
        currentBitSet.set(a[0]);
        int currSum = 2000 * 2000;
        for (int i = 1; i < n; i++) {
            BitSet newBitSet = new BitSet();
            newBitSet.or(currentBitSet);

            int currBit = 0;
            while (1 > 0) {
                int nextSetBit = currentBitSet.nextSetBit(currBit);
                if (nextSetBit == -1) {
                    break;
                }
                currBit = nextSetBit + 1;
                int nextSum = nextSetBit + a[i];
                if (nextSum >= mid) {
                    if (nextSum <= currSum) {
                        currSum = nextSum;
                    }
                }
                newBitSet.set(nextSetBit + a[i], true);
            }
            currentBitSet = newBitSet;
        }
        out.print(currSum);

    }
}