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
		
		String line=readString();
		if(line.length()==3) {
			if(line.charAt(0)==line.charAt(2)
					&&line.charAt(1)!=line.charAt(2))
				out.write("Yes\n");
			else
				out.write("No\n");
		}
		else {
			int mid=line.length()/2;
			int l1=0,l2=mid-1;
			int r1=mid+1,r2=line.length()-1;
			boolean palindrome=true;
			if(line.charAt(mid)==line.charAt(l2)||line.charAt(mid)==line.charAt(r1))
				palindrome=false;
			while(palindrome){
				if(line.charAt(l1)!=line.charAt(l2)
					&&line.charAt(r1)!=line.charAt(r2))
					palindrome=false;
				if(l1==l2&&line.charAt(l1)!=line.charAt(r1))
					palindrome=false;
				l1++;l2--;
				r1++;r2--;
				if(l1==l2)
					break;
			}
			if(palindrome)
				out.write("Yes\n");
			else
				out.write("No\n");
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