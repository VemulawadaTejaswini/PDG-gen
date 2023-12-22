import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		int b[];
		int d1, d2, d3, d;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			a = new int[n + 1];
			b = new int[n];
			for (int i = 0; i < n + 1; i++) {
				a[i] = sc.nextInt();
			}
			d1 = a[1] - a[0];
			d2 = a[2] - a[1];
			d3 = a[3] - a[2];
			if (d1 == d2) {
				d = d1;
			} else if (d1 == d3) {
				d = d1;
			} else {
				d = d2;
			}
			
			for (int i = 0; i < n + 1; i++) {
				boolean f = true;
				int id = 0;
				for (int j = 0; j < n; j++) {
					if (id == i) {
						id++;
					}
					b[j] = a[id++];
				}
				for (int j = 1; j < n; j++) {
					if (b[j] - b[j - 1] != d) {
						f = false;
					}
				}
				if (f) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}