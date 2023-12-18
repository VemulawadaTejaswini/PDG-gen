import java.util.*;
import java.io.*;
 
public class Main {
    static int ans = 0;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        ArrayList<Dish> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            li.add(new Dish(sc.nextLong(),sc.nextLong()));
        }
        Collections.sort(li);
        long takahashi = 0;
        long aoki = 0; 
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                takahashi += li.get(i).t;
            }else{
                aoki += li.get(i).a;
            }
        }
        System.out.println(takahashi - aoki);
    }
}

class Dish implements Comparable<Dish>{
    long t,a,total;
    public Dish(long t, long a){
        this.t = t;
        this.a = a;
        this.total = t+a;
    }
    public int compareTo(Dish d){
        if(this.total > d.total){
            return -1;
        }else if(this.total > d.total){
            return 1;
        }else{
            return 0;
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
    
    public void close() throws Exception{
        this.reader.close();
        return;
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