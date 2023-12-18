import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*; 
import java.util.*;
import java.util.regex.*;

/*
			  br = new BufferedReader(new FileReader("input.txt"));
			  pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
			  br = new BufferedReader(new InputStreamReader(System.in));
			  pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
 */

public class Main {
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter pw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//int qq = 1;
		int qq = Integer.MAX_VALUE;
		//int qq = readInt();
		for(int casenum = 1; casenum <= qq; casenum++) {
			int n = readInt();
			int m = readInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i = 0; i < n; i++) {
				x[i] = readInt();
				y[i] = readInt();
			}
			int[] xx = new int[m];
			int[] yy = new int[m];
			for(int i = 0; i < m; i++) {
				xx[i] = readInt();
				yy[i] = readInt();
			}
			for(int i = 0; i < n; i++) {
				int best = 0;
				for(int a = 1; a < m; a++) {
					int bestDist = Math.abs(x[i] - xx[best]) + Math.abs(y[i] - yy[best]);
					int aDist = Math.abs(x[i] - xx[a]) + Math.abs(y[i] - yy[a]);
					if(aDist < bestDist) {
						best = a;
					}
				}
				pw.println(best+1);
			}
		}
		exitImmediately();
	}

	private static void exitImmediately() {
		pw.close();
		System.exit(0);
	}

	private static long readLong() throws IOException {
		return Long.parseLong(readToken());
	}

	private static double readDouble() throws IOException {
		return Double.parseDouble(readToken());
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(readToken());
	}

	private static String readLine() throws IOException  {
		String s = br.readLine();
		if(s == null) {
			exitImmediately();
		}
		st = null;
		return s;
	}

	private static String readToken() throws IOException  {
		while(st == null || !st.hasMoreTokens())  {
			st = new StringTokenizer(readLine().trim());
		}
		return st.nextToken();
	}
}