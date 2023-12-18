
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();
		long[] dis = new long[n];
		long[] clo = new long[n];
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				clo[i] = sc.nextLong();
			} else {
				clo[i] = clo[i - 1] + sc.nextLong();
			}
			dis[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans = Math.max(ans, clo[i] - dis[i]);
		}
		for(int i = n - 1; i > -1; i--) {
			long tmp = 0;
			if(i == 0) {
				tmp = clo[n - 1];
			} else {
				tmp = clo[n - 1] - clo[i - 1];
			}
			ans = Math.max(ans, tmp - (c - dis[i]));
		}
		System.out.println(ans);
	}

}
