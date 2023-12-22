import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int c;
		boolean[] prime = new boolean[1000000];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			for (int j = 2; j < prime.length; j++) {
				if (prime[j]) {
					if (j / i != 1 && j % i == 0) {
						prime[j] = false;
					}
				}
			}
		}
		while (scan.hasNext()) {
			n = scan.nextInt();
			c = 0;

			for (int i = 2; i <= n; i++) {
				if (prime[i]) {
					c++;
				}
			}
			System.out.println(c);
		}
	}

}