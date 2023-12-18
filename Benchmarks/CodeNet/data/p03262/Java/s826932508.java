import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long x = Long.parseLong(str[1]);

		str = br.readLine().split(" ");

		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		Arrays.sort(a);

		int left = 0;
		int right = n - 1;
		int mid = (right + left) / 2;

		while (right - left > 1) {
			mid = (right + left) / 2;

			if (x < a[mid]) {
				right = mid;
			} else if (x > a[mid]) {
				left = mid;
			}
		}

		int ans = (int) Math.min(Math.abs(x - a[left]), Math.abs(x - a[right]));

		System.out.println(ans);
	}
}
