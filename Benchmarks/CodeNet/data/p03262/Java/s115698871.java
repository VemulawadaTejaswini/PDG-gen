import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int dmin = Integer.MAX_VALUE;
		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			int xi = sc.nextInt();
			dmin = Math.min(dmin, Math.abs(X-xi));
			d[i] = Math.abs(X-xi);
		}
		while (true) {
			for (int i = 0; i < d.length; i++) {
				if (d[i]%dmin != 0) {
					dmin /= 2;
					break;
				}
			}
			break;
		}
		System.out.println(dmin);
	}
}
