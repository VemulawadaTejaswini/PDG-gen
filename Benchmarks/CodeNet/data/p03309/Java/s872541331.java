import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt() - (i + 1);
		}

		long ans_sum = Long.MAX_VALUE;
		boolean p = true;
		boolean m = true;
		for(int b = 0; ; b++) {
			long sum_m = 0;
			long sum_p = 0;
			for(int j = 0; j < n; j++) {
				if(p) sum_p += Math.abs(a[j] - b);
				if(m) sum_m += Math.abs(a[j] - (-1 * b));
			}

			if(ans_sum < sum_p) p = false;
			if(ans_sum < sum_m) m = false;
			if(!p && !m) break;

			if(p && ans_sum > sum_p) {
				ans_sum = sum_p;
			}
			if(m && ans_sum > sum_m) {
				ans_sum = sum_m;
			}
		}
		System.out.println(ans_sum);
    }
}
