import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		long A = in.nextLong();
		long B = in.nextLong();
		long C = in.nextLong();
		long K = in.nextLong();

		if(A - K > 0) {
			System.out.println(K);
			return;
		}

		else if(A + B - K > 0) {
			System.out.println(A);
		}
		else {
			System.out.println(A - (K - A - B));
		}


	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}