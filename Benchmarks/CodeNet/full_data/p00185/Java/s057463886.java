import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int prime[] = new int[1000001];
		int n;
		int count;

		for (int i = 2; i * i < 1000001; i++) {
			for (int j = i * 2; j < 1000001; j += i) {
				prime[j] = 1;
			}
		}

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			count = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (prime[i] == 0 && prime[n - i] == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}