import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sc.close();

		if (n == 1) {
			System.out.println(sum);
			return;
		}
		List<Integer> list = divList(sum);
		for (int i = list.size() - 1; i >= 0; i--) {
			int ans = list.get(i);
			long[] l = new long[n];
			for (int j = 0; j < a.length; j++) {
				l[j] = a[j] % ans;
			}
			Arrays.parallelSort(l);
			long[] r = new long[n];
			for (int j = 0; j < a.length; j++) {
				if (l[j] > 0) {
					r[j] = ans - l[j];
				}
			}
			for (int j = 1; j < a.length; j++) {
				l[j] += l[j - 1];
			}
			for (int j = a.length - 2; j >= 0; j--) {
				r[j] += r[j + 1];
			}
			for (int j = 0; j < a.length - 1; j++) {
				if (l[j] == r[j + 1] && l[j] <= k) {
					System.out.println(ans);
					return;
				}
			}
		}
	}

	static List<Integer> divList(int n) {
		List<Integer> list = new ArrayList<>();
		int end = (int) Math.sqrt(n) + 1;
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		end = list.size();
		for (int i = end - 1; i >= 0; i--) {
			list.add(n / list.get(i));
		}
		return list;
	}
}
