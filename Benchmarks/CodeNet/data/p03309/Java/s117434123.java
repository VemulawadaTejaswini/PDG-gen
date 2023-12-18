import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] a = new int[N];
		int b = 0;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			a[i] = reader.nextInt();
			b += a[i];
			b -= (i+1);
		}
		b /= N;

		for (int i = 0; i < N; i++) {
			ans += Math.abs(a[i]-(b+i+1));
		}
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			tmp += Math.abs(a[i]-(b+i));
		}

		reader.close();
		System.out.print(Math.min(ans, tmp));
	}
}