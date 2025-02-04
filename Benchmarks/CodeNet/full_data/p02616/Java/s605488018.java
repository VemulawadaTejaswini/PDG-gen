
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastInput in = new FastInput(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ABC173E solver = new ABC173E();
		solver.solve(1, in, out);
		out.close();
	}

	static class ABC173E {

		static int mod = 1000000007;
		public void solve(int testNum, FastInput in, PrintWriter out) {
			
			int n = in.nextInt();
			int k = in.nextInt();
			
			int []a = in.nextIntArray(n);
			
			List<Integer> P = new ArrayList<Integer>();
			List<Integer> M = new ArrayList<Integer>();
			
			for(int i = 0 ; i < n ;i++) {
				if(a[i] > 0) {
					P.add(a[i]);
				}
				else {
					M.add(a[i]);
				}
			}
			
			Collections.sort(P,Comparator.reverseOrder());
			Collections.sort(M,Comparator.reverseOrder());
			
			long ans = 1;
			
			if(P.isEmpty() && k % 2 == 1) {
				for(int i = 0 ; i < k ;i++) {
					ans = (long)(ans*(mod + M.get(i)))%mod;
				}
				out.println(ans);
				return;
			}
			
			Collections.sort(M,Comparator.reverseOrder());
			int cnt = 0;
			
			while(cnt < k) {
				
				if(cnt == k-1) {
					ans = (ans * P.get(0))%mod;
					break;
				}
				if(P.size() <= 1) {
					long mm = (long)(M.get(0)*M.get(1));
					ans = (ans * (mm%mod))%mod;
					M.remove(0);
					M.remove(0);
					cnt += 2;
				}
				else if(M.size() <= 1) {
					long p = P.get(0);
					ans = (ans *p)%mod;
					P.remove(0);
					cnt++;
				}
				else {
					long pp = (long)(P.get(0)*P.get(1));
					long mm = (long)(M.get(0)*M.get(1));
				
					if(pp >= mm) {
						ans = (ans * P.get(0))%mod;
						P.remove(0);
						cnt++;;
					}
					else {
						ans = (ans * mm%mod)%mod;
						M.remove(0);
						M.remove(0);
						
						cnt+= 2;
					}
				}	
					
			}
			
			out.println(ans);
			
			
			
				
			}
			
		}
	
	static class FastInput{
	private final BufferedReader in;
	private String[] buff;
	private int index = 0;
	
	public FastInput(InputStream im) {
		in = new BufferedReader(new InputStreamReader(im));
	}
	String nextLine() {
		try {
			return in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	String next() {
		while (buff == null || index >= buff.length) {
			buff = nextLine().split(" ");
			index = 0;
		}
		return buff[index++];
	}
	int nextInt() {
		return Integer.parseInt(next());
	}
	
	long nextLong() {
		return Long.parseLong(next());
	}
	
	Double nextDouble() {
		return Double.parseDouble(next());
	}
	
	BigInteger nextBigInteger() {
		return new BigInteger(next());
	}
	
	BigDecimal nextBigDecimal() {
		return new BigDecimal(next());
	}
	
	public int[] nextIntArray(final int n) {
		final int[] res = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextInt();
		}
		return res;
	}
	
	public long[] nextLongArray(final int n) {
		final long[] res= new long [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextLong();
		}
		return res;
	}
	
	public double[] nextDoubleArray(final int n ) {
		final double[] res = new double [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextDouble();
		}
		return res;
	}
	
	
	public int[][] nextInt2DArray(final int n , final int m){
		int [][]res = new int [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextInt();
			}
		}
		return res;
	}
	public long[][] nextLong2DArray(final int n , final int m){
		long [][]res = new long [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextLong();
			}
		}
		return res;
	}
	
	public char[][] nextChar2DArray(final int n){
		char [][]res = new char [n][];
		
		for(int i = 0 ; i < n ;i++) {
			String s = next();
			res[i] = s.toCharArray();
		}
		
		return res;
	}
}



}
