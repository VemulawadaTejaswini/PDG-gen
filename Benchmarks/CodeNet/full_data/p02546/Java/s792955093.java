package cf;

import java.io.*;
import java.util.*;

public class CF {
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    final static int MAX = 1_000_000+10;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        String s = fs.next().toString();
        System.out.println(s.charAt(s.length() - 1) == 's'? s+"es":s+"s");

        }

    static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b);}
    static final Random random = new Random();

    static void ruffleSort(int[] a) {
        int n = a.length;//shuffle, then sort
        for (int i = 0; i < n; i++) {
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }


}