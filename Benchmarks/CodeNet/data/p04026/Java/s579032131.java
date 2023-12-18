import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);
	
	int len;
	char[] str;
	boolean found = false;
	
	Main() {
		len = (str = in.next().toCharArray()).length;
		for (int i = 0; i < len - 1; i++) {
			if (str[i] == str[i + 1]) {
				out.printf("%d %d%n", i + 1, i + 2);
				found = true;
				break;
			}
			if (i < len - 2 && str[i] == str[i + 2]) {
				out.printf("%d %d%n", i + 1, i + 3);
				found = true;
				break;
			}
		}
		if (!found)
			out.printf("%d %d%n", -1, -1);
		out.close();
	}
	
		
	
	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}
