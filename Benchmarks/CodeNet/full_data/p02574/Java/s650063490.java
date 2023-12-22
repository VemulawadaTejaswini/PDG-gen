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
            int maxV = 0;
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                maxV = Math.max(maxV, a[i]);
            }

            if(checkPairwise(a, maxV)) {
                out.println("pairwise coprime");
            }
            else if(checkSetwise(a)) {
                out.println("setwise coprime");
            }
            else {
                out.println("not coprime");
            }
        }
        out.close();
    }

    static boolean checkPairwise(Integer[] nums, int maxV) {
        Set<Integer> primeSeen = new HashSet<>();
        boolean[] prime = new boolean[maxV + 1];
        int[] smallestPrimeFactor = new int[maxV + 1];
        for(int i = 1; i <= maxV; i++) {
            prime[i] = true;
            smallestPrimeFactor[i] = i;
        }

        for(int i = 2; i * i <= maxV; i++) {
            if(prime[i]) {
                for(int j = i * i; j <= maxV; j += i) {
                    prime[j] = false;
                    if(smallestPrimeFactor[j] == j) {
                        smallestPrimeFactor[j] = i;
                    }
                }
            }
        }

        for(int v : nums) {
            if(v != 1) {
                List<Integer> factors = new ArrayList<>();
                while(smallestPrimeFactor[v] != v) {
                    if(primeSeen.contains(smallestPrimeFactor[v])) {
                        return false;
                    }
                    factors.add(smallestPrimeFactor[v]);
                    v /= smallestPrimeFactor[v];
                }
                if(primeSeen.contains(v)) {
                    return false;
                }
                factors.add(v);
                primeSeen.addAll(factors);                
            }
        }
        return true;
    }

    static boolean checkSetwise(Integer[] nums) {
        int gcd = gcdUtil(nums[1], nums[0]);

        for(int i = 2; i < nums.length; i++) {
            gcd = gcdUtil(nums[i], gcd);
        }
        return gcd == 1;
    }
    static int gcdUtil(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcdUtil(b, a % b);
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


