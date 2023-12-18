import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.fill(b, 0);
		int sum = 0;
		for (int i = n ; i >=1 ; i--) {
			for (int o = i; o <= n; o = o + i) {
				if (b[o] == 1) {
					sum++;
				}
			}
			b[i] = Math.abs((sum % 2) - a[i]);
			sum = 0;

		}

		int hai = haisum(b);
		System.out.println(hai);
		for (int i = 1; i <= n; i++) {
			if (b[i] == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	static int haisum(int a[]) {
		int n = a.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += a[i];
		}
		return ans;
	}

}