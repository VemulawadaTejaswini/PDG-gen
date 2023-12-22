import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
static class sardine{
	long deliciousness, fragrantness;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (a ^ (a >>> 32));
		result = prime * result + (int) (b ^ (b >>> 32));
		result = prime * result + sign;
		return result;
	}
	public sardine() {}
	public sardine(long a, long b, int type) {
		this.a = a;
		this.sign = type;
		this.b = b;
	}
	@Override
	public boolean equals(Object obj) {
		sardine cur = (sardine)obj;
		return (cur.a == this.a && cur.b == this.b && cur.sign == this.sign);
	}
	sardine(long deliciousness, long fragrantness){
		this.deliciousness = deliciousness;
		this.fragrantness = fragrantness;
		this.a = deliciousness;
		this.b = fragrantness;
		this.sign = 1;
		if(b == 0) {
			a = 1;
			b = 0;
		}else if(a == 0) {
			a = 0;
			b = 1;
		}else {
			if((a < 0 && b > 0) || (a > 0 && b < 0))sign = -1;
			else sign = 1;
			a = Math.abs(a);
			b = Math.abs(b);
			long g = ntu.gcd(a, b);
			a /= g;
			b /= g;
		}
	}
	
	long a, b;
	int sign;
}
public static void main(String[] args){

   new Thread(null, null, "Anshum Gupta", 99999999) {
        public void run() {
            try {
                solve();
            } catch(Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }.start();
}
static final long mxx = (long)(1e18+5);
static final int mxN = (int)(1e6);
static final int mxV = (int)(1e6), log = 18;
static long mod = (long)(1e9+7); //998244353;//̇
static final int INF = (int)1e9;
static boolean[]vis;
static ArrayList<ArrayList<Integer>> adj;
static int n, m, k, q, h, w;
static int[]dis, par;
static sardine[]arr;
static NumberTheoryUtils ntu;
public static void solve() throws Exception {
	   // solve the problem here
		s = new MyScanner();
   		out = new PrintWriter(new BufferedOutputStream(System.out), true);
//	   		out = new PrintWriter("output.txt");
        int tc = 1;//s.nextInt();
        ntu = new NumberTheoryUtils();
        while(tc-- > 0){
        	n = s.nextInt();
        	arr = new sardine[n];
        	ConcurrentHashMap<sardine, Integer> mp = new ConcurrentHashMap<sardine, Integer>();
        	long ans = 1;
        	for(int i=0; i<n; i++) {
        		arr[i] = new sardine(s.nextLong(), s.nextLong());
        		mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        		sardine inverse = new sardine(arr[i].b, arr[i].a, -1 * arr[i].sign);
        		long inverseCount = mp.getOrDefault(inverse, 0);
//        		out.println("i = " + i + " inverse count = " + inverseCount);
//        		ans = ntu.addModulo(ans, ntu.powerModulo(2, i - inverseCount));
        	}
//        	for(int i=0; i<n; i++) {
//        		out.println(arr[i].a + " " + arr[i].b + " " + arr[i].sign + " " + arr[i].hashCode());
//        	}
        	for(Map.Entry<sardine, Integer> es : mp.entrySet()) {
        		sardine cur = es.getKey();
        		sardine inverse = new sardine(cur.b, cur.a, -1*cur.sign);
        		long inverseCount = mp.getOrDefault(inverse, 0);
        		ans = ntu.multiplyModulo(ans, ntu.addModulo(ntu.powerModulo(2, es.getValue()),
        				ntu.powerModulo(2, inverseCount))-1);
        		mp.put(cur, 0);
        		mp.put(inverse, 0);
        	}
        	out.println(--ans);
        } 
           
        out.flush();
        out.close();
}


public static PrintWriter out;
public static MyScanner s;
static class MyScanner {

    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public MyScanner(String fileName) {
    	try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
    int[] nextIntArray(int n){
    	int[]a = new int[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    long[] nextlongArray(int n) {
    	long[]a = new long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    Integer[] nextIntegerArray(int n){
    	Integer[]a = new Integer[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    Long[] nextLongArray(int n) {
    	Long[]a = new Long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    char[][] next2DCharArray(int n, int m){
    	char[][]arr = new char[n][m];
    	for(int i=0; i<n; i++) {
    		arr[i] = this.next().toCharArray();
    	}
    	return arr;
    }
    ArrayList<ArrayList<Integer>> readUndirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    		adj.get(v).add(u);
    	}
    	return adj;
    }
    ArrayList<ArrayList<Integer>> readDirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    	}
    	return adj;
    }
    String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

 
}
