import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int stations = sc.nextInt();
			int def_paths = sc.nextInt();
			int companys = sc.nextInt();
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			
			if(stations == 0 && def_paths == 0 && companys == 0 && start == -1 && end == -1){
				return;
			}

			int[][][] paths = new int[companys][stations][stations];
			for (int i = 0; i < companys; i++) {
				for (int j = 0; j < stations; j++) {
					for (int k = 0; k < stations; k++) {
						paths[i][j][k] = -1;
					}
				}
			}
			for (int m = 0; m < def_paths; m++) {
				int xm = sc.nextInt() - 1;
				int ym = sc.nextInt() - 1;
				int dm = sc.nextInt();
				int cm = sc.nextInt() - 1;

				if (paths[cm][xm][ym] == -1 || paths[cm][xm][ym] > dm) {
					paths[cm][xm][ym] = dm;
					paths[cm][ym][xm] = dm;
					for (int i = 0; i < stations; i++) {
						if (paths[cm][ym][i] != -1) {
							if (paths[cm][xm][i] == -1
									|| paths[cm][xm][i] > (paths[cm][xm][ym] + paths[cm][ym][i])) {
								paths[cm][xm][i] = paths[cm][xm][ym]
										+ paths[cm][ym][i];
							}
						}
					}
					for (int i = 0; i < stations; i++) {
						if (paths[cm][i][xm] != -1) {
							if (paths[cm][i][ym] == -1
									|| paths[cm][i][ym] > (paths[cm][i][xm] + paths[cm][xm][ym])) {
								paths[cm][i][ym] = paths[cm][i][xm]
										+ paths[cm][xm][ym];
							}
						}
					}
				}
			}

			int prices[][][] = new int[companys][][];
			for (int c = 0; c < companys; c++) {
				prices[c] = new int[sc.nextInt()][2];
			}
			for (int c = 0; c < companys; c++) {
				for (int k = 1; k < prices[c].length; k++) {
					prices[c][k][0] = sc.nextInt();
				}
				for (int k = 0; k < prices[c].length; k++) {
					prices[c][k][1] = sc.nextInt();
				}
			}

			int[][] adj = new int[stations][stations];
			for (int i = 0; i < stations; i++) {
				for (int j = 0; j < stations; j++) {
					int min_cost = Integer.MAX_VALUE;

					for (int c = 0; c < companys; c++) {
						if (paths[c][i][j] != -1) {
							int cost = 0;
							int dist = 0;
							for (int k = 0;;) {
								if (dist >= paths[c][i][j]) {
									break;
								} else if ((k + 1) < prices[c].length
										&& dist >= prices[c][k + 1][0]) {
									k++;
								}

								dist++;
								cost += prices[c][k][1];
								//System.out.println(c + " -> "  + i + " to "+ j + " >>> " + k + ", " + dist + ", " + cost);
							}

							if (min_cost > cost) {
								min_cost = cost;
							}

						}
					}

					adj[i][j] = min_cost;
				}
			}

			boolean[] visited = new boolean[stations];
			int[] costs = new int[stations];
			for (int i = 0; i < stations; i++) {
				costs[i] = Integer.MAX_VALUE;
			}
			costs[start] = 0;
			while (true) {
				int min_node = Integer.MAX_VALUE;
				int min_cost = Integer.MAX_VALUE;

				for (int i = 0; i < stations; i++) {
					if (!visited[i] && min_cost > costs[i]) {
						min_cost = costs[i];
						min_node = i;
					}
				}

				if (min_cost == Integer.MAX_VALUE) {
					break;
				}
				visited[min_node] = true;

				for (int i = 0; i < stations; i++) {
					if (!visited[i] && adj[min_node][i] != Integer.MAX_VALUE) {
						if (costs[i] > (adj[min_node][i] + min_cost)) {
							costs[i] = adj[min_node][i] + min_cost;
						}
					}
				}
			}

			if (costs[end] != Integer.MAX_VALUE) {
				System.out.println(costs[end]);
			} else {
				System.out.println(-1);
			}
		}
	}
}