
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;


public class Main {
	class Pair{
		int idx;
		int value;
		public Pair(int idx, int value){
			this.idx = idx;
			this.value = value;
		}
	}
	
	int N, M, K;
	Pair[] A;
	
	long[][] dp;
	
	public long dfs(int cnt, int idx){
		if(cnt > K){
			return 0;
		}
		if(idx >= N){
			return Integer.MIN_VALUE;
		}
		if(dp[cnt][idx] != -1) return dp[cnt][idx];
		long max = 0;
		for(int i = idx + 1; i <= idx + M && i < N; i++){
			max = Math.max(max, dfs(cnt + 1, i));
		}
		return dp[cnt][idx] = max + A[idx].value * (long)cnt;
	}
	
	public void solve() {
		N = nextInt();
		M = nextInt();
		K = nextInt();
		A = new Pair[N];
		dp = new long[K + 1][N + 1];
		for(int i = 0; i < dp.length; i++){
			for(int j = 0; j < dp[i].length; j++){
				dp[i][j] = -1;
			}
		}
		for(int i = 0; i < N; i++){
			A[i] = new Pair(i, nextInt());
		}
		long max = 0;
		for(int i = 0; i < N; i++){
			max = Math.max(max, dfs(1, i));
		}
		out.println(max);
		
	}
 
	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
		int c;
		while (!isAlNum(c = read())) {
		}
		StringBuilder build = new StringBuilder();
		build.append((char) c);
		while (isAlNum(c = read())) {
			build.append((char) c);
		}
		return build.toString();
	}

	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;

	private static int read() {
		if (bufferLength < 0)
			throw new RuntimeException();
		if (bufferIndex >= bufferLength) {
			try {
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufferLength <= 0)
				return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}