import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] b = new int[n];

		for (int i = 0; i < n - 1; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		int cnt = b[0];
		for (int i = 0; i < n - 1; i++) {
			cnt += Math.min(b[i], b[i + 1]);
		}
		cnt += b[n - 2];

		System.out.println(cnt);
		sc.close();
	}
}