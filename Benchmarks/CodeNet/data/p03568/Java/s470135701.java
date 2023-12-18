import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				cnt *= 2;
			}
		}
		int ans = (int) (Math.pow(3, n) - cnt);
		System.out.println(ans);
	}
}