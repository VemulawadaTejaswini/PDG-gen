import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int H = readInt(), W = readInt(), D = readInt(); int board[][] = new int[H+1][W+1]; int X[] = new int[H*W+1], Y[] = new int[H*W+1];
		for(int i = 1; i<=H; i++) for(int j = 1; j<=W; j++) {
			board[i][j] = readInt(); X[board[i][j]] = i; Y[board[i][j]] = j;
		}
		
		int Q = readInt(); for(int q = 0; q < Q; q++) {
			int L = readInt(), R = readInt(); long ans = 0;
			int crntX = X[L], crntY = Y[L]; L+=D;
			while(L<=R) {
				ans += Math.abs(crntX-X[L])+Math.abs(crntY-Y[L]);
				crntX = X[L]; crntY = Y[L];
				int temp = X[L]; X[L] = X[L-D]; X[L-D] = temp; 
				temp = Y[L]; Y[L] = Y[L-D]; Y[L-D] = temp;
				L += D;
			}
			println(ans);
		}
		exit();
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static float readFloat() throws IOException {
		return Float.parseFloat(next());
	}

	static boolean readBoolean() throws IOException {
		return Boolean.parseBoolean(next());
	}

	static short readShort() throws IOException {
		return Short.parseShort(next());
	}

	static byte readByte() throws IOException {
		return Byte.parseByte(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}

	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		br.close();
		pr.close();
		System.exit(0);
	}
}
