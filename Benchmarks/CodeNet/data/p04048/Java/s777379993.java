import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();

		System.out.println(n+recur(x,n-x));
	}

	public static long recur(long a, long b) {
		if (b%a == 0) {
			return (2*b-a);
		} else {
			return (2*a*(b/a)+recur(b%a, a));
		}
	}

}
