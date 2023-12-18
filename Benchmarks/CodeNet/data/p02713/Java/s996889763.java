import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long sum = 0;

		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= k; j++) {
				for(int n = 1; n <= k; n++) {
					sum += gcd(gcd(i, j), n);
				}
			}
		}


		System.out.println(sum);
		sc.close();
	}

	static int gcd(int x, int y) {
		if(x < y) {
			int temp = x;
			x = y;
			y = temp;
		}

		if(x % y == 0) return y;
		else return gcd(y, x % y);
	}
}