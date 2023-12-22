import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[][] isWay = new boolean[m+1][m+1];//isWay[i][j] i -> j で jが根
		int[] deg = new int[m+1];//deg[i] ... 頂点iの入次数
		while(n--!=0) {
			int x = sc.nextInt(), y = sc.nextInt();
			isWay[y][x] = true;
			deg[y]++;
		}
		for(int i = 0; i < m; i++) {
			for(int j = 1; j <= m; j++) {
				if(deg[j] == 0) {
					if(i != m-1 && j == 2) continue;
					System.out.println(j);
					deg[j] = -1;
					for(int k = 1; k <= m; k++) {
						if(isWay[k][j]) deg[k]--;
					}
				}
			}
		}
	}
}
