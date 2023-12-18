import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt() - i - 1;
		}
		Arrays.sort(arr);
		int m;
		if (n % 2 == 0) {
			m = (arr[n / 2] + arr[(n - 1) / 2]) / 2;
		} else {
			m = arr[n / 2];
		}
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += Math.abs(arr[i] - m);
		}
		System.out.println(total);
	}
}
