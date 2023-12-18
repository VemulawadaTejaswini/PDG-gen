import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int dmin = Integer.MAX_VALUE;
		int dn = Integer.MAX_VALUE;
		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			int xi = sc.nextInt();
			d[i] = Math.abs(X-xi);
			dn = Math.min(dn, Math.max(1, d[i]));
		}
		Arrays.sort(d);
		for (int i = 1; i < d.length; i++) {
			dmin = Math.min(dmin, d[i]-d[i-1]);
		}
		int dl = Math.min(dmin, dn);
		int index = 2;
		int dlstd = dl;
		while (true) {
			boolean key = true;
			for (int i = 0; i < d.length; i++) {
				if (d[i]%dl != 0) {
					while (true) {
						if (dlstd%index == 0) {
							dl = dlstd/index;
							index++;
							key = false;
							break;
						} else {
							index++;
						}
					}
				}
			}
			if (key) {
				break;
			}
		}
		System.out.println(dmin);
	}
}
