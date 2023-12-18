import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1, b = in.nextInt() - 1;
			if(arr[a] == arr[b]) {
				arr[Math.max(a, b)] = arr[Math.min(a, b)] + 1;
			}
		}
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}