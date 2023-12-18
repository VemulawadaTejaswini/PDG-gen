

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
//        int t = in.nextInt();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            HashMap<Integer, String> map = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                String str = in.next();
                int x = xor(str);
                if (map.containsKey(x)){
                    if (check(map.get(x), str)){
                        count += map2.get(x);
                        map2.put(x, map2.get(x) + 1);
                    }
                }else{
                    map.put(x, str);
                    map2.put(x, 1);
                }
            }
            out.println(count);
        }
        public static int nCr(int n){
            return n * (n - 1) / 2;
        }
        public static int xor(String a){
            int ans = 0;
            for (int i = 0; i < a.length(); i++) {
                ans ^= a.charAt(i);
            }
            return ans;
        }
        public static boolean check(String a, String b){
            int ans = 0;
            for (int i = 0; i < a.length(); i++) {
                ans ^= a.charAt(i) ^ b.charAt(i);
            }
            return ans == 0;
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public String nextLine() throws IOException {
            return reader.readLine().trim();
        }
    }
}
