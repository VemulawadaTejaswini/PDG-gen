import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author shubhamsaxena
 * Solution is at the Top
 */
class Main {

    private final long MOD = (int) 1e9 + 7;

    HashSet<Integer>[] segTree;

    private void solve() {
        int n = inpi(), q = inpi();
        int[] c = inpia(n);
        int h = (int) Math.ceil(Math.log(n) / Math.log(2));
        int h1 = (int) Math.pow(2, h + 1) - 1;
        segTree = new HashSet[h1];
        for (int i = 0; i < h1; i++) {
            segTree[i] = new HashSet<>();
        }
        buildST(c, 0, 0, n - 1);
        for (int i = 0; i < q; i++) {
            int l = inpi() - 1, r = inpi() - 1;
            out.println(query(l, r, 0, 0, n - 1).size());
        }
    }

    public HashSet<Integer> query(int l, int r, int node, int start, int end) {
        if (l <= start && r >= end)
            return segTree[node];
        if (end < l || start > r)
            return new HashSet<>();
        int mid = (start + end) >> 1;
        HashSet<Integer> left = query(l, r, 2 * node + 1, start, mid);
        HashSet<Integer> right = query(l, r, 2 * node + 2, mid + 1, end);
        HashSet<Integer> set = new HashSet<>();
        set.addAll(left);
        set.addAll(right);
        return set;
    }

    public HashSet<Integer> buildST(int[] arr, int node, int low, int high) {
        if (low > high) return new HashSet<>();
        if (low == high) {
            HashSet<Integer> set = new HashSet<>();
            set.add(arr[low]);
            segTree[node] = set;
            return segTree[node];
        }
        int mid = (low + high) >> 1;
        HashSet<Integer> left = buildST(arr, 2 * node + 1, low, mid);
        HashSet<Integer> right = buildST(arr, 2 * node + 2, mid + 1, high);
        segTree[node] = new HashSet<>();
        segTree[node].addAll(left);
        segTree[node].addAll(right);
        return segTree[node];
    }

    public void SieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        // Print all prime numbers
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                //  System.out.print(p+" ");
                // primes[p] = true;
            }
        }
        // return list;
    }

    InputStream obj;
    PrintWriter out;
    String check = "";

    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().main1();
            }
        }, "1", 1 << 26).start();
    }

    void main1() {
        out = new PrintWriter(System.out);
        obj = check.isEmpty() ? System.in : new ByteArrayInputStream(check.getBytes());
        solve();
        out.flush();
        out.close();
    }

    private byte[] inbuffer = new byte[1024];
    private int lenbuffer = 0, ptrbuffer = 0;

    int readByte() {
        if (lenbuffer == -1) {
            throw new InputMismatchException();
        }
        if (ptrbuffer >= lenbuffer) {
            ptrbuffer = 0;
            try {
                lenbuffer = obj.read(inbuffer);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
        }
        if (lenbuffer <= 0) {
            return -1;
        }
        return inbuffer[ptrbuffer++];
    }

    boolean isSpaceChar(int c) {
        return (!(c >= 33 && c <= 126));
    }

    int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
        return b;
    }

    String inps() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    int inpi() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    long inpl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    float inpf() {
        return Float.parseFloat(inps());
    }

    double inpd() {
        return Double.parseDouble(inps());
    }

    char inpc() {
        return (char) skip();
    }

    int[] inpia(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = inpi();
        }
        return a;
    }

    long[] inpla(int n) {
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = inpl();
        }
        return a;
    }

    String[] inpsa(int n) {
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = inps();
        }
        return a;
    }

    double[][] inpdm(int n, int m) {
        double a[][] = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = inpd();
            }
        }
        return a;
    }

    int[][] inpim(int n, int m) {
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = inpi();
            }
        }
        return a;
    }
}