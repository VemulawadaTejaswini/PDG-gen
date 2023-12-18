import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			int x = Math.abs(total - sum * 2);
			if (min > x) {
				min = x;
			}
		}
		System.out.println(min);
	}
}
