import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 2;
		int min = 2;
		for (int i = k - 1; i >= 0; i--) {
			int x = arr[i];
			int mod = max % x;
			if (max - mod < min) {
				System.out.println(-1);
				return;
			}
			max = (max / x) * x + x - 1;
			min = ((min + x - 1) / x) * x;
		System.out.println(min + " " + max);
		}
		System.out.println(min + " " + max);
	}
}
