import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();
		
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {
				ans++;
				i++;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
