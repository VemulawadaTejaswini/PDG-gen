import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int n = sc.nextInt();
		int[][] c = new int[H][W];
		int[] a = new int[n];
		int now = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(a[now] == 0) now++;
				c[i][i%2 == 0 ? j : W-j-1] = now+1;
				a[now]--;
			}

		}
		for(int i = 0 ;i < H; i++) {
			for(int j = 0; j < W; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();
	}
}