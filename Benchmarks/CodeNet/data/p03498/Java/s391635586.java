//package arc086;

import java.io.*;
import java.util.*;

public class Main {
    public FastScanner in;
    public PrintWriter out;

    public class Pair {
        public int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void solve() {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        ArrayList<Pair> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (arr[i - 1] >= 0 && arr[i] >= 0) {
                    arr[i] += arr[i - 1];
                    ans.add(new Pair(i - 1, i));
                } else if (arr[i - 1] < 0 && arr[i] < 0) {
                    arr[i - 1] += arr[i];
                    ans.add(new Pair(i, i - 1));
                } else {
                    int ratio = arr[i - 1] / arr[i] * -1;
                    if (ratio > 1) {
                        arr[i] += arr[i - 1];
                        ans.add(new Pair(i - 1, i));
                        if (arr[i] < arr[i - 1]) {
                            arr[i] += arr[i - 1];
                            ans.add(new Pair(i - 1, i));
                        }
                    } else {
                        arr[i - 1] += arr[i];
                        ans.add(new Pair(i, i - 1));
                        if (arr[i] < arr[i - 1]) {
                            arr[i - 1] += arr[i];
                            ans.add(new Pair(i, i - 1));
                        }
                    }
                }
            }
        }
        out.println(ans.size());
        for (Pair p : ans) {
            out.println((p.first + 1) + " " + (p.second + 1));
        }
    }

    public void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    public void run() {
        try {
            in = new FastScanner(new File("input.txt"));
            out = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        solve();

        out.close();
    }

    public class FastScanner {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public FastScanner(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public FastScanner(File file) {
            try {
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}

