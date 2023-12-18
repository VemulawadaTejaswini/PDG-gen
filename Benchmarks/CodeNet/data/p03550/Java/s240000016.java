import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n == 1) {
			System.out.println(Math.abs(arr[n - 1] - w));
		} else {
			System.out.println(Math.max(Math.abs(arr[n - 1] - w), Math.abs(arr[n - 1] - arr[n - 2])));
		}
	}
}
