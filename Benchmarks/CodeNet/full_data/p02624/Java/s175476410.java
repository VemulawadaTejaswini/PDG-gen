
import java.util.*;
import java.io.*;

/**
 * @author AnonymousP
 */
//Tom_Is_a_good_mentor
public class Main {

    static Vector<Integer> prime_vector = new Vector<>();
    static Vector<Integer> prime_bitWise = new Vector<>();

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //sum = sum + i + NOD(i);
            int ans = i*NOD(i);
            sum+=ans;
            //System.out.println(i+" * "+NOD(i));
        }

        out.println(sum);
        out.flush();
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    //****************************************************//

    public static void sieve(int n) {

        boolean prime[] = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (prime[i] == true) {
                //ans.add(i);
                for (int j = i * i; j <= n; j += (2 * i)) {
                    prime[j] = false;

                }
                //  ans.add(i);
            }
        }
        prime[1] = false;
        prime_vector.add(2);
        for (int i = 3; i <= n; i += 2) {
            if (prime[i] == true) {
                prime_vector.add(i);
                //System.out.print(i + " ");
            }
        }

    }

    //************************************************************************//
    public static void bitWiseSeive() {
        int max = 90000000;
        int sqrt = (int) Math.sqrt(max);
        int st[] = new int[max >> 6];

        for (int i = 3; i <= sqrt; i += 2) {
            if (check(i, st) == 0) {
                for (int j = i * i, k = i << 1; j < max; j += k) {
                    set(j, st);
                }
            }
        }
        prime_bitWise.add(2);
        for (int i = 3; i < max; i += 2) {
            if (check(i, st) == 0) {
                prime_bitWise.add(i);
            }
        }

    }

    //******METHOD{1} FOR bitWiseSeive****************************************//
    static int check(int z, int st[]) {
        return (st[z >> 6] & (1 << ((z >> 1) & 31)));
    }

    //******METHOD{2} FOR bitWiseSeive****************************************//
    static void set(int z, int st[]) {
        st[z >> 6] |= (1 << ((z >> 1) & 31));
    }

    //************************************************************************//
    public static long eulerT(long n) {
        long r = n;
        if (r == 1) {
            return 1;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                r -= r / i;
            }
        }
        if (n > 1) {
            r -= r / n;
        }
        return r;
    }

    //************************************************************************//
    public static int[] seiveOfeulerT() {
        int n = 50000;
        int phi[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            phi[i] = i;
        }
        for (int i = 2; i <= n; i++) {

            if (phi[i] == i) {
                phi[i] = i - 1;
                for (int j = 2 * i; j <= n; j += i) {
                    phi[j] = (phi[j] / i) * (i - 1);
                }
            }
        }

        return phi;
    }

    //************************************************************************//
    public static int[] getPrimeArray() {

        int[] a = new int[500000];
        boolean[] isPrime = new boolean[500000];

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j < isPrime.length; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        //  a[1] = 2;
        int c = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                a[c] = i;
                c++;
            }
        }
        return a;
    }

    //************************************************************************//
    public static void primeFactorize(int n) {
        int prime[] = getPrimeArray();

        int list[] = new int[128];
        int listSize = 0;
        System.out.println(Arrays.toString(prime));
        //int sqrtN = (int) (Math.sqrt(n));
        for (int i = 0; prime[i] * prime[i] <= n && i < prime.length; i++) {
            if (n % prime[i] == 0) {

                while (n % prime[i] == 0) {
                    n /= prime[i];
                    list[listSize] = prime[i];
                    listSize++;
                }
            }
        }

        if (n > 1) {
            list[listSize] = n;
            System.out.println("LS " + listSize);
            System.out.println("n " + n);
            listSize++;
        }

        for (int i = 0; i < listSize; i++) {
            System.out.println(list[i] + " ");

        }

    }

    //************************************************************************//
    //bigMod(int base, int power, int mod)
    public static int BigMod(int m, long n, int k) {

        if (n == 0) {
            return 1 % k;
        }
        int p = BigMod(m, n / 2, k);
        p = (p * p) % k;
        if (n % 2 == 1) {
            p = (p * m) % k;
        }
        return p;
    }

    //************************************************************************//
    public static long fastmod(long base, long power, long m) {
        long res = 1;

        while (power > 0) {
            if (power % 2 == 0) {

                base = (base * base) % m;
                power = power / 2;
            } else {
                res = (res * base) % m;
                power--;
            }

        }
        return res;
    }

    //************************************************************************//
    public static long fastpow(long base, long power) {
        long res = 1;
        while (power > 0) {
            if (power % 2 == 0) {
                res = base * base;
                power = power / 2;
            } else {
                res = res * base;
                power--;
            }
        }
        return res;
    }

    //************************************************************************//
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;

        } else {
            return gcd(b, a % b);
        }
    }

    //************************************************************************//   
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    //************************************************************************//
    //NUMBER OF DIVISOR
    public static int NOD(int n) {
        int r = 0;
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                r = r + 1;

            } else if (n % i == 0) {

                r = r + 2;
            }
        }
        return r;
    }

    //CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_//
    //*******FAST IO*************FAST IO***************FAST IO****************//
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

   //*******FAST IO*************FAST IO***************FAST IO****************//
}
