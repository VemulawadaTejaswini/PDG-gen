import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}

		long sum1[] = new long[n];
		long sum2[] = new long[n];
		sum1[0]  = a[0];
		sum2[0] = a[0];
		long ans1 = 0;
		long ans2 = 0;

		for (int i = 1; i < n; i++) {//偶数添字が正
			sum1[i] = sum1[i-1]+a[i];
			if (i%2 == 0) {
				if (sum1[i] > 0) continue;
				else {
					ans1 += (1 + Math.abs(sum1[i]));
					sum1[i] = 1;
				}
			}
			else if (i%2 == 1) {
				if (sum1[i] < 0) continue;
				else {
					ans1 += (sum1[i] + 1);
					sum1[i] = -1;
				}
			}
		}
		
		for (int i = 1; i < n; i++) {//奇数添字が正
			sum2[i] = sum2[i-1]+a[i];
			if (i%2 == 1) {
				if (sum2[i] > 0) continue;
				else {
					ans2 += (1 + Math.abs(sum2[i]));
					sum2[i] = 1;
				}
			}
			else if (i%2 == 0) {
				if (sum2[i] < 0) continue;
				else {
					ans2 += (sum2[i] + 1);
					sum2[i] = -1;
				}
			}
		}

		System.out.println(Math.min(ans1, ans2));
	}
}
