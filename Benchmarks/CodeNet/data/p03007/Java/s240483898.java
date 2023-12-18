import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long prev1 = arr[0];
		StringBuilder sb1 = new StringBuilder();
		for (int i = 1; i < n - 1; i++) {
			sb1.append(prev1).append(" ").append(arr[i]).append("\n");
			prev1 = prev1 - arr[i];
		}
		sb1.append(arr[n - 1]).append(" ").append(prev1).append("\n");
		long ans1 = arr[n - 1] - prev1;
		
		long prev2 = arr[n - 1];
		StringBuilder sb2 = new StringBuilder();
		for (int i = n - 2; i >= 0; i--) {
			sb2.append(prev2).append(" ").append(arr[i]).append("\n");
			prev2 = prev2 - arr[i];
		}
		sb2.append(prev2).append(" ").append(arr[0]).append("\n");
		long ans2 = prev2 - arr[0];
		if (ans1 > ans2) {
			System.out.println(ans1);
			System.out.print(sb1);
		} else {
			System.out.println(ans2);
			System.out.print(sb2);
		}
	}
}
