import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int cnt = 0;
		for (int r = 0; r <= N / R; r++) {
			for (int g = 0; g <= (N - R * r) / G; g++) {
				for (int b = 0; b <= (N - R * r - G * g) / B; b++) {
					if (R * r + G * g + B * b == N)
						cnt++;
				}
			}
		}

		sc.close();
		System.out.println(cnt);
	}
}