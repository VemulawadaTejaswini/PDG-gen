
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        FastScanner fs = new FastScanner();
        char array[] = sc.next().toCharArray();
        long sum = 0;
        for (char c : array) {
            sum += c - '0';
        }
        System.out.println(sum % 9 == 0 ? "Yes" : "No");
        bw.flush();
    }
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//

    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a) {
            l.add(i);
        }
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
    }

    static class FastScanner {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    static class Pair implements Comparable<Pair> {

        int a, b;

        public Pair(int x, int y) {
            a = x;
            b = y;
        }

        @Override
        public int compareTo(Pair p) {
            return a - p.a;
        }
    }

    static void forl_0(int n, int[] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }

    static void forl_1(int n, int[] array, Scanner sc) {
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
    }

    static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
