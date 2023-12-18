import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int cost = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (i == 0) {
				cost = Math.abs(arr[i]);
			} else {
				cost += Math.abs(arr[i] - arr[i - 1]);
			}
		}
		cost += Math.abs(arr[n - 1]);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int a;
			if (i == 0) {
				a = 0;
			} else {
				a = arr[i - 1];
			}
			int b = arr[i];
			int c;
			if (i == n - 1) {
				c = 0;
			} else {
				c = arr[i + 1];
			}
			sb.append(cost - Math.abs(a - b) - Math.abs(b - c) + Math.abs(a - c)).append("\n");
		}
		System.out.print(sb);
	}
}
