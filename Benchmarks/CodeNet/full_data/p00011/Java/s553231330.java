import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s0,\\s0||\\s");

		int w = sc.nextInt();
		int n = sc.nextInt();

		int[] amida;
		amida = new int[w];

		for (int i = 0; i < w; i++) {
			amida[i] = i + 1;
		}

		int a;
		int b;
		int t;

		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			t = amida[a];
			amida[a] = amida[b];
			amida[b] = t;
		}

		for (int i = 0; i < n; i++)
			System.out.printf("%d\n", amida[i]);

	}
}