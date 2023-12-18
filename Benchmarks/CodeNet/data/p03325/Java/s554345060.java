
//template
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
	static BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	private static final int HUNDRED = 100;
	public static void main(String[] args) throws IOException{
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		out.println(IntStream.range(0, N).map(i ->{
			int a=scan.nextInt(),count=0;
			while(0==(a&1)) {
				count++;
				a>>=1;
			}
			return count;
		}).sum());
		
		out.flush();
		in.close();
		out.close();
	}
	
	public static boolean palindrome(String s) {
		boolean palindrome=true;
		int i=0,j=s.length()-1;
		while(i<j&&palindrome) {
			if(s.charAt(i++)!=s.charAt(j--))
				palindrome=false;
		}
		return palindrome;
	}
	public static long reverse(String s) {
		String aux="";
		for(int i=s.length()-1;i>=0;i--) {
			aux+=s.charAt(i);
		}
		return Long.parseLong(aux);
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
class Pair{
	int first;
	int second;
	public Pair(int first,int second) {
		this.first=first;
		this.second=second;
	}
	public Pair() {
		
	}
}