import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String a = sc.next();
        int c = 0;
        char p1 = a.charAt(0);
        char p2 = a.charAt(1);
        char p3 = a.charAt(2);
        if (p1 == 'R' && p2 == 'R')
            c++;
        if (p2 == 'R' && p3 == 'R')
            c++;
        if (p3 == 'R' && p1 == 'R')
            c++;
        if (p1 == 'R' && p2 == 'R' && p3 == 'R')
            c++;
        System.out.println(c);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}