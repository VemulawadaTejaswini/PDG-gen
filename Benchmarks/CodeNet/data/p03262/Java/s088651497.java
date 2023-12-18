import java.util.Scanner;

public class Main {
	static int[] subTreeSize;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int x = sc.nextInt();
		int d = Math.abs(x - sc.nextInt());
		for (int i = 0; i < n - 1; i++) {
			int dif = Math.abs(x - sc.nextInt());
			d = gcd(d, dif);
		}
		
		System.out.println(d);
	}
	
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}
}
