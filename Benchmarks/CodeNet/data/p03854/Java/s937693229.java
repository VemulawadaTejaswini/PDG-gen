/**
 * @Author Mehdi Maick
 * Created on 10/12/2016.
 */

import java.util.*;
import java.io.*;

import static java.lang.Math.*;

public class Main {
    static HashMap<String, Boolean> memo = new HashMap<>();

    static boolean f(String s) {
        if (s.equals("eraser") || s.equals("dream") || s.equals("dreamer") || s.equals("erase")) return true;
        int n = s.length();
        if (n < 5) return false;
       
        String sub = s.substring(0, 5);
        boolean ans = false;
        if (sub.equals("dream")) {
            ans |= f(s.substring(5));
            if (n >= 7 && s.charAt(5) == 'e' && s.charAt(6) == 'r')
                ans |= f(s.substring(7));
        } else if (sub.equals("erase")) {
            ans |= f(s.substring(5));
            if (n >= 7 && s.charAt(5) == 'e' && s.charAt(6) == 'r')
                ans |= f(s.substring(7));
        }
      
        return ans;
    }

    public static void solve(FastReader fs, PrintWriter pw) {
        String s = fs.next();

        pw.println((f(s) ? "YES" : "NO"));

    }

    public static void main(String[] args) throws Exception {
        FastReader fs = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        solve(fs, pw);

        fs.close();
        pw.close();
    }

    static class FastReader {

        BufferedReader reader;
        StringTokenizer st;

        FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
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

        char nextChar() {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i++] = nextInt();
            }
            return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            int i = 0;
            while (i < n) {
                arr[i++] = nextLong();
            }
            return arr;
        }

        int[] nextIntArrayOneBased(int n) {
            int[] arr = new int[n + 1];
            int i = 1;
            while (i <= n) {
                arr[i++] = nextInt();
            }
            return arr;
        }

        long[] nextLongArrayOneBased(int n) {
            long[] arr = new long[n + 1];
            int i = 1;
            while (i <= n) {
                arr[i++] = nextLong();
            }
            return arr;
        }

        void close() {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("There's been an error trying closing the reader ");
                e.printStackTrace();
            }
        }
    }


}