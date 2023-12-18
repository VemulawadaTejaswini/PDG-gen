import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
		//Implement solution here.
		int n = ni();
		int[] a = new int[n - 1];
		int[] b = new int[n - 1];
		long[] c = new long[n];
		int q = ni();
		List<Edge> e = new ArrayList<>();
		for(int i = 0; i < n - 1; i++) {
			e.add(new Edge(ni(),ni()));
		}
		Comparator<Edge> comparator = Comparator.comparing(Edge::getFrom);
		e.sort(comparator);

		for(int i = 0; i < q; i++) {
			c[ni() - 1] += nl();
		}
		
		for(int i = 0; i < n - 1; i++) {
			c[e.get(i).to - 1] += c[e.get(i).from - 1];
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(c[i] + " ");
		}
	}

	static class Edge{
		private int from;
		private int to;
		public Edge(int from, int to) {
			this.from = from;
			this.to = to;
		}
		public long getFrom() {
			return this.from;
		}
	}
	//Switch input source (stdin/file)
	private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
		String debugDataPath = System.getenv("DD_PATH");        
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		} 
		solve();
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}