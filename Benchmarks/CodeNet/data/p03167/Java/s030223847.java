import java.io.*;
import java.util.*;
public class Main{
	final public static int MOD = (int)1e9+7;
	public static int dp[][] = new int[1001][1001];
    public static void main(String[] args) throws IOException{
    	FastScanner sc = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	boolean board[][] = new boolean[h][w];
    	for(int i=0; i<h; i++) {
    		String k = sc.nextToken();
    		for(int j=0; j<w; j++) {
    			board[i][j] = k.charAt(j)=='#';
    		}
    	}
    	if(board[0][0])dp[0][0] = 0;
    	else dp[0][0] = 1;
    	for(int i=1; i<h; i++) {
    		if(board[i][0]) dp[i][0] = 0;
    		else dp[i][0] = dp[i-1][0];
    	}
    	for(int i=1; i<w; i++) {
    		if(board[0][i]) dp[0][i] = 0;
    		else dp[0][i] = dp[0][i-1];
    	}
    	for(int i=1; i<h; i++) {
    		for(int j=1; j<w; j++) {
    			if(board[i][j]) dp[i][j] = 0;
    			else {
    				dp[i][j] = (dp[i-1][j] + dp[i][j-1])%MOD;
    			}
    		}
    	}
    	out.println(dp[h-1][w-1]);
    	out.close();
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
