import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N, M, T;
		int a1, a2, delta = 0;
		N = scn.nextInt();
		M = scn.nextInt();
		T = scn.nextInt();
		a1 = scn.nextInt();
		for (int i = 1; i < N; i++) {
			a2 = scn.nextInt();
			delta += 2 * M > a2 - a1 ? 2 * M + a1 - a2 : 0;
			a1 = a2;
		}
		a2 = T+M;
		delta += 2 * M > a2 - a1 ? 2 * M + a1 - a2 : 0;
		scn.close();
		System.out.println(T + delta - 2*M*N);
	}
}

