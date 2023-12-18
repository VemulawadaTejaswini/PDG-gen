import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] xarr = br.readLine().split(" ", n);
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(xarr[i]);
		}
		int l = Integer.parseInt(br.readLine());
		int[] hotels = new int[n];
		int left = n - 1;
		int right = n - 2;
		while (left >= 0) {
			if (right == 0) {
				hotels[left] = 0;
				left--;
				continue;
			}
			if (arr[left] - arr[right - 1] > l) {
				hotels[left] = right;
				left--;
			} else {
				right--;
			}
		}
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			String[] line = br.readLine().split(" ", 2);
			int st = Integer.parseInt(line[0]) - 1;
			int ed = Integer.parseInt(line[1]) - 1;
			int count = 1;
			int x = Math.max(st, ed);
			st = Math.min(st, ed);
			while (hotels[x] > st) {
				x = hotels[x];
				count++;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
