import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			if (n == 0) break;
			int a = 0;
			int min = Integer.MAX_VALUE;
			int max = 0;
			for (int i = 0; i < n; i++) {
				int t = Integer.parseInt(sc.next());
				min = Math.min(min, t);
				max = Math.max(max, t);
				a += t;
			}
			a -= min + max;
			System.out.println(a / (n - 2));
		}
	}
}
