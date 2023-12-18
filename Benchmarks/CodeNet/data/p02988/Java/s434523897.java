import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(sc.next());
			if (i == 0 || i == 1) {
				continue;
			}
			int a = array[i - 2];
			int b = array[i - 1];
			int c = array[i];
			if (a == b && b == c) {
				continue;
			}
			int diff = (a - b) * (b - c);
			if (diff >= 0) {
				ans++;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}