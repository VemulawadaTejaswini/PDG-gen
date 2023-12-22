import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        DSU dsu = new DSU(n);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int t = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(t == 0){
                dsu.merge(a, b);
            }else if(t == 1){
                if(dsu.same(a, b)){
                    pw.println(1);
                }else{
                    pw.println(0);
                }
            }
        }
        pw.close();
    }
}

class DSU{
    private int n;
    private int[] parentOrSize;
    
    public DSU(int n){
        this.n = n;
        this.parentOrSize = new int[n];
        Arrays.fill(parentOrSize,-1);
    }
    
    int merge(int a, int b){
        if(!(0 <= a && a < n) || !(0 <= b && b < n)){
            // この式が成立しない物は動作しません。
            return -1;
        }
        int x = leader(a);
        int y = leader(b);
        if(x == y) return x;
        if(-parentOrSize[x] < -parentOrSize[y]){
            int tmp = x;
            x = y;
            y = tmp;
        }
        parentOrSize[x] += parentOrSize[y];
        parentOrSize[y] = x;
        return x;
    }
    
    boolean same(int a, int b){
        if(!(0 <= a && a < n) || !(0 <= b && b < n)){
            // この式が成立しない物は動作しません。
            return false;
        }
        return leader(a) == leader(b);
    }
    
    int leader(int a){
        if (parentOrSize[a] < 0){
            return a;
        }else{
            parentOrSize[a] = leader(parentOrSize[a]);
            return parentOrSize[a];
        }
    }

    int size(int a) {
        if(!(0 <= a && a < n)){
            // この式が成立しない物は動作しません。
            return -1;
        }
        return -parentOrSize[leader(a)];
    }
    
    ArrayList<ArrayList<Integer>> groups(){
        int[] leaderBuf = new int[n];
        int[] groupSize = new int[n];
        for(int i = 0; i < n; i++){
            leaderBuf[i] = leader(i);
            groupSize[leaderBuf[i]]++;
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            result.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            result.get(leaderBuf[i]).add(i);
        }
        return result;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
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

