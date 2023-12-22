import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        long n = sc.nextLong();

        Vector<Integer> prime = VecPrime(n);
        TreeSet<Long> treeSet = new TreeSet<>();

        long ans = 0;
        for (int i : prime) {
            long tmp = i;
            while (n % tmp == 0) {
                n /= tmp;
                treeSet.add(tmp);
                tmp *= i;
                ans++;
            }
        }

        if (n > 1) {
            if (!treeSet.contains(n))
                ans++;
        }

        System.out.println(ans);
    }

    static Vector<Integer> VecPrime(long n) {
        Vector<Integer> primes = new Vector<>();
        primes.add(2);

        final int LENGTH = (int)Math.sqrt(n)+5;
        boolean[] isNotPrime = new boolean[LENGTH/2+1];
        for (int i = 3; i < LENGTH; i+=2) {
            if (!isNotPrime[i/2-1]) {
                for (int j = i*2; j < LENGTH; j+=i)
                    isNotPrime[j/2-1] = true;
                primes.add(i);
            }
        }

        return primes;
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}