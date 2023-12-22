import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main
{
	
	
	public static void main(String[] args) {
	
		FastScanner fs = new FastScanner();
		long x = fs.nextLong();
		long k = fs.nextLong();
		long d = fs.nextLong();
		
		if(Math.abs(x)>= k*d) {
			System.out.println(Math.abs(x)-(k*d)); 
		}else {
			long k1 = x/d;
			if(k1%2 == k%2) {
				System.out.println(Math.abs(x)-(k1*d));
			}else {
				System.out.println((Math.min(Math.abs(Math.abs(x)-((k1+1)*d)), Math.abs(Math.abs(x)-((k1-1)*d)))));
			}
		}
	
	}

	void sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i:a) list.add(i);
		Collections.sort(list);
		for (int i=0; i<a.length; i++) a[i]=list.get(i);
	}
	
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public long[] readLongArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
	}
 
}



