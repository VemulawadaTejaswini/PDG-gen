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
			d[i] = Math.abs(X-xi);
			dmin = Math.min(dmin, Math.max(1, d[i]));
		}
		int dminclone = dmin;
		while (true) {
			boolean key = true;
			int index = 2;
			for (int i = 0; i < d.length; i++) {
				if (d[i]%dminclone != 0) {
					dminclone = dmin/index;
					index++;
					key = false;
					break;
				}
			}
			if (key) {
				break;
			}
		}
		System.out.println(dmin);
	}
}
