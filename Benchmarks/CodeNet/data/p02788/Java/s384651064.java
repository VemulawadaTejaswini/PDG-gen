import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<Monster> ml;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextInt();
        long a = sc.nextInt();
        ml = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ml.add(new Monster(sc.nextLong(),sc.nextLong()));
        }
        Collections.sort(ml);
        boolean isMaximum = false;
        int[] rl = new int[n];
        for(int i = 0; i < n; i++){
            if(isMaximum){
                rl[i] = n-1;
                continue;
            }
            rl[i] =  beamSearch(ml.get(i).x+2*d);
            if(rl[i] == n-1){
                isMaximum = true;
            }
        }
        long ans = 0;
        int[] cum = new int[n+1];
        for(int i = 0; i < n; i++){
            long hp = ml.get(i).h-cum[i];
            if(hp <= 0){
                continue;
            }else{
                long cnt = hp/a;
                cnt += hp % a != 0 ? 1 : 0;
                int r = rl[i];
                for(int j = i; j <= r; j++){
                    cum[j] += cnt*a;
                }
                ans += cnt;
            }
        }
        System.out.println(ans);
    }
    
    private static int beamSearch(long v){
        int left = 0;
        int right = ml.size();
        while(right - left > 1){
            int mid = (right + left)/2;
            if(v >= ml.get(mid).x){
                left = mid;
            }else{
                right = mid;
            }
        }
        return left;
    }
}

class Monster implements Comparable<Monster>{
    long x,h;
    public Monster(long x, long h){
        this.x = x;
        this.h = h;
    }
    public int compareTo(Monster m){
        if(this.x < m.x){
            return -1;
        }else if(this.x > m.x){
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
