import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt() - i;
		}
		Arrays.sort(arr);
		int a = arr[n / 2];
		int b = arr[Math.max(n / 2 - 1, 0)];
		long totalA = 0;
		long totalB = 0;
		for (int i = 0; i < n; i++) {
			totalA += Math.abs(arr[i] - a);
			totalB += Math.abs(arr[i] - b);
		}
		System.out.println(Math.min(totalA, totalB));
	}
}
