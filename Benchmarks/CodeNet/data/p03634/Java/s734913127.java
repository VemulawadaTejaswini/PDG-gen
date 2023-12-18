import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int n;
	private int[][] map;
	
	private long[] node;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		n = sc.nextInt();

		map = new int[n + 1][n + 1];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = 0;
			}
		}
		
		for (int i = 0; i < (n - 1); i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int val = sc.nextInt();
			map[from][to] = val;
			map[to][from] = val;
		}
		
		int q = sc.nextInt();
		int k = sc.nextInt();
		
		node = new long[n + 1];
		for (int i = 0; i < node.length; i++) {
			node[i] = -1;
		}
		node[k] = 0;
		calc(k);

		for (int i = 0; i < q; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();

			System.out.println(node[from] + node[to]);
		}
	}
	
	private void calc(int from) {
		for (int i = 1; i < (n + 1); i++) {
			if ((map[from][i] == 0) || node[i] != -1) continue;
			
			node[i] = node[from] + map[from][i];
			calc(i);
		}
	}
}