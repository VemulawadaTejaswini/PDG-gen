import java.util.Scanner;

public class Main {
	private Scanner sc;

	private int[][] pathv;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());
			if (n == 0) break;
			
			int m = Integer.parseInt(sc.nextLine());

			int[][] path = new int[m][4];

			pathv = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					pathv[i][j] = 0;
				}
			}
			
			for (int i = 0; i < path.length; i++) {
				String[] nico = sc.nextLine().split(",");

				for (int j = 0; j < 3; j++) {
					path[i][j] = Integer.parseInt(nico[j]);
				}
				path[i][2] = path[i][2] / 100 - 1;
				path[i][3] = 0;
				
				pathv[path[i][0]][path[i][1]] = path[i][2];				
				pathv[path[i][1]][path[i][0]] = path[i][2];
			}
			
			
			boolean[] flag = new boolean[n];
			for (int i = 0; i < flag.length; i++) {
				flag[i] = false;
			}
			flag[path[0][0]] = true;
			flag[path[0][1]] = true;

			int total = path[0][2];
			
			int marked = 2;
			while (marked != n) {
				for (int i = 1; i < path.length; i++) {
					if (flag[path[i][0]] != flag[path[i][1]]) {
						flag[path[i][0]] = true;
						flag[path[i][1]] = true;
						total = total + path[i][2];
						path[i][3] = 1;
						
						marked++;
					}
				}
			}
			
			for (int i = 1; i < path.length; i++) {
				if (path[i][3] == 0) {
					int max = path[i][2];
					
					for (int j = 0; j < n; j++) {
						if ((max < pathv[path[i][0]][j]) && (check(j) >= 2)) max = pathv[path[i][0]][j];
						if ((max < pathv[path[i][1]][j]) && (check(j) >= 2)) max = pathv[path[i][1]][j];
					}
					
					total = total + path[i][2] - max;
					path[i][3] = 1;
				}
			}
			
			System.out.println(total);
		}
	}
	
	private int check(int index) {
		int ans = 0;
		for (int i = 0; i < pathv.length; i++) {
			if (pathv[index][i] != 0) ans++;
		}
		
		return ans;
	}
}