import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		String S = in.next();
		String T = in.next();

		System.out.println(T+S);


	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}