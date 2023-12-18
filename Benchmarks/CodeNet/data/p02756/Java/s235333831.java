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
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
 
    Main() {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long ans = 0;
        StringBuilder s = new StringBuilder(200001);// sc.next()
        s.append(sc.next());
      	int Q = sc.nextInt();
        boolean rev = false;
        //List<Character> str = new LinkedList<Character>();
        // for(int i=0;i<s.length();i++)str.add(s.charAt(i));
        for(int i=0;i<Q;i++){
            int type = sc.nextInt();
            if(type == 1){
                rev = !rev;
            }else{
                int f = sc.nextInt();
                char c = sc.next().charAt(0);
                if(f==1){
                    if(!rev) s.insert(0, c);
                    else s.append(c);
                }else{
                    if(rev) s.insert(0, c);
                    else s.append(c);
                }
            }
        }
        if(rev){
            s.reverse();
            // for(int i=1;i<=s.length();i++){
            //     pw.print(s.charAt(s.length()-i));
            // }
            pw.println(s);
        }else{
            pw.println(s);
        }
        // pw.println(ans);
        pw.flush();
        sc.close();
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
