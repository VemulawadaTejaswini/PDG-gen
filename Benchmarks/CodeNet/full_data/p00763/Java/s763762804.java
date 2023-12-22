
import java.io.*;
import java.util.*;

public class Main {

	int N, M, C, S, G;
	int[][][] table;
	int[][][] distance;
	final int MAX = 100_000_000;
	
	public void solve() {
		while (true) {
			N = nextInt();
			if (N == 0)
				break;
			M = nextInt();
			C = nextInt();
			S = nextInt() - 1;
			G = nextInt() - 1;
			distance = new int[C][N][N];
			
			for(int c = 0; c < C; c++){
				for(int i = 0; i < N; i++){
					for(int j = 0; j < N; j++){
						if(i == j) distance[c][i][j] = 0;
						else distance[c][i][j] = MAX;
					}
				}
			}

			for (int i = 0; i < M; i++) {
				int x = nextInt() - 1;
				int y = nextInt() - 1;
				int d = nextInt();
				int c = nextInt() - 1;
				distance[c][x][y] = Math.min(distance[c][x][y], d);
				distance[c][y][x] = Math.min(distance[c][y][x], d);
			}
			
			for(int c = 0; c < C; c++){
				for(int k = 0; k < N; k++){
					for(int i = 0; i < N; i++){
						for(int j = 0; j < N; j++){
							distance[c][i][j] = Math.min(distance[c][i][j], distance[c][i][k] + distance[c][k][j]);
						}
					}
				}
			}

			table = new int[C][][];
			for (int i = 0; i < C; i++) {
				table[i] = new int[nextInt()][2];
			}

			for (int i = 0; i < C; i++) {
				for (int j = 0; j < table[i].length - 1; j++) {
					table[i][j][0] = nextInt();
				}
				table[i][table[i].length - 1][0] = Integer.MAX_VALUE;

				for (int j = 0; j < table[i].length; j++) {
					table[i][j][1] = nextInt();
				}
			}
			
			int[][] d2 = new int[N][N];
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					d2[i][j] = MAX;
					for(int c = 0; c < C; c++){
						if(distance[c][i][j] != MAX){
							d2[i][j] = Math.min(d2[i][j], calcCost(c, distance[c][i][j]));
						}
					}
				}
			}
			
			for(int k = 0; k < N; k++){
				for(int i = 0; i < N; i++){
					for(int j = 0; j < N; j++){
						d2[i][j] = Math.min(d2[i][j], d2[i][k] + d2[k][j]);
					}
				}
			}
			
			
			
			out.println(d2[S][G] >= MAX ? -1 : d2[S][G]);
		}
	}


	public int calcCost(int c, int len) {
		int ans = 0;
		int cur = 0;
		for (int i = 0; i < table[c].length; i++) {
			if (table[c][i][0] >= len) {
				ans += (len - cur) * table[c][i][1];
				break;
			} else {
				ans += (table[c][i][0] - cur) * table[c][i][1];
				cur = table[c][i][0];
			}
		}
		return ans;
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