import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            if (N == 2) {
                System.out.println(Math.max(A[0], A[1]));
                return;
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                int a,b,c;
                b = A[i];
                if (i == 0)  {
                    a = A[N-1];
                    c = A[i+1];
                } else if (i == N-1){
                    a = A[i-1];
                    c = A[0];
                } else {
                    a = A[i-1];
                    c = A[i+1];
                }

                int[] tmp = {a,b,c};
                int hoge1 = gcd(tmp);
                int hoge2 = gcd(a,c);
                if (hoge1 != hoge2) {
                    System.out.println(hoge2);
                    return;
                }
            }
            System.out.println(gcd(A));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    private int gcd(int[] param) {
        final int len = param.length;
        int g = gcd(param[0], param[1]);
        for (int i = 1; i < len - 1; i++) {
            g = gcd(g, param[i+1]);
        }
        return g;
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}