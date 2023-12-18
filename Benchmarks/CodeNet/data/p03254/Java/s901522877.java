
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			String tmp = sc.nextLine();

			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}

			Arrays.sort(arr);

			int cnt = 0;
			for (long i : arr) {
				if (i <= x) {
					cnt++;
					x -= i;
				} else {
					break;
				}
			}
			if (0 < x && 0 < cnt) cnt--;

			System.out.println(cnt);
		}
	}
}
