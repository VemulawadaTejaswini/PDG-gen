import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int n;
	private long[][] map;
	
	boolean[] flag;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		n = sc.nextInt();

		map = new long[n + 1][n + 1];
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

		for (int i = 0; i < q; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();

			flag = new boolean[n + 1];
			for (int j = 0; j < n; j++) {
				flag[j] = false;
			}
			long ans = calc(from, k);
			
			flag = new boolean[n + 1];
			for (int j = 0; j < n; j++) {
				flag[j] = false;
			}
			ans = ans + calc(k, to);

			System.out.println(ans);
		}
	}
	
	private long calc(int from, int to) {
		flag[from] = true;
		
		if (map[from][to] != 0) {
			flag[from] = false;
			return map[from][to];
		}
		
		long tmp = 0;
		long min = 0;
		for (int i = 1; i < n; i++) {
			if ((flag[i] == true) || (map[from][i] == 0)) continue;
			
			tmp = map[from][i] + calc(i, to);
			if (((min == 0) || (min > tmp)) && (tmp != map[from][i])) min = tmp;
		}
		
		flag[from] = false;
		map[from][to] = min;
		return min;
	}
}