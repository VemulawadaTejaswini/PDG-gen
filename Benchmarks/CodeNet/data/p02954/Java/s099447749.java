import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int n = c.length;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = 0;
		}
		int evn = 0;
		int odd = 0;
		int rtnPos = 0;
		for (int i = 0; i < n - 1; i++) {
			if (c[i] == 'R' && c[i + 1] == 'L') {
				a[i]++;
				if (i % 2 == 0) {
					a[i] += evn;
					a[i + 1] += odd;
				} else {
					a[i] += odd;
					a[i + 1] += evn;
				}
				evn = 0;
				odd = 0;
				rtnPos = i;
			} else if (c[i] == 'L' && c[i + 1] == 'R') {
				if (i % 2 == 0) {
					evn++;
				} else {
					odd++;
				}
				if (rtnPos % 2 == 0) {
					a[rtnPos] += evn;
					a[rtnPos + 1] += odd;
				} else {
					a[rtnPos] += odd;
					a[rtnPos + 1] += evn;
				}
				evn = 0;
				odd = 0;
			} else if (i % 2 == 0) {
				evn++;
			} else {
				odd++;
			}
		}

		if ((n - 1) % 2 == 0) {
			evn++;
		} else {
			odd++;
		}

		if (rtnPos % 2 == 0) {
			a[rtnPos] += evn;
			a[rtnPos + 1] += odd;
		} else {
			a[rtnPos] += odd;
			a[rtnPos + 1] += evn;
		}

		System.out.print(a[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + a[i]);
		}
	}
}
