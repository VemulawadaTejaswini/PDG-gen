import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    static final int MOD = 1000000007;
    static final long INF = 1 << 60;
    static final int ALF = 26;

    Main() {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long ans = 0;
        int N = sc.nextInt();
        long[] A;
        A = sc.nextLongArray(N);
        for(int w = 1;w<N;w++){
            for(int i=0;i+w<N;i++){
                if(Math.abs(A[i]+A[i+w]) == w)ans++;
            }
        }
        
        ArrayList<Long> B = new ArrayList<Long>(N);
        for(int i=0;i<N;i++){
            B.add(A[i]-i);
        }
        HashMap<Long,Integer> bmap = new HashMap<Long,Integer>();
        for(int i=0;i<N;i++){
            bmap.put(B.get(i), bmap.getOrDefault(B.get(i), 0)+1);
        }
        ArrayList<Long> C = new ArrayList<Long>(N);
        for(int i=0;i<N;i++){
            C.add(A[N-i-1]+i);
        }
        HashMap<Long,Integer> cmap = new HashMap<Long,Integer>();
        for(int i=0;i<N;i++){
            cmap.put(C.get(i), cmap.getOrDefault(C.get(i), 0)+1);
        }
        
        for(long num:bmap.keySet()){
            if(num<0)continue;
            long positive = bmap.get(num);
            long negative = cmap.getOrDefault(-num,0);
            ans += positive*negative;
        }
        pw.println(ans);
        pw.flush();
    }

    public static void main(String[] args) {
        new Main();
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

    public ArrayList<Integer> nextIntList(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            a.add(nextInt());
        return a;
    }

    public ArrayList<Long> nextLongList(int n) {
        ArrayList<Long> a = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++)
            a.add(nextLong());
        return a;
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