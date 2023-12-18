
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		String[] c = new String[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			c[i] = sc.next();
		}
		long ans = 0;
		for(int i = 0; i < 2 * k; i++) {
			for(int j = 0; j < k; j++) {
				long tmp = 0;
				for(int l = 0; l < n; l++) {
					String color = "W";
					if(((x[l] + i) / k + (y[l] + j) / k) % 2 == 0 && color.equals(c[l])) {
						tmp++;
					} else if(((x[l] + i) / k + (y[l] + j) / k) % 2 != 0 && !color.equals(c[l])) {
						tmp++;
					}
				}
				ans = Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}

}
