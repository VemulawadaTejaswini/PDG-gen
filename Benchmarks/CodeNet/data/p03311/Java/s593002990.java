import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long sum  = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			sum += a[i];
		}
		sum /= n;
		sum = sum - n / 2;
		int c = (int)sum;
		long ans = Long.MAX_VALUE;;
		for (int i = c - 30; i < c + 31; i++) {
			long tem = 0;
			for (int j = 0; j < n; j++) {
				tem += Math.abs(a[j] - (i + j));
			}
			ans = Math.min(ans, tem);
		}
		System.out.println(ans);
	}
}