import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int c[][] = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int A[][] = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		int ans[] = new int[10];
		ans[1] = 0;
		boolean flag[] = new boolean[10];
		for(int i = 0; i < 10; i++) {
			if(i == 1) continue;
			flag[i] = true;
			ans[i] = DFS(i, c, flag, 0, Integer.MAX_VALUE);
			flag[i] = false;
		}
		
		int sum = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(A[i][j] == -1) continue;
				sum += ans[A[i][j]];
			}
		}
		System.out.println(sum);
	}
	
	public static int DFS(int k, int c[][], boolean flag[], int cnt, int min) {
		for(int i = 0; i < 10; i++) {
			if(flag[i]) continue;
			if(i == 1) {
				min = Math.min(min, cnt + c[k][i]);
			} else {
				flag[i] = true;
				min = Math.min(min, DFS(i, c, flag, cnt + c[k][i], min));
				flag[i] = false;
			}
		}
		return min;
	}
}
