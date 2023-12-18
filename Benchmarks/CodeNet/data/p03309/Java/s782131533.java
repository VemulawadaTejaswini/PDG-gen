import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int k = 0;
		int kmin = 2147483647;
		float x=0;
		float y=0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			x+=i;
			y+=a[i];
			if (a[i] > max) {
				max = a[i];
			}
		}
		x=x/n;
		y=y/n;
		int atari=Math.round(x-y);
		for (int b =atari-2 ; b < atari+3; b++) {
			for (int i = 0; i < n; i++) {
				k = k + Math.abs(a[i] - (b + i + 1));
			}
			if (k < kmin) {
				kmin = k;
			}
			k = 0;
		}
		System.out.println(kmin);
	}
}
