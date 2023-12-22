import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		char[] S = in.next().toCharArray();
		char[] T = in.next().toCharArray();

		for(int i=0;i<S.length;i++) {
			if(S[i] != T[i]) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");


	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}