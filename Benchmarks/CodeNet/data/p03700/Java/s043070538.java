import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long[] enemy = new long[n];

		for(int i = 0; i < n; i++) {
			enemy[i] = sc.nextInt();
		}

		Arrays.sort(enemy);

		long result = 0;
		int plus = 0;
		long enemy_sa = 0;
		long ab_sa = a-b;

		while(enemy[n-1] > 0) {
			enemy_sa = enemy[n-1] - enemy[n-2];

			if(enemy_sa != 0) {
				if(enemy_sa % ab_sa != 0) {
					plus = 1;
				}

				result += enemy_sa / ab_sa;

				for(int i = 0; i < n-1; i++) {
					enemy[i] -= b * result;
				}
			} else {

				if(enemy[n-1] % a != 0) {
					plus = 1;
				}
				result += enemy[n-1] / a;

				for(int i = 0; i < n-1; i++) {
					enemy[i] -= b * result;
				}
			}

			result += plus;
			plus = 0;
			enemy[n-1] -= a * result;

			Arrays.sort(enemy);
		}

		System.out.println(result);
	}

}
