import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		long H = in.nextLong();
		long W = in.nextLong();
		long all = H * W;
		long answer = all % 2 == 0 ? all / 2 : all / 2 + 1;
		System.out.println(answer);
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}