import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int left = 0;
		int right = 0;
		int max = 0;
		while (right < n) {
			if (arr[right] - arr[left] < 3) {
				max = Math.max(max, right - left + 1);
				right++;
			} else {
				left++;
			}
		}
		System.out.println(max);
	}
}
