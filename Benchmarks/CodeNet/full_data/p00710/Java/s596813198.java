import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n == 0 && r == 0)
				break;
			int[] s = new int[n];
			int[] scpy = new int[n];
			for (int i = n - 1; i >= 0; i--) {
				s[i] = n - i;
			}
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				for (int j = 0; j < n; j++) {
					if (0 <= j && j <= c - 1) {
						scpy[j] = s[(p - 1) + j];
					} else if (c <= j && j <= c + (p - 2)) {
						scpy[j] = s[j - c];
					} else {
						scpy[j] = s[j];
					}
				}
				for (int j = 0; j < n; j++) {
					s[j] = scpy[j];
				}
			}
			System.out.println(s[0]);
		}
	}
}