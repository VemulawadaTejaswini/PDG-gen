
//template
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	private static final int HUNDRED = 100;
	public static void main(String[] args) throws IOException{
		
		String s=in.readLine();
		long n=Long.parseLong(s);
		long k=0,kk=1;
		for(int i=0;i<n;i++) {
			if((k/kk)%10==9&&f(k+kk)>f(k+10*kk))
				kk*=10;
			k+=kk;
			out.append(k+"\n");
		}
		
		out.flush();
		in.close();
		out.close();
	}
	private static double f(long num) {
		long copy=num;
		long sum=0;
		while(copy>0) {
			sum+=copy%10;
			copy/=10;
		}
		return (double)num/sum;
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
	private static int[] readInts() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	}
	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}
	private static long[] readLongs() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	}
	private static long readLong() throws IOException {
		return Long.parseLong(in.readLine());
	}
	 
}
