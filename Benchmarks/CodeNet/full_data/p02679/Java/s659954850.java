import java.io.*;
import java.util.*;

public class Main {
    static long mod = 1000000007;
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int zero = 0;
		HashMap<Pair<Long,Long>,Pair<Long,Long>> map = new HashMap<Pair<Long,Long>,Pair<Long,Long>>();
		for(int i = 0; i < n; i++){
		    long x = sc.nextLong();
		    long y = sc.nextLong();
		    if(x == 0 && y == 0){
		        zero++;
		        continue;
		    }
		    long g = gcd(Math.abs(x),Math.abs(y));
		    x /= g;
		    y /= g;
		    if(y < 0){
		        x = -x; 
		        y = -y;
		    }
		    if(y == 0 && x < 0){
		        x = -x; 
		        y = -y;
		    }
		    boolean rot90 = (x <= 0);
		    if(rot90){
		        long tmp = x;
		        x = y; 
		        y = -tmp;
		    }
            Pair<Long,Long> p = new Pair(x,y);
            Pair<Long,Long> cnt = map.getOrDefault(p,new Pair(0L,0L));
            if(rot90){
                cnt.first++;
            }else{
                cnt.second++;
            }
		    map.put(p,cnt);
		}
		long ans = 1;
		for(Map.Entry<Pair<Long,Long>,Pair<Long,Long>> e : map.entrySet()){
		    Pair<Long,Long> k = e.getKey();
		    Pair<Long,Long> v = e.getValue();
		    //System.out.println(k.first + " "+k.second + " " + v.first + " " + v.second);
		    long s = v.first;
		    long t = v.second;
		    long now = 1;
		    now += rep2(2,s)-1;
		    now %= mod;
		    now += rep2(2,t)-1;
		    now %= mod;
		    ans *= now;
		    ans %= mod;
		}
		ans--;
		ans += zero;
		pw.println(ans%mod);
		pw.close();
	}
	
	private static long gcd(long a, long b){
        while (b > 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static long rep2(long b, long n){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2)%mod;
        if(n % 2 == 0){
            return (long)(bn%mod*bn%mod)%mod;
        }else{
            return (long)(bn%mod*bn%mod)%mod*b%mod;
        }
    }
    
}

class Pair<F, S> {
    public F first;
    public S second;

    public Pair (F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals (Object obj) {
        if (! (obj instanceof Pair))
            return false;
        Pair pair = (Pair) obj;
        return (first.equals (pair.first) && second.equals (pair.second));
    }

    @Override
    public int hashCode () {
        return first.hashCode () ^ second.hashCode ();
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

