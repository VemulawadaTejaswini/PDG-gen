
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		double[][] list = new double[n][d];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				list[i][j] = sc.nextDouble();
			}
		}
		long ans = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				double dis = 0;
				for(int k = 0; k < d; k++) {
					dis += Math.pow(list[i][k] - list[j][k], 2);
				}
				dis = Math.sqrt(dis);
				if(dis == (long) dis) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}

}
