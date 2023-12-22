import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int prime[];

		prime = new int[51000];
		for (int i = 2; i < 51000; i++) {
			for (int j = i; j < 51000; j++) {
				if (0 <= i * j && i * j < 51000) {
					prime[i * j] = 1;
				} else {
					break;
				}
			}
		}

		while (sc.hasNext()) {
			n = sc.nextInt();
			for (int i = n - 1; 0 <= i; i--) {
				if (prime[i] == 0) {
					System.out.print(i + " ");
					break;
				}
			}
			for (int i = n + 1; i < 51000; i++) {
				if (prime[i] == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}