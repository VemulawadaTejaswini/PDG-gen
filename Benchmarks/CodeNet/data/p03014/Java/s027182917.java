import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] S = new String[H+2];
		int[][] wlen = new int[H+2][W+2];
		int[][] hlen = new int[H+2][W+2];
		for(int i = 1; i <= H; i++) {
			S[i] = sc.next();
			S[i] = '#' + S[i] + '#';
		}
		for(int i = 0; i < W+2; i++) {
			S[0] += '#';
			S[H+1] += '#';
		}
		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++) {
				wlen[i][j] = wlen[i][j-1];
				if(S[i-1].charAt(j) == '.')
					wlen[i][j] ++;
				else
					wlen[i][j] = 0;
			}
		}
		for(int i = 1; i <= H; i++) {
			for(int j = W; j >= 1; j--)
				if(S[i-1].charAt(j-1) == '.' && S[i-1].charAt(j) == '.')
					wlen[i][j-1] = wlen[i][j];
		}
		for(int j = 1; j <= W; j++) {
			for(int i = 1; i <= H; i++) {
				hlen[i][j] = hlen[i-1][j];
				if(S[i].charAt(j) == '.')
					hlen[i][j] ++;
				else
					hlen[i][j] = 0;
			}
		}
		for(int j = 1; j <= W; j++) {
			for(int i = H; i >= 1; i--)
				if(S[i-1].charAt(j) == '.' && S[i].charAt(j) == '.')
				hlen[i-1][j] = hlen[i][j];
		}
		int ans = 1;
		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++)
				ans = Math.max(ans,Math.max(hlen[i][j]+wlen[i][j]-1, Math.max(hlen[i][j],wlen[i][j])));		
		}
		System.out.println(ans);

	}

}
