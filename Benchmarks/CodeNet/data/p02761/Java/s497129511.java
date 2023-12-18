import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] ans = new int[N+1];
		boolean[] vst = new boolean[N+1];
		int s, c;
		boolean f = false;
;
		for (int i = 0; i < M; i++) {
			s = scan.nextInt();
			c = scan.nextInt();
			if (!vst[s]) {
				vst[s] = true;
				ans[s] = c;
			} else if (ans[s] != c) {
				f = true;
				break;
			}
		}

		if (ans[1] == 0) f = true;

		if (f) {
			System.out.println(-1);
		} else {
			for (int i = 1; i < N+1; i++) {
				System.out.print(ans[i]);
			}
		}

	}

}
