import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt() - i - 1;
		Arrays.sort(a);
		int[] s = new int[N + 1];
		for (int i = 0; i < N; i++)
			s[i] = i == 0 ? a[i] : s[i - 1] + a[i];
		int total = s[N - 1];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (i > 0 && a[i] == a[i - 1])
				continue;
			int l = a[i] * (i + 1) - s[i];
			int h = (total - s[i]) - a[i] * (N - i - 1);
			min = Math.min(min, l + h);
		}
		System.out.println(min);
	}
}
