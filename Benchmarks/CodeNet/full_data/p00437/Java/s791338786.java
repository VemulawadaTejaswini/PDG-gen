import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int f[];
		int m;
		int p[], q[], r[], s[];

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		while (a + b + c != 0) {
			m = sc.nextInt();
			f = new int[a + b + c];
			p = new int[m];
			q = new int[m];
			r = new int[m];
			s = new int[m];
			for (int i = 0; i < a + b + c; i++) {
				f[i] = 2;
			}
			for (int i = 0; i < m; i++) {
				p[i] = sc.nextInt();
				q[i] = sc.nextInt();
				r[i] = sc.nextInt();
				s[i] = sc.nextInt();
				if (s[i] == 1) {
					f[p[i] - 1] = 1;
					f[q[i] - 1] = 1;
					f[r[i] - 1] = 1;
				}
			}
			for (int i = 0; i < m; i++) {
				if (s[i] == 0) {
					if (f[p[i] - 1] + f[q[i] - 1] + f[r[i] - 1] == 4) {
						if (f[p[i] - 1] == 2) {
							f[p[i] - 1] = 0;
						} else if (f[q[i] - 1] == 2) {
							f[q[i] - 1] = 0;
						} else if (f[r[i] - 1] == 2) {
							f[r[i] - 1] = 0;
						}
					}
				}
			}
			
			for (int i = 0; i < a + b + c; i++) {
				System.out.println(f[i]);
			}
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
	}
}