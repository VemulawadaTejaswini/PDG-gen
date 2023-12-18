import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int limR = N / R;
		int limG = N / G;
		int limB = N / B;

		int ans = 0;
		for (int r = 0; r <= limR; r++) {
			for (int g = 0; g <= limG; g++) {
				for (int b = 0; b <= limB; b++) {
					int sum = R * r + G * g + B * b;
					if (sum == N) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
