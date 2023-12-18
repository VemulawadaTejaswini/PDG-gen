
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] p = new double[1001];
		p[0] = 0;
		for(int i = 1; i < 1001; i++) {
			double h = 0;
			for(int j = 1; j < i + 1; j++) {
				h += (double) j / (double) i;
			}
			p[i] = h;
		}
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] sum = new double[n + 1];
		sum[0] = 0;
		for(int i = 1; i < n + 1; i++) {
			sum[i] = sum[i - 1] + p[sc.nextInt()];
		}
		double ans = 0;
		for(int i = k; i < n + 1; i++) {
			ans = Math.max(ans, sum[i] - sum[i - k]);
		}
		System.out.println(ans);
	}

}
