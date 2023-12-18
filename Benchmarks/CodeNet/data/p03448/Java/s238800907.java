import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int ans = 0;

		for (int a = 0; a <= A; a++) {
			for (int b = 0; b <= B; b++) {
				int c = (X - (500 * a) - (100 * b)) / 50;
				if (c >= 0 && c <= C) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}