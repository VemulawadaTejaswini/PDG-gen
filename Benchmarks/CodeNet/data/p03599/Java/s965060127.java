import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = sc.nextInt();
		int d = sc.nextInt();

		int e = sc.nextInt();

		int f = sc.nextInt();

		int w = 0;
		int s = 0;

		int an = f / a;
		int bn = f / b;
		for(int i = 0; i <= an; i++) {
			for(int j = 0; j <= bn; j++) {
				int tmpW = 100 * (i + j);
				if(tmpW > f) {
					continue;
				}
				int limE = e * (i + j);
				int cn = limE / c;
				int dn = limE / d;
				for(int k = 0; k <= cn; k++) {
					for(int l = 0; l <= dn; l++) {
						int sum = c * k + d * j;
						if(s < sum && sum <= limE && (sum + tmpW) <= f) {
							s = sum;
							w = tmpW;
						}
					}
				}
			}
		}

		System.out.println((s + w) + " " + s);
	}
}
