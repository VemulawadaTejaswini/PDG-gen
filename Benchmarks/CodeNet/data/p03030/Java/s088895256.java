import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        ArrayList<Restaurant> rl = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            int p = sc.nextInt();
            rl.add(new Restaurant(p,i+1,s));
        }
        Collections.sort(rl);
        for(Restaurant r : rl){
            System.out.println(r.i);
        }
    }
}

class Restaurant implements Comparable<Restaurant>{
    int p,i;
    String c;
    public Restaurant(int p,int i,String c){
        this.p = p;
        this.i = i;
        this.c = c;
    }
    
    public int compareTo(Restaurant r){
        if(this.c.compareTo(r.c) <= -1){
            return -1;
        }else if(this.c.compareTo(r.c) >= 1){
            return 1;
        }else{
            if(this.p > r.p){
                return -1;   
            }else if(this.p < r.p){
                return 1;
            }else{
                return 0;
            }
        }
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
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    } 
}
