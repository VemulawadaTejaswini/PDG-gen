import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException {
		long arr[] = new long[5]; int N = readInt(); for(int i = 1; i<=N; i++) {
			String s = next();
			if(s.charAt(0) == 'M') arr[0]++; if(s.charAt(0) == 'A') arr[1]++;
			if(s.charAt(0) == 'R') arr[2]++; if(s.charAt(0) == 'C') arr[3]++; if(s.charAt(0) == 'H') arr[4]++;
		}
		
		long ans = 0;
		for(int i = 0; i<5; i++) for(int j = i+1; j<5; j++) for(int k = j+1; k<5; k++) ans += arr[i]*arr[j]*arr[k]; println(ans);
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
