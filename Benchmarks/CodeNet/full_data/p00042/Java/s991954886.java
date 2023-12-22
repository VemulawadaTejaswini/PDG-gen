import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			int W = sc.nextInt();
			if (W == 0) 
				break;
			
			System.out.printf("Case %1$d:", ++count);
			System.out.println();
			
			int n = sc.nextInt();
			int[] p = new int[n];
			int[] w = new int[n];
			sc.nextLine();
			
			for (int i = 0; i < n; i++) {
				String[] line = sc.nextLine().split(",");
				
				p[i] = Integer.parseInt(line[0]);
				w[i] = Integer.parseInt(line[1]);
			}
			
			nap(W, n, p, w);
		}
	}
	
	public static void nap(int W, int n, int[] p, int[] w) {
		int[][] map = new int[n+1][W+1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(map[n], -1);
		}
		
		map[0][0] = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= W; j++) {
				if (map[i][j] < 0) 
					continue;
				
				// iを使わない
				map[i+1][j] = Math.max(map[i][j], map[i+1][j]);
				
				// iを使う
				int weight = j + w[i];
				if (weight > W)
					continue;
				
				map[i+1][weight] = Math.max(map[i][j] + p[i], map[i+1][weight]);
			}
		}
		
		int maxP = 0;
		int maxW = 0;
		for (int j = 0; j <= W; j++) {
			if (map[n][j] > maxP) {
				maxP = map[n][j];
				maxW = j;
			}
		}
		System.out.println(maxP);
		System.out.println(maxW);
	}
}