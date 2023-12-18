import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		char[] S = in.next().toCharArray();
		System.out.println(S[2] == S[3] && S[4] == S[5] ? "Yes" : "No");
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}