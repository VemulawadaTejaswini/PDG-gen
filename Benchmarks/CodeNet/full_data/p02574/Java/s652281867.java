import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = readInt();
        }

        int gg = gcd(a[0], a[1]);
        for (int i = 2; i < N; i++) {
            gg = gcd(gg, a[i]);
        }
        if (gg != 1) {
            System.out.println("not coprime");
            return;
        }

        HashSet<Integer> ps = simpleSieve(1000000);

        for (int i = 0; i < N; i++) {
            int c = a[i];
            if (c > 1) {
                if (ps.contains(c)) {
                    ps.remove(c);
                    continue;
                }
                while (true) {
                    int toRemove = -1;
                    for (int p : ps) {
                        if (c % p == 0) {
                            toRemove = p;
                            do {
                                c /= p;
                            } while (c > 0 && c % p == 0);
                        }
                    }
                    if (toRemove > 0) {
                        ps.remove(toRemove);
                    } else break;
                }
                if (c > 1) {
                    System.out.println("setwise coprime");
                    return;
                }

            }
        }

        System.out.println("pairwise coprime");
    }

    static int gcd(int a, int b) {
        while (a != 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        return b;
    }

    static HashSet<Integer> simpleSieve(int limit) {
        final int halfLimit = (limit - 1) / 2;
        // isComposite[p] will become true only if 2p + 3 is composite.
        boolean[] isComposite = new boolean[halfLimit];

        for (int p = 3, squareRoot = (int) Math.sqrt(limit); p <= squareRoot; p += 2) {
            if (!isComposite[(p - 3) / 2]) { // which means p is a prime.
                for (int j = (p * p - 3) / 2; j < halfLimit; j += p)
                    isComposite[j] = true;
            }
        }

        HashSet<Integer> primes = new HashSet<>();
        primes.add(2);
        for (int i = 0, j = 0; i < halfLimit; i += 1) {
            if (!isComposite[i]) primes.add(2 * i + 3);
        }

        return primes;
    }
}
