import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		String S = in.nextLine();
		boolean b =
				S.equals("hi")
				|| S.equals("hihi")
				|| S.equals("hihihi")
				|| S.equals("hihihihi")
				|| S.equals("hihihihihi");
		System.out.println(b ? "Yes" : "No");

	}
 
	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
 
}