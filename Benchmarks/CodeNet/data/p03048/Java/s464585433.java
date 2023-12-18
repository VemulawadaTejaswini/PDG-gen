import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();

		int cnt = 0;

		for (int i = 0; i <= N / R; i++) {
			for (int j = 0; j <= N / G; j++) {
				for (int k = 0; k <= N / B; k++) {
					if (i*R + j*G + k*B == N) cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

}