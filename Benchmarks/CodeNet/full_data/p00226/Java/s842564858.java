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
		for (;sc.hasNext();) {
			char[] a = sc.next().toCharArray();
			char[] b = sc.next().toCharArray();
			if (a.length != 4) break;
			int hit = 0;
			int blow = 0;
			
			int[] aa = new int[10];
			int[] bb = new int[10];
			for (int i = 0; i < 4; i++) {
				if (a[i] == b[i]) {
					hit++;
				} else {
					aa[a[i]-'0']++;
					bb[b[i]-'0']++;
				}
			}
			for (int i = 0; i < 10; i++) blow += Math.min(aa[i], bb[i]);			
			System.out.println(hit + " " + blow);
		}
	}
}