import java.awt.*;
import java.awt.event.*;
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
		for(int casenum = 1; casenum <= qq; casenum++)	{
			int n = readInt();
			int k = readInt();
			int[][] wSum = new int[4*k+1][4*k+1];
			int[][] bSum = new int[4*k+1][4*k+1];
			while(n-- > 0) {
				int x = readInt() % (2*k);
				int y = readInt() % (2*k);
				if(nextToken().equals("B")) {
					wSum[x+1][y+1]++;
					wSum[x+1+2*k][y+1]++;
					wSum[x+1][y+1+2*k]++;
					wSum[x+1+2*k][y+1+2*k]++;
				}
				else {
					bSum[x+1][y+1]++;
					bSum[x+1+2*k][y+1]++;
					bSum[x+1][y+1+2*k]++;
					bSum[x+1+2*k][y+1+2*k]++;
				}
			}
			for(int i = 0; i <= 4*k; i++) {
				for(int j = 0; j <= 4*k; j++) {
					if(i > 0) {
						wSum[i][j] += wSum[i-1][j];
						bSum[i][j] += bSum[i-1][j];
					}
					if(j > 0) {
						wSum[i][j] += wSum[i][j-1];
						bSum[i][j] += bSum[i][j-1];
					}
					if(i > 0 && j > 0) {
						wSum[i][j] -= wSum[i-1][j-1];
						bSum[i][j] -= bSum[i-1][j-1];
					}
				}
			}
			int ret = 0;
			for(int lowerX = 0; lowerX <= k; lowerX++) {
				for(int lowerY = 0; lowerY <= k; lowerY++) {
					int cand = 0;
					cand += wSum[lowerX+2*k][lowerY+2*k];
					cand -= wSum[lowerX+k][lowerY+2*k];
					cand -= wSum[lowerX+2*k][lowerY+k];
					cand += wSum[lowerX+k][lowerY+k];
					cand += wSum[lowerX+k][lowerY+k];
					cand -= wSum[lowerX][lowerY+k];
					cand -= wSum[lowerX+k][lowerY];
					cand += wSum[lowerX][lowerY];

					cand += bSum[lowerX+2*k][lowerY+k];
					cand -= bSum[lowerX+k][lowerY+k];
					cand -= bSum[lowerX+2*k][lowerY];
					cand += bSum[lowerX+k][lowerY];
					cand += bSum[lowerX+k][lowerY+2*k];
					cand -= bSum[lowerX][lowerY+2*k];
					cand -= bSum[lowerX+k][lowerY+k];
					cand += bSum[lowerX][lowerY+k];

					ret = Math.max(ret, cand);
				}
			}
			pw.println(ret);
		}
		exitImmediately();
	}

	private static void exitImmediately() {
		pw.close();
		System.exit(0);
	}

	private static long readLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private static double readDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private static String nextLine() throws IOException  {
		if(!br.ready()) {
			exitImmediately();
		}
		st = null;
		return br.readLine();
	}

	private static String nextToken() throws IOException  {
		while(st == null || !st.hasMoreTokens())  {
			if(!br.ready()) {
				exitImmediately();
			}
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}
}