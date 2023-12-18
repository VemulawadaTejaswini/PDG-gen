import java.io.*;
import java.util.*;
public class Main{
	final public static int MOD = (int)1e9+7;
	public static long dp1[][];
	public static int arr[];
	public static long tot[];
    public static void main(String[] args) throws IOException{
    	FastScanner sc = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
    	int n= sc.nextInt();
    	dp1 = new long[n][n];
    	tot = new long[n+1];
    	tot[0] = 0;
    	for(int i=0; i<n; i++) {
    		Arrays.fill(dp1[i], -1);
    	}
    	arr = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = sc.nextInt();
    		tot[i+1] = tot[i]  + arr[i];
    	}
    	long ans = go(0,n-1);
    	out.println(2*ans-(tot[n]));
    	out.close();
    }
    public static long go(int start, int end) {
    	if(start == end) {
    		return arr[start];
    	}
    	if(dp1[start][end]!=-1) return dp1[start][end];
    	dp1[start][end] = tot[end+1]-tot[start] - Math.min(go(start+1, end), go(start, end-1));
    	return dp1[start][end];
    	
    }
    public static class FastScanner {
    	BufferedReader br;
    	StringTokenizer st;

    	public FastScanner(String s) {
    		try {
    			br = new BufferedReader(new FileReader(s));
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}
    	}

    	public FastScanner() {
    		br = new BufferedReader(new InputStreamReader(System.in));
    	}
    	
    	String nextToken() {
    		while (st == null || !st.hasMoreElements()) {
    			try {
    				st = new StringTokenizer(br.readLine());
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    		return st.nextToken();
    	}

    	String nextLine() {
    		st = null;
    		try {
    			return br.readLine();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return null;
    	}

    	int nextInt() {
    		return Integer.parseInt(nextToken());
    	}

    	long nextLong() {
    		return Long.parseLong(nextToken());
    	}

    	double nextDouble() {
    		return Double.parseDouble(nextToken());
    	}
    }
}
