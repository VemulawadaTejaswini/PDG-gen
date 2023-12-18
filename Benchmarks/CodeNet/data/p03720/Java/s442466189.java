import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cnt = new int[n];
		for (int i = 0; i < n; i++) {
			cnt[i] = 0;
		}
		for (int i = 0; i < m * 2; i++) {
			cnt[sc.nextInt() - 1]++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(cnt[i]);
		}
	}
}