import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int n;
	static ArrayList<ArrayList<Integer>> edge;
	static boolean used[];

	static boolean flag = false;
	static int ans;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j <= i; j++) {
				if (a[i] > a[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {

			} else {
				ans++;
			}
		}

		System.out.println(ans);
	}
}