
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(l);

		int right = 2;
		int mid = 1;
		int left = 0;
		int ans = 0;

		for (int i = 0; i <= n - 3; i++) {
			for (int j = i + 1; j <= n - 2; j++) {
				for (int k = j + 1; k <= n - 1; k++) {
					if (check(l[i], l[j], l[k]))
						ans++;
				}
			}
		}

		System.out.println(ans);
	}

	static boolean check(int le, int mi, int ri) {
		if (le < mi + ri && mi < le + ri && ri < le + mi)
			return true;
		else
			return false;
	}

}
