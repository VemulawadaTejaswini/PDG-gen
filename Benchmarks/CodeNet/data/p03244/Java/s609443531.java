import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = in.nextInt();
        int[] seq = in.nextIntArray(n);
        Map<Integer, Integer> evens = new HashMap<>();
        Map<Integer, Integer> odds = new HashMap<>();
        for (int i = 0; i < n; i += 2) {
            evens.put(seq[i], evens.getOrDefault(seq[i], 0) + 1);
        }
        for (int i = 1; i < n; i += 2) {
            odds.put(seq[i], odds.getOrDefault(seq[i], 0) + 1);
        }
        int maxFreqE = 0;
        int numE = 0;
        int maxFreqO = 0;
        int numO = 0;
        for (int e : evens.keySet()) {
            int freq = evens.get(e);
            numE = (freq > maxFreqE) ? e : numE;
            maxFreqE = freq > maxFreqE ? freq : maxFreqE;
        }
        for (int o : odds.keySet()) {
            int freq = odds.get(o);
            numO = (freq > maxFreqO) ? o : numO;
            maxFreqO = freq > maxFreqO ? freq : maxFreqO;
        }

        if (numE == numO) {
            if (maxFreqE > maxFreqO) {
                maxFreqO = 0;
                if (odds.keySet().size() != 1) {
                    for (int o : odds.keySet()) {
                        int freq = odds.get(o);
                        maxFreqO = (freq > maxFreqO && o != numO) ? freq : maxFreqO;
                    }
                }
            } else {
                maxFreqE = 0;
                if (evens.keySet().size() != 1) {
                    for (int e : evens.keySet()) {
                        int freq = evens.get(e);
                        maxFreqE = (freq > maxFreqE && e != numE) ? freq : maxFreqE;
                    }
                }
            }
        }
        out.println(n / 2 - maxFreqE + n / 2 - maxFreqO);


        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
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
