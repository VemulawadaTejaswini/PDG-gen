import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		System.out.println(g(n));
	}
	
	private static long g(long n) {
		long r = 0;
		while(n>0) {
			return 1 + 2 * g(n/2);
		}
		return r;
	}
}
