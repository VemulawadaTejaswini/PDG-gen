import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static PrintWriter out;
    static CF_Reader in;

    public static void main(String[] args) throws IOException {
        // O(n) time and space
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();

        char[] numbers = in.next().toCharArray();

        long result = 0;
        long moder = 1;
        long prev = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, 1);
        for (int i = numbers.length - 1; i >= 0; i--) {
            long num = (moder * (numbers[i] - '0') + prev) % 2019;
            if (seen.containsKey((int) num)) result += seen.get((int) num);
            seen.merge((int) num, 1, Integer::sum);
            prev = num;
            moder = (moder * 10) % 2019;
        }
        out.println(result);

        out.close();
    }



    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}
