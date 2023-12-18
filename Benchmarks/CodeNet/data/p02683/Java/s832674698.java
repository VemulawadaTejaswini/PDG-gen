import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ans = 1000000000;
		int n = in.nextInt();
		int m = in.nextInt();
		x = in.nextInt();
		int[][] info = new int[n][m + 1];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m + 1; j++) {
				info[i][j] = in.nextInt();
			}
		}
		int[] check = new int[n];
		dfs(info, check, 0, m);
		if(ans == 1000000000) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
	public static void dfs(int[][] info, int[] check, int cnt, int m) {
		if(cnt == check.length) {
			int price = 0;
			int[] temp = new int[m];
			for(int i = 0; i < check.length; i++) {
				if(check[i] == 1) {
					price += info[i][0];
					for(int j = 0; j < m; j++) {
						temp[j] += info[i][j + 1];
					}
				}
			}
			boolean flag = true;
			for(int i = 0; i < m; i++) {
				if(temp[i] < x) flag = false;
			}
			if(flag == true) {
				ans = Math.min(ans, price);
			}
			return;
		}
		dfs(info, check, cnt + 1, m);
		check[cnt] = 1;
		dfs(info, check, cnt + 1, m);
		check[cnt] = 0;
	}
} 
