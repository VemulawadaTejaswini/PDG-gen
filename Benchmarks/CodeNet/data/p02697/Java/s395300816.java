import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		int M = in.nextInt();

		int a = 1;
		int b = N;
		for(int i=0;i<M;i++) {
			System.out.println(a + " " + b);
			a++;
			b--;
		}


	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}