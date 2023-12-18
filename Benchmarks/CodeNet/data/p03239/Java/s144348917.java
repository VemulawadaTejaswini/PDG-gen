import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int min = 1000;
		int t = 0;
		int c = 0;

		for (int i = 0; i < N; i++) {
			c = sc.nextInt();
			t = sc.nextInt();
			if (t <= T) {
				if (c < min) {
					min = c;
				}
			}
		}

		if (min == -1) {
			System.out.println("TLE");
		} else {
			System.out.println(c);
		}
	}
}
