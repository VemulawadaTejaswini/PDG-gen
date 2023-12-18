import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int x[] = new int[n];
		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(str[i]);
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i + k - 1 < n; i++) {
			int left = x[i];
			int right = x[i + k - 1];

			ans = Math.min(ans, Math.min(Math.abs(left), Math.abs(right)) + right - left);
		}

		System.out.println(ans);
	}
}
