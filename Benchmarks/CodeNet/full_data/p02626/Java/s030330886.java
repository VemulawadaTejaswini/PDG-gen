import java.io.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
 
	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		long arr[] = new long[n], xor = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			xor ^= i < 2 ? 0 : arr[i];
		}
		
		long sum = arr[0] + arr[1];
		long and = (sum - xor) >> 1;
		long a = 0, b = 0;
		
		for(int i = 60; i >= 0; i--) {
			boolean xi = (xor & (1L << i)) > 0;
			boolean ai = (and & (1L << i)) > 0;
			
			if(!xi && ai) {
				a |= 1L << i;
				b |= 1L << i;
			}
		}
		
		
		for(int i = 60; i >= 0; i--) {
			boolean xi = (xor & (1L << i)) > 0;
			boolean ai = (and & (1L << i)) > 0;
			
			if(xi && !ai) {
				if((a | 1L << i) <= arr[0]) {
					a |= 1L << i;
				}else {
					b |= 1L << i;
				}
			}
		}
		
		boolean flag = (a + b) == sum && (a ^ b) == xor;
		flag &= a >= 1 && a <= arr[0] && b >= arr[1];
		
		out.println(flag ? arr[0] - a : -1);
		out.close();
	}
 
}
 
class Scanner {
	StringTokenizer st;
	BufferedReader br;
 
	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}
 
	public Scanner(String file) throws Exception {
		br = new BufferedReader(new FileReader(file));
	}
 
	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
 
	public String nextLine() throws IOException {
		return br.readLine();
	}
 
	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
 
	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
 
	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}