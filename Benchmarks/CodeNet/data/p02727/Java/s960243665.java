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
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long ans = 0;
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        List<Integer> p = new ArrayList<Integer>();
        List<Integer> q = new ArrayList<Integer>();
        List<Integer> r = new ArrayList<Integer>();
        for(int i=0;i<A;i++){
            p.add(sc.nextInt());
        }
        for(int i=0;i<B;i++){
            q.add(sc.nextInt());
        }
        for(int i=0;i<C;i++){
            r.add(sc.nextInt());
        }
        Collections.sort(p,Comparator.reverseOrder());
        p = p.subList(0, X);
        Collections.sort(q,Comparator.reverseOrder());
        q = q.subList(0, Y);
        Collections.sort(r,Comparator.reverseOrder());
        int pi = p.size()-1;
        int qi = q.size()-1;
        for(int i=0;i<r.size();i++){
            int ret = r.get(i);
            if(pi>=0&&qi>=0){
                if(p.get(pi)<q.get(qi)){
                    if(p.get(pi)<ret){
                        p.set(pi, ret);
                        pi--;
                    }else{
                        break;
                    }
                }else{
                    if(q.get(qi)<ret){
                        q.set(qi, ret);
                        qi--;
                    }else{
                        break;
                    }
                }
            }else{
                if(pi>=0){
                    if(p.get(pi)<ret){
                        p.set(pi, ret);
                        pi--;
                    }else{
                        break;
                    }
                }else if(qi>=0){
                    if(q.get(qi)<ret){
                        q.set(qi, ret);
                        qi--;
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }
        }
        for(int i=0;i<X;i++){
            ans+=p.get(i);
        }
        for(int i=0;i<Y;i++){
            ans+=q.get(i);
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