import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arrA = new long[n + 1];
		for (int i = 0; i <= n; i++) {
			arrA[i] = sc.nextInt();
		}
		long total = 0;
		for (int i = 0; i < n; i++) {
			long b = sc.nextInt();
			if (b > arrA[i]) {
				total += arrA[i];
				b -= arrA[i];
				total += Math.min(arrA[i + 1], b);
				arrA[i + 1] = Math.max(0, arrA[i + 1] - b);
			} else {
				total += b;
			}
		}
		System.out.println(total);
	}
}
