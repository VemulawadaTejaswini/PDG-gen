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
			int a = readInt();
			int b = readInt();
			LinkedList<Integer>[] edges1 = new LinkedList[n];
			for(int i = 0; i < n; i++) {
				edges1[i] = new LinkedList<>();
			}
			road = init(n);
			while(a-- > 0) {
				int x = readInt()-1;
				int y = readInt()-1;
				edges1[x].add(y);
				edges1[y].add(x);
				merge(road, x, y);
			}
			LinkedList<Integer>[] edges2 = new LinkedList[n];
			for(int i = 0; i < n; i++) {
				edges2[i] = new LinkedList<>();
			}
			rail = init(n);
			while(b-- > 0) {
				int x = readInt()-1;
				int y = readInt()-1;
				edges2[x].add(y);
				edges2[y].add(x);
				merge(rail, x, y);
			}
			int[] ret = new int[n];
			boolean[] seen = new boolean[n];
			for(int aa = 0; aa < n; aa++) {
				if(seen[aa]) continue;
				LinkedList<Integer> q = new LinkedList<>();
				q.add(aa);
				ArrayList<Integer> all = new ArrayList<>();
				all.add(aa);
				while(!q.isEmpty()) {
					int curr = q.removeFirst();
					for(int out: edges1[curr]) {
						if(find(rail, out) == find(rail, curr) && !seen[out]) {
							seen[out] = true;
							q.add(out);
							all.add(out);
						}
					}
				}
				for(int out: all) {
					ret[out] = all.size();
				}
			}
			for(int i = 0; i < n; i++) {
				pw.print(ret[i]);
				if(i == n-1) pw.println();
				else pw.print(" ");
			}
		}
		exitImmediately();
	}

	static int[] road;
	static int[] rail;

	public static int[] init(int x) {
		int[] ret = new int[x];
		for(int i = 0; i < x; i++) {
			ret[i] = i;
		}
		return ret;
	}

	public static int find(int[] p, int x) {
		return p[x] == x ? x : (p[x] = find(p, p[x]));
	}
	public static void merge(int[] p, int x, int y) {
		p[find(p, x)] = find(p, y);
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