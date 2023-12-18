import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        
        int n = in.nextInt();
        int k = in.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = in.nextInt();
        
        int curGCD = list[0];
        int max = list[0];
        for (int i = 1; i < n; i++) {
            curGCD = gcd(curGCD, list[i], 1);
            max = Math.max(max, list[i]);
        }
        
        if (max >= k && (max - k) % curGCD == 0) {
            System.out.println("POSSIBLE");
        } else System.out.println("IMPOSSIBLE");
    }
    
    static int gcd(int a, int b, int i) {
            if (a == b) {
                return a;
            } else if (a % 2 == 0 && b % 2 == 0) {
                return gcd(a / 2, b / 2, i * 2);
            } else if (a % 2 == 0) {
                return gcd(a / 2, b, i);
            } else if (b % 2 == 0) {
                return gcd(a, b / 2, i);
            } else if (a > b) {
                return gcd(a - b, b, i);
            } else return gcd(a, b - a, i);
        
    }
    

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
