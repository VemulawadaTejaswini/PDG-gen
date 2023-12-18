import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a]++;
			arr[b]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i =1; i <= n; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
	}
}
