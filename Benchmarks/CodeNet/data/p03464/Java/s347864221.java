import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long[] arr = new long[k];
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		long max = 2;
		long min = 2;
		for (int i = 0; i < k; i++) {
			long a = arr[k - 1 - i];
			if (a > max) {
				System.out.println(-1);
				return;
			}
			if (min <= a) {
				min = a;
			} else {
				min = ((min + a - 1) / a) * a;
			}
			max = (max / a) * a + a - 1;
		}
		System.out.println(min + " " + max);
	}
}
