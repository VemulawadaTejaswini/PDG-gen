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
            long N = scanner.nextLong();
            long A = 1;
            long B = N;
            long min = solveF(A, B);
            for (long i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    int f = solveF(i, N / i);
                    if (f < min) {
                        min = f;
                    }
                }
            }
            System.out.println(min);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private int solveF (long a, long b) {
        return a > b ? String.valueOf(a).length() : String.valueOf(b).length();
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