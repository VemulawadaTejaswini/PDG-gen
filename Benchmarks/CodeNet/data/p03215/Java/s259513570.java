import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				int[] bubun = new int[i];
				System.arraycopy(a, j, bubun, 0, i);
				int sum = Arrays.stream(bubun).sum();
				list.add(sum);
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		int ans = list.get(0);
		for (int i = 1; i < k; i++) {
			ans = (ans & list.get(i));
		}
		System.out.println(ans);
	}
}