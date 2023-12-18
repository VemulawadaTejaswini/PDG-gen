import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        long N = sc.nextLong();
        LinkedList<Long> divisors1 = new LinkedList<>();
        LinkedList<Long> divisors2 = new LinkedList<>();
        for (long i=1; i<=N; i++) {
            if (N%i==0) {
                divisors1.add(i);
                divisors2.add(N/i);
            }
        }
        long min = Long.MAX_VALUE;
        while (!divisors1.isEmpty()) {
            long a = divisors1.pop();
            long b = divisors2.pop();
            long temp = (long)(a+b-2);
            if (temp<min) {
                min = temp;
            }
        }
        System.out.println(min);
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
