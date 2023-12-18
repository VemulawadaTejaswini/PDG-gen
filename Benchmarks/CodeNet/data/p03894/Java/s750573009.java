import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] arr = new char[n];
		Arrays.fill(arr, '0');
		arr[0] = 'a';
		arr[1] = 'b';
		int aidx = 0;
		for (int i = 0; i < q; i++) {
			int from = sc.nextInt() - 1;
			int to = sc.nextInt() - 1;
			char x = arr[to];
			arr[to] = arr[from];
			arr[from] = x;
			if (arr[from] == 'a') {
				aidx = from;
			} else if (arr[to] == 'a') {
				aidx = to;
			}
			if (aidx != 0) {
				arr[aidx - 1] = 'b';
			}
			if (aidx != n - 1) {
				arr[aidx + 1] = 'b';
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'a' || arr[i] == 'b') {
				count++;
			}
		}
		System.out.println(count);
	}
}
