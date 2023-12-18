import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static class FastReader {
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

    public static long gcd(long a, long b) {
        long temp = 0;
        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static List<Long> findCommonDivisors(long gcd) {
        long limit = (long) Math.ceil(Math.sqrt(gcd));
        List<Long> divisors = new ArrayList<>();
        for (long i = 1; i <= limit; i += 2) {
            if (gcd % i == 0 && gcd / i != i) {
                divisors.add(i);
            }
        }
        if (gcd % 2L == 0 && gcd / 2L != 2L) {
            divisors.add(2L);
        }
        return divisors;
    }

    public static Set<Long> findCoprimes(List<Long> divisors) {
        Set<Long> coprimes = new HashSet<>();
        for (int i = 0; i < divisors.size() - 1; i++) {
            for (int j = i + 1; j < divisors.size(); j++) {
                if (gcd(divisors.get(i), divisors.get(j)) == 1) {
                    coprimes.add(divisors.get(i));
                    coprimes.add(divisors.get(j));
                }
            }
        }
        return coprimes;
    }

    public static void main(final String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out, true);

        long a = in.nextLong();
        long b = in.nextLong();

        long gcd = gcd(a, b);
        List<Long> divisors = findCommonDivisors(gcd);

        Set<Long> coprimes = new HashSet<>();
        for (int i = 0; i < divisors.size() - 1; i++) {
            for (int j = i + 1; j < divisors.size(); j++) {
                if (gcd(divisors.get(i), divisors.get(j)) == 1) {
                    coprimes.add(divisors.get(i));
                    coprimes.add(divisors.get(j));
                }
            }
        }

        long answer = coprimes.isEmpty() ? 1 : coprimes.size();
        out.println(answer);
    }
}
