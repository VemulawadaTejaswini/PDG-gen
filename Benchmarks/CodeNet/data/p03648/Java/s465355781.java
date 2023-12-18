import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		int n;
		long[] arr;
		if (k <= 50) {
			if (k == 0) {
				n = 2;
				arr = new long[]{1, 1};
			} else if (k == 1) {
				n = 2;
				arr = new long[]{0, 2};
			} else {
				n = (int)k;
				arr = new long[n];
				for (int i = 0; i < n; i++) {
					arr[i] = i + 1;
				}
			}
		} else {
			long div = k / 50;
			long mod = k % 50;
			n = 50;
			arr = new long[50];
			for (int i = 0; i < 50; i++) {
				arr[i] = i + div;
			}
			for (int i = 0; i < mod; i++) {
				arr[n - 1 - i]++;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(n).append("\n");
		for (int i= 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}
