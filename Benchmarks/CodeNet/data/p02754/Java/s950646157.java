import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main{
	private static BufferedReader in;
	private static BufferedWriter out;
	
	public static void main(String[] args) throws IOException {
		open();

		StringTokenizer st;
		StringBuilder sb;
	
		st=new StringTokenizer(readString());
		long n=Long.parseLong(st.nextToken());
		long a=Long.parseLong(st.nextToken());
		long b=Long.parseLong(st.nextToken());
		long nro=n/(a+b);
		if(nro==0)
			out.write(a+"\n");
		else {
			nro=(nro*a)+((n%(a+b)));
			out.write(nro+"\n");
		}
		
		close();
	}
	
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
	private static double[] readDoubles() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
	}
	private static double readDouble() throws IOException {
		return Double.parseDouble(in.readLine());
	}
	private static String readString() throws IOException {
		return in.readLine();
	}
	private static int setBit(int S, int j) {
		return S | (1 << j);
	}
	private static int isOn(int S, int j) {
		return S & (1 << j);
	}
	private static int clearBit(int S, int j) {
		return S & ~(1 << j);
	}
	private static int toggleBit(int S, int j) {
		return S ^ (1 << j);
	}
	private static int lowBit(int S) {
		return S & (-S);
	}
	private static int setAll(int n) {
		return (1 << n) - 1;
	}
	private static int modulo(int S, int N) {
		return ((S) & (N - 1));
	} // returns S % N, where N is a power of 2
	private static boolean isPowerOfTwo(int S) {
		return (S & (S - 1)) == 0 ? true : false;
	}
	private static int nearestPowerOfTwo(int S) {
		return ((int) Math.pow(2.0, (int) ((Math.log((double) S) / Math.log(2.0)) + 0.5)));
	}
	private static int turnOffLastBit(int S) {
		return ((S) & (S - 1));
	}
	private static int turnOnLastZero(int S) {
		return ((S) | (S + 1));
	}
	private static int turnOffLastConsecutiveBits(int S) {
		return ((S) & (S + 1));
	}
	private static int turnOnLastConsecutiveZeroes(int S) {
		return ((S) | (S - 1));
	}
	private static void open() {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new BufferedWriter(new OutputStreamWriter((System.out)));
	}
	private static void close() throws IOException {
		out.flush();
		out.close();
		in.close();
	}
}
