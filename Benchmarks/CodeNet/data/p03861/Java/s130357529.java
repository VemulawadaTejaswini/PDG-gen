import java.util.Scanner;

class Main{
	static long f(long a, long x) {
		if(a == -1) return 0;
		return a / x;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong(), x = sc.nextLong();
		System.out.println(f(b, x) - f(a - 1, x));
	}
}