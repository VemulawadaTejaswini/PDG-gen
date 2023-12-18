import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int i: new HashSet<Integer>() {{
            add(a);
            add(b);
            add(c);
        }}) {
            if ((i & 1) == 1) {
                odds.add(i);
            } else {
                evens.add(i);
            }
        }

        if (odds.size() == 3 || evens.size() == 3) {
            out.println(opSameParity(a, b, c));
        } else {
            if (odds.size() == 2) {
                Integer[] arrOdds = odds.toArray(new Integer[2]);
                for (int i = 0; i<2; i++) {
                    arrOdds[i]++;
                }
                out.println(opSameParity(arrOdds[0], arrOdds[1], evens.get(0)) + 1);
            } else {
                Integer[] arrEvens = evens.toArray(new Integer[2]);
                for (int i = 0; i<2; i++) {
                    arrEvens[i]++;
                }
                out.println(opSameParity(arrEvens[0], arrEvens[1], odds.get(0)) + 1);
            }
        }

        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
    }

    static int opSameParity(int x, int y, int z) {
        int out = 0;
        int max = Math.max(Math.max(x, y), z);
        for (int i: new ArrayList<Integer>() {{
            add(x);
            add(y);
            add(z);
        }}) {
            while(i < max) {
                i += 2;
                out++;
            }
        }
        return out;
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public double[] nextDoubleArray(int n) {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public char[] nextCharArray(int n) {
            char[] arr = nextLine().trim().replaceAll("\\s", "").toCharArray();
            return arr;
        }

        public String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }
}
