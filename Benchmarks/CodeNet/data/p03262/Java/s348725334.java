import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] xx = new int[n];
		for (int i = 0; i < n; i++) {
			xx[i] = sc.nextInt();
			xx[i] = Math.abs(x-xx[i]);
		}
		if (n == 1) {
			System.out.println(xx[0]);
			return;
		}
		System.out.println(multi_gcd(xx, n));
	}
	
	private static int multi_gcd(int[] xx, int rem) {
		if (rem == 2) {
			return gcd(xx[1], xx[0]);
		}
		return gcd(xx[rem - 1], multi_gcd(xx, rem - 1));
	}
	
	private static int gcd(int a, int b) {
		int temp;
		while((temp = a%b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}
}
