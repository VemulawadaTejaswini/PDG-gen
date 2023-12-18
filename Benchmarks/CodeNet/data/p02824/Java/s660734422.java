import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int v = scanner.nextInt();
		int p = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.parallelSort(a);

		int result = p;

		for (int i = p + 1; i <= n; i++) {
			if (canBeChosen(i, n, m, v, p, a)) {
				result = i;
			} else {
				break;
			}
		}

		System.out.println(result);
	}

	static boolean canBeChosen(int k, int n, int m, int v, int p, int[] a) {
		if(a[n-k]==a[n-p]){{
			return true;
		}
		int threshold = a[n - k] + m;
		if (threshold < a[n - p]) {
			return false;
		}
		int remain = v - (n - k + p);
		if (remain <= 0) {
			return true;
		}
		int canVote = 0;
		for (int i = p; i < k; i++) {
			canVote += threshold - a[n - i];
		}
		if (canVote < remain * m) {
			return false;
		} else {
			return true;
		}
	}
}
