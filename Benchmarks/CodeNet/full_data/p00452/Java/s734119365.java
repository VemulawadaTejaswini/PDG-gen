/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;

/**
 *
 * @author baito
 */
public class Main {

    static StringBuilder sb = new StringBuilder();
    static FastScanner sc = new FastScanner(System.in);
    static int N, M, max = 0;
    static int[] A, C2;

    public static void main(String[] args) {
        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();
            if( N == 0)
                break;
            
            A = new int[N];
            C2 = new int[N * N];

            //1
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                searchMax(A[i]);
            }
            //2
            makeC2();
            Arrays.sort(C2);

            //3
            for (int i = 0; i < N; i++) {
                int tempMax = binarysearch(C2, 0, N * N, A[i]);
                //max = Math.max(max, tempMax);
                searchMax(tempMax);
            }
            //4
            for (int i = 0; i < N * N; i++) {
                int tempMax = binarysearch(C2, 0, N * N, C2[i]);
                //max = Math.max(max, tempMax);
                searchMax(tempMax);

            }
            System.out.println(max);
            max = 0;
        }
    }

    //条件を満たす最大値、あるいは最小値を求める
    static int binarysearch(int[] A, int ok, int ng, int sum) {
        //int ok = 0; //解が存在する
        //int ng = N; //解が存在しない
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (sum + A[mid] < M) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return sum + A[ok];
    }

    private static void makeC2() {
        for (int i = 0, ite = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C2[ite] = A[i] + A[j];
                searchMax(C2[ite]);
                ite++;
            }
        }
    }

    private static void searchMax(int a) {
        if (a <= M) {
            max = Math.max(max, a);
        }

    }

    static int gcd(int n, int r) {
        return r == 0 ? n : gcd(r, n % r);
    }

    static long gcd(long n, long r) {
        return r == 0 ? n : gcd(r, n % r);
    }

    static <T> void swap(T[] x, int i, int j) {
        T t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    static void swap(int[] x, int i, int j) {
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    static class FastScanner {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        /*public String nextChar(){
            return (char)next()[0];
        }*/
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public int[][] nextIntArray2(int h, int w) {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < w; wi++) {
                    a[hi][wi] = nextInt();
                }
            }
            return a;
        }

        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public char[] nextCharArray(int n) {
            char[] a = next().toCharArray();

            return a;
        }

        public char[][] nextCharArray2(int h, int w) {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }

        public char[][] nextWrapCharArray2(int h, int w) {
            char[][] a = new char[h + 2][w + 2];

            for (int i = 1; i < h + 1; i++) {
                a[i] = (" " + next() + " ").toCharArray();
            }
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public long[][] nextLongArray2(int h, int w) {
            long[][] a = new long[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < h; wi++) {
                    a[h][w] = nextLong();
                }
            }
            return a;
        }
    }
}

