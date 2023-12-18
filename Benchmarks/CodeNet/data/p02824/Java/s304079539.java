import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    static int N;
    static long M;
    static long V;
    static long P;
    static int[] A;
    static long[] sumdp;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        P = sc.nextInt();
        A = sc.nextIntArray(N);
        Arrays.sort(A);
        System.err.println(Arrays.toString(A));
        sumdp = new long[N];
        sumdp[0] = A[0];
        for (int i = 1; i < N; i++) {
            sumdp[i] = sumdp[i - 1] + A[i];
        }
        System.out.println(N-binarySearch(A));
    }

    static boolean isOK(int index, int[] arr) {
        long tMax = (long) arr[index] + M;
        if(tMax < arr[N-(int)P]){            
            System.err.println(index+" is false");
            return false;
        }
        long dust = (long) M * (V - 1 - (P - 1));
        int Mxi = binarySearchMx(tMax, arr);
        long dustBase = sumdp[Mxi];
        long dustMax = tMax * Mxi;
        if (dustMax - dustBase >= dust) {
            System.err.println(index+" is true");
            return true;
        } else {
            System.err.println(index+" is false");
            return false;
        }
    }

    static int binarySearch(int[] arr) {
        int left = -1;
        int right = arr.length;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (isOK(mid, arr))
                right = mid;
            else
                left = mid;
        }
        return right;
    }

    static boolean isMx(int index, long key, int[] arr) {
        if (arr[index] >= key){            
            // System.err.println(index+" is >= "+key);
            return true;
        }else{            
            // System.err.println(index+" is < "+key);
            return false;
        }
    }

    static int binarySearchMx(long key, int[] arr) {
        int left = -1;
        int right = arr.length;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (isMx(mid, key, arr))
                right = mid;
            else
                left = mid;
        }
        return left;
    }
}

class FastScanner {
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
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}