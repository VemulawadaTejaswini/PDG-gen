import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		long c = 1;
		long d = 1;
		for(int i = 0 ; i < n ; i++) {
			// c <= x * a[i] & d <= x * b[i]なる最小のxを求める
			// x = 3, c/a[i] = 2.5の場合、切り上げが必要なことに注意
			long x = Math.max((c + a[i] - 1) / a[i], (d + b[i] - 1) / b[i]);
			c = a[i] * x;
			d = b[i] * x;
		}
		System.out.println(c + d);
	}
}
