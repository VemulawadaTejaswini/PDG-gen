
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		int[] a = {1, 0, 0};
		for (;sc.hasNext();) {
			String s = sc.next();
			char c1 = s.charAt(0);
			char c2 = s.charAt(2);
			swap(a, c1 - 'A', c2 - 'A');
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				System.out.println((char)('A' + i));
			}
		}
	}
	void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}