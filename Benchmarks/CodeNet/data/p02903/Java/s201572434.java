import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[][] ans = new int[H][W];
		for(int i = 0; i < B; i++)
			for(int j = 0; j < A; j++)
				ans[i][j] = 1;
		for(int i = B; i < H; i++)
			for(int j = A; j < W; j++)
				ans[i][j] = 1;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++)
				System.out.print(ans[i][j]);
			System.out.println();
		}

	}

}