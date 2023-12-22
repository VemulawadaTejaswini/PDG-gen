import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int prime[] = new int[50000];
		int n;
		int count;
		
		for (int i = 2; i < 50000; i++) {
			for (int j = i; j < 50000; j++) {
				if (0 <= i * j && i * j < 50000) {
					prime[i * j] = 1;
				} else {
					break;
				}
			}
		}
		n = sc.nextInt();
		while (n != 0) {
			count = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (prime[i] == 0 && prime[n - i] == 0) {
					count++;
				}
			}
			System.out.println(count);
			n = sc.nextInt();
		}
	}
}