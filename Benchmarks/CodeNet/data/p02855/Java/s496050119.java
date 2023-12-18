import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char[][] a = new char[H][W];
		boolean[] s = new boolean[H];
		for(int i = 0; i < H; i++) {
			String S = sc.next();
			a[i] = S.toCharArray();
			s[i] = S.contains("#");
		}
		int firsts = 0;
		for(int i = 0; i < H; i++) {
			if(s[i]) {
				firsts = i;
				break;
			}
		}
		int[][] ans = new int[H][W];
		int p = 1;
		for(int i = firsts; i < H; i++) {
			if(!s[i]) {
				for(int j = 0; j < W; j++)
					ans[i][j] = ans[i-1][j];
			}
			else {
				boolean first = true;
				for(int j = 0; j < W; j++) {
					if(a[i][j] == '.') {
						ans[i][j] = p;
					}
					else {
						if(first)
							first = false;
						else
							p++;
						ans[i][j] = p;
					}
				}
				p++;
			}
		}
		for(int i = 0; i < firsts; i++)
			for(int j = 0; j < W; j++)
				ans[i][j] = ans[firsts][j];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++)
				System.out.print(ans[i][j]+ " ");
			System.out.println();
		}

	}

}
