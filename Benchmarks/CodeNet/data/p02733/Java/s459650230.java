import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int[][] s = new int[H][W];
		for(int i = 0; i < H; i++) {
			String S = sc.next();
			for(int j = 0; j < W; j++)
				s[i][j] = Character.getNumericValue(S.charAt(j));
		}
		int ans = 100000;
		LOOP:for(int i = 0; i < 1 << H; i++) {
			int temp = 0;
			int[][] x = new int[H][W];
			for(int j = 0; j < H; j++) {
				for(int k = 0; k < W; k++)
					x[temp][k] += s[j][k];
				if((1 & i >> j) == 1)
					temp++;
			}
			int[] sum = new int[H];
			for(int j = 0; j < W; j++) {
				for(int k = 0; k < H; k++) {
					if(x[k][j] > K)
						continue LOOP;
					sum[k] += x[k][j];
					if(sum[k] > K) {
						temp++;
						for(int l = 0; l < H; l++)
							sum[l] = x[l][j];
						break;
					}
				}
			}
			ans = Math.min(ans, temp);
		}
		System.out.println(ans);
	}

}
