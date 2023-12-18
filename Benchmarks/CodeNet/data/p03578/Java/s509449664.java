import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++)
			d[i] = scan.nextInt();
		int m = scan.nextInt();
		int[] t = new int[m];
		for (int i = 0; i < m; i++)
			t[i] = scan.nextInt();
		Arrays.sort(d);
		Arrays.sort(t);
		int index = 0;
		for (int i = 0; i < m;) {
			if (index == n) {
				System.out.println("NO");
				return;
			}
			if (t[i] == d[index]) {
				i++;
				index++;
			} else {
				index++;
			}
		}
		System.out.println("YES");
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
