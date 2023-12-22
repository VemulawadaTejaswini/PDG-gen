//package atcoder.beginner177;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));

        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

            solve(1, in, out);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    private static void solve(int q, FastScanner in, PrintWriter out) {
        for (int qq = 0; qq < q; qq++) {
            int n = in.nextInt();
            Integer[] a = in.nextIntArray(n);
            Set<Integer> set = new HashSet<>();
            boolean pairwise = true;
            int mv = 0;
            for(int v : a) {
                if(set.contains(v) && v != 1) {
                    pairwise = false;
                    break;
                }
                set.add(v);
                mv = Math.max(mv, v);
            }

            if(pairwise) {
                pairwise = generatePrimeStatus(mv, set);
                if(pairwise) {
                    out.println("pairwise coprime");
                }
            }
            else {
                int v = findGcdForAll(a);
                if(v == 1) {
                    out.println("setwise coprime");
                }
                else {
                    out.println("not coprime");
                }
            }
        }
        out.close();
    }

    static int findGcdForAll(Integer[] nums) {
        int gcd = gcdUtil(nums[1], nums[0]);

        for(int i = 2; i < nums.length; i++) {
            gcd = gcdUtil(nums[i], gcd);
        }
        return gcd;
    }
    static int gcdUtil(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcdUtil(b, a % b);
    }

    static boolean generatePrimeStatus(int n, Set<Integer> set) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for(int p = 2; p * p <= n; p++) {
            if(prime[p]) {
                int cnt = 1;
                for(int i = p * p; i <= n; i += p) {
                    if(set.contains(i)) {
                        cnt++;
                    }
                    if(cnt > 1) {
                        return false;
                    }
                    prime[i] = false;
                }
            }
        }
        return true;
    }

    private static class BinarySearch {
        // return the right most index i such that a[i] <= t
        private static int rightMostUpperBound(Integer[] a, int t) {
            int l = 0, r = a.length - 1;
            while (l < r - 1) {
                int mid = l + (r - l) / 2;
                if (a[mid] <= t) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            if (a[r] <= t) {
                return r;
            } else if (a[l] <= t) {
                return l;
            }
            return -1;
        }

        // return the left most index i such that a[i] >= t
        private static int leftMostLowerBound(Integer[] a, int t) {
            int l = 0, r = a.length - 1;
            while (l < r - 1) {
                int mid = l + (r - l) / 2;
                if (a[mid] >= t) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (a[l] >= t) {
                return l;
            } else if (a[r] >= t) {
                return r;
            }
            return -1;
        }

        // Find the start and end index of a given t in a sorted(ascending) array; return [-1, -1] is t is not found
        private static int[] searchRange(Integer[] a, int t) {
            int first = firstPos(a, t);
            int last = firstPos(a, t + 1) - 1;
            if (first <= last) {
                return new int[]{first, last};
            }
            return new int[]{-1, -1};
        }

        private static int firstPos(Integer[] a, int t) {
            int first = a.length;
            int l = 0, r = a.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (a[mid] >= t) {
                    first = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return first;
        }
    }

    private static class NumberTheory {
        private static long modularAdd(long a, long b, int mod) {
            long sum = a + b;
            if (sum >= mod) {
                sum -= mod;
            }
            return sum;
        }

        private static long modularSubtract(long a, long b, int mod) {
            long diff = a - b;
            if (diff < 0) {
                diff += mod;
            }
            return diff;
        }

        private static long fastModPow(long x, int n, long mod) {
            if (n == 0) {
                return 1;
            }
            long coeff = 1, base = x;
            while (n > 1) {
                if (n % 2 != 0) {
                    coeff = (coeff * base % mod);
                }
                base = (base * base % mod);
                n = n / 2;
            }
            long res = coeff * base % mod;
            return res;
        }

        private static long gcd(long a, long b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        private static long[] factorial(int n, long mod) {
            long[] factor = new long[n + 1];
            factor[0] = 1;
            for (int i = 1; i <= n; i++) {
                factor[i] = factor[i - 1] * i % mod;
            }
            return factor;
        }

        private static long modInv_EEA(long a, long mod) {
            long[] res = solveGcdEquation(a, mod);
            if (res[2] != 1) {
                // a and m are not coprime, modular inverse of a by m does not exist.
                return -1;
            }
            return (res[0] % mod + mod) % mod;
        }

        private static long[] solveGcdEquation(long a, long b) {
            if (b == 0) {
                return new long[]{1, 0, a};
            }
            long[] res = solveGcdEquation(b, a % b);
            return new long[]{res[1], res[0] - (a / b) * res[1], res[2]};
        }

        private static long binomialCoefficient(long[] factorial, long n, long k, long mod) {
            return factorial[(int) n] * modInv_EEA(factorial[(int) k], mod) % mod
                    * modInv_EEA(factorial[(int) (n - k)], mod) % mod;
        }
    }

    private static class Graph {
        private static int UNVISITED = 0;
        private static int VISITING = -1;
        private static int VISITED = 1;

        private static Stack<Integer> topologicalSort(Set<Integer>[] g) {
            Stack<Integer> stack = new Stack<>();
            int[] state = new int[g.length];

            for (int node = 0; node < g.length; node++) {
                if (!topoSortHelper(g, stack, state, node)) {
                    return null;
                }
            }
            return stack;
        }

        private static boolean topoSortHelper(Set<Integer>[] g, Stack<Integer> stack, int[] state, int currNode) {
            if (state[currNode] == VISITED) {
                return true;
            } else if (state[currNode] == VISITING) {
                return false;
            }
            state[currNode] = VISITING;
            for (int neighbor : g[currNode]) {
                if (!topoSortHelper(g, stack, state, neighbor)) {
                    return false;
                }
            }
            state[currNode] = VISITED;
            stack.push(currNode);
            return true;
        }
    }

    private static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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

        Integer[] nextIntArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        Long[] nextLongArray(int n) {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }
    }
}


