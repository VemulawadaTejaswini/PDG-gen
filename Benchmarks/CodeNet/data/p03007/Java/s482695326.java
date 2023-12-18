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
		int prev = arr[0];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n - 1; i++) {
			sb.append(prev).append(" ").append(arr[i]).append("\n");
			prev = prev - arr[i];
		}
		sb.append(arr[n - 1]).append(" ").append(prev).append("\n");
		int ans = arr[n - 1] - prev;
		System.out.println(ans);
		System.out.print(sb);
	}
}
