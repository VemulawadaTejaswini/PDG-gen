import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int[n + 1];
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];
		boolean able = true;
		for (int i = 1; i <= n; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int tt = t[i + 1] - t[i];
			int xt = (x[i + 1] >= x[i])? x[i + 1] - x[i] : x[i] - x[i + 1];
			int yt = (y[i + 1] >= y[i])? y[i + 1] - y[i] : y[i] - y[i + 1];
			if (xt + yt > tt || (xt + yt) % 2 != tt % 2) {
				able = false;
				break;
			}
		}
		System.out.println((able)? "Yes" : "No");
	}
}