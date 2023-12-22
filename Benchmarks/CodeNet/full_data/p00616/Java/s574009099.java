import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int x[], y[], z[];
		int count;

		while (true) {
			n  =sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			x = new int[m];
			y = new int[m];
			z = new int[m];
			for (int i = 0; i < m; i++) {
				String s = sc.next();
				if (s.equals("xy")) {
					x[i] = sc.nextInt();
					y[i] = sc.nextInt();
				} else if (s.equals("xz")) {
					x[i] = sc.nextInt();
					z[i] = sc.nextInt();
				} else if (s.equals("yz")) {
					y[i] = sc.nextInt();
					z[i] = sc.nextInt();
				}
			}

			count = 0;
			TreeSet<Integer> ts = new TreeSet<Integer>();
			for (int i = 0; i < m ;i++) {
				ts.clear();
				for (int j = i + 1; j < m; j++) {
					if (x[i] == 0) {
						if (x[j] != 0 && (y[i] == y[j] || z[i] == z[j])) {
							ts.add(x[i]);
						}
					} else if (y[i] == 0) {
						if (y[j] != 0 && (x[i] == x[j] || z[i] == z[j])) {
							ts.add(y[i]);
						}
					} else {
						if (z[j] != 0 && (x[i] == x[j] || y[i] == y[j])) {
							ts.add(z[i]);
						}
					}
				}
				count += ts.size();
			}
			
			System.out.println(((n * n * n) - (m * n) + count));
		}
	}
}