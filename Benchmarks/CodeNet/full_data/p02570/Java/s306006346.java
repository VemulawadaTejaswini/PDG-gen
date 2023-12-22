
//template
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	private static final int HUNDRED = 100;
	public static void main(String[] args) throws IOException{
		
		StringTokenizer st=new StringTokenizer(in.readLine());
		double d=Double.parseDouble(st.nextToken());
		double t=Double.parseDouble(st.nextToken());
		double s=Double.parseDouble(st.nextToken());
		if(d/s<=t)
			out.append("Yes");
		else
			out.append("No");
		
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
