import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static ArrayList<String> s = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n= in.nextInt();
		int [] a= new int[n];
		HashMap<Integer, Integer> c= new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			a[i]= in.nextInt();
			if(c.containsKey(a[i])){
				c.put(a[i], c.get(a[i])+1);
			}
			else{
				c.put(a[i], 1);
			}
		}
		Arrays.sort(a);
		TreeSet<Integer> r= new TreeSet<>();
		int have= 0;
		int i= a.length-1;
		for (i = a.length-1; i >=0;) {
			int numof= c.get(a[i]);
			if(numof==4&&have==0){
				System.out.println((long) a[i]*a[i]);
				return;
			}
			else if(numof<=4&&numof>=2){
				r.add(a[i]);
				have+= Math.min(numof, 2);
			}
			i-=numof;
			//System.out.println(i);
		}
		long res=0;
		if(r.size()>=2) res= (long) r.pollLast()*r.pollLast();
		System.out.println(res);

	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}

