import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			if (i + 1 == a[a[i] - 1])
				ans++;
		}
		System.out.println(ans / 2);
	}
}