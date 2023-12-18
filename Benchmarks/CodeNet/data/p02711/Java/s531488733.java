import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		char[] n = in.next().toCharArray();
 
 
		System.out.println(n[0] == '7' || n[1] == '7' || n[2] == '7' ? "Yes" : "No");
 
	}
 
	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}