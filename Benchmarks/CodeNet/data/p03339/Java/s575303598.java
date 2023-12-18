import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int N = s.nextInt();
		String str = s.nextLine();
		int[] w = new int[N];
		int[] e = new int[N];

		w[0] = str.charAt(0) == 'W' ? 1 : 0;
		for (int i = 1; i < N; i++) {
			w[i] = w[i - 1] + (str.charAt(i) == 'W' ? 1 : 0);
		}

		e[N - 1] = str.charAt(N - 1) == 'E' ? 1 : 0;
		for (int i = N - 2; 0 <= i; i--) {
			e[i] = e[i + 1] + (str.charAt(i) == 'E' ? 1 : 0);
		}

		int min = Math.min(w[N - 1], e[0]);
		for (int i = 1; i < N - 1; i++) {
			min = Math.min(min, w[i - 1] + e[i + 1]);
		}
		System.out.println(min);
	}
}