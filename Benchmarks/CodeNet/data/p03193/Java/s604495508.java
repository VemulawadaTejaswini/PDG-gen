import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int H = sc.nextInt();
	static int W = sc.nextInt();
	static int[] a = new int[N];
	static int[] b = new int[N];
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (a[i] >= H && b[i] >=W) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
