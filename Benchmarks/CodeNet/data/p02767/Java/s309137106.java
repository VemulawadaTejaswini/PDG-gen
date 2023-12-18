
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] hp = new long[101][101];
		for(int i = 1; i < 101; i++) {
			for(int j = 1; j < 101; j++) {
				hp[i][j] = (long) Math.pow(i - j, 2);
			}
		}
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		long ans = Long.MAX_VALUE;
		for(int i = 1; i < 101; i++) {
			long min = 0;
			for(int j = 0; j < n; j++) {
				min += hp[x[j]][i];
			}
			ans = Math.min(ans, min);
		}

		System.out.println(ans);

	}

}
