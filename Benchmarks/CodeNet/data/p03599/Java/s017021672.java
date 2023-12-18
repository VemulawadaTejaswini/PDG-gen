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

		int sw = 0;
		int w = 0;
		int s = 0;

		int minW = Math.min(a, b);
		w = minW * 100;
		e *= minW;

		int cn = (minW * e) / c;
		int dn = (minW * e) / d;
		for(int i = 0; i <= cn; i++) {
			for(int j = 0; j <= dn; j++) {
				int sum = c * i + d * j;
				if(s < sum && sum <= e) {
					s = sum;
				}
			}
		}

		sw = s + w;

		/*
			 sw = s + w;
			 while (f <= sw) {
			 if(Math.abs(f - (sw - c)) < Math.abs(f - (sw - d))) {
			 sw -= c;
			 s -= c;
			 }
			 else {
			 sw -= d;
			 s -= d;
			 }
			 }
		 */

		System.out.println(sw + " " + s);
	}
}
