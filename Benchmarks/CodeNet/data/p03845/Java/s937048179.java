import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int[] T = new int[H];
		for(int i = 0; i < H; i++) {
			T[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[][] P = new int[M][H];
		for(int i = 0; i < M; i++) {
			System.arraycopy(T, 0, P[i], 0, T.length);
		}
		int tmp = 0;
		int[] sum = new int[M];
		for(int i = 0; i < M; i++) {
			tmp = sc.nextInt();
			P[i][tmp-1] = sc.nextInt();
			for(int tmp1: P[i]) {
				sum[i] += tmp1;
			}
		}

		for(int i = 0; i < M; i++) {
			System.out.println(sum[i]);
		}

		}
}