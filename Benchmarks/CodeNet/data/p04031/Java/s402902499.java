import java.util.*;
public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			min = Math.min(arr[i], min);
			max = Math.max(arr[i], max);
		}
		int k = min + (max - min) / 2;
		int res = 0;

		for(int i = 0; i < n; i++) {
			res += Math.pow(arr[i] - k, 2);
		}
		System.out.println(res);
	}
}