import java.util.*;
import java.io.*;
import java.math.*;
class Main{
public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long count =0 ;
		String st = sc.next();
		for(int i=0;i<n-2;i++){
			if(st.charAt(i)=='A' &&  st.charAt(i+1)=='B' && st.charAt(i+2)=='C'  )
				count++;
		}
	System.out.println(count);
		
	}
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer sz;


		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (sz == null || !sz.hasMoreTokens()) {
				try {
					sz = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return sz.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}

}