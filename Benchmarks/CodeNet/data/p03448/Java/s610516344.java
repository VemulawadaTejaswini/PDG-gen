import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, X;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		X = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				for (int k = 0; k <= C; k++) {
					int sum = 500 * i + 100 * j + 50 * k;
					if(sum == X) cnt++;
				}
			}
		}

		System.out.print(cnt);
	}
}