import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] n = new int[N];
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			n[i] = i + 1;
			if (i != 0) {
				p[i - 1] = i + 1;
			}
		}
		p[p.length - 1] = n[0];
		long ans = 0;
		for (int i = 0; i < N - 1; i++) {
			ans += n[i];
		}
		System.out.println(ans);
		in.close();
	}
}