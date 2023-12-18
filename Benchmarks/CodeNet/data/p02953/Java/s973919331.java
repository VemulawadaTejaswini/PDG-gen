import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		boolean ok = true;
		for (int i = 1; i < n; i++) {
			if (h[i - 1] <= h[i]) {

			} else if (h[i - 1] <= h[i] + 1) {
				h[i]++;
			} else {
				ok = false;
				break;
			}
		}
		if (ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}