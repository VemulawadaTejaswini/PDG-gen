import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        long N = nextLong();
        long M = nextLong();

        long low = 0L;
        long high = 1_000_000_000_000_00L;

        long best = 0L;
        while(low <= high) {
            long mid = low + ( high - low ) / 2L;
            if(can(mid, N , M)) {
                best = Math.max(best, mid);
                low = mid + 1;
            } else high = mid - 1;
        }
        writer.println(best);
    }

    private boolean can(long packs, long n, long m) {
        if(m / 2 < packs) return false;
        m -= packs * 2L;
        if(n >= packs) return true;
        long need = 0L;
        if(n < packs) {
            need += (packs - n) * 2L;
        }
        return m >= need;
    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("highcard.in"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("highcard.out");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}