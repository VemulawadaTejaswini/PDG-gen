import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;

    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            long[] v = new long[N];
            for (int i = 0; i < N; i++) {
                v[i] = scanner.nextLong();
            }
            Arrays.sort(v);
            double max = 0;
            int count = 0;
            for (int i = A; i <= B; i++) {
                double sum = 0;
                for (int j = 0; j < i; j++) {
                    sum += v[N - j - 1];
                }
                double average = sum / i;
                if (max < average) {
                    max = average;
                    count = i;
                }
            }
            System.out.println(String.format("%.6f", max));
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";

        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}