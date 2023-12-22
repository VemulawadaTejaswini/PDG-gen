import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a2, delta = 0;
		int N = scn.nextInt(), M = scn.nextInt(), T = scn.nextInt(),a1 = scn.nextInt();
		for (int i = 0; i < N; i++) {
			a2 = i == N-1?T+M:scn.nextInt();
			delta += 2 * M > a2 - a1 ? 2 * M + a1 - a2 : 0;
			a1 = a2;
		}
		scn.close();
		System.out.println(T + delta - 2*M*N);
	}
}
