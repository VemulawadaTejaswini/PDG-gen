import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	
	void run() {
		boolean[][] map = new boolean[5001][5001];
		int[] xs = new int[3001];
		int[] ys = new int[3001];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i <= 5000; i++)
				Arrays.fill(map[i], false);
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt(), y = sc.nextInt();
				map[x][y] = true;
				xs[i] = x;
				ys[i] = y;
			}
			
			int res = -1;
			for (int i = 0; i < n-1; i++) {
				for (int j = i+1; j < n; j++) {
					int dx = Math.abs(ys[i]-ys[j]), dy = Math.abs(xs[i]-xs[j]);
					if ((ys[i] >= ys[j]) == (xs[i] >= xs[j])) {
						if (0 <= xs[i]-dx && xs[i]-dx <= 5000 && 0 <= xs[j]-dx && xs[j]-dx <= 5000 &&
								0 <= ys[i]+dy && ys[i]+dy <= 5000 && 0 <= ys[j]+dy && ys[j]+dy <= 5000 &&
								map[xs[i]-dx][ys[i]+dy] && map[xs[j]-dx][ys[j]+dy]) {
							res = Math.max(res, (xs[i]-xs[j])*(xs[i]-xs[j])+(ys[i]-ys[j])*(ys[i]-ys[j]));
						} else if (0 <= xs[i]+dx && xs[i]+dx <= 5000 && 0 <= xs[j]+dx && xs[j]+dx <= 5000 &&
								0 <= ys[i]-dy && ys[i]-dy <= 5000 && 0 <= ys[j]-dy && ys[j]-dy <= 5000 &&
								map[xs[i]+dx][ys[i]-dy] && map[xs[j]+dx][ys[j]-dy]) {
							res = Math.max(res, (xs[i]-xs[j])*(xs[i]-xs[j])+(ys[i]-ys[j])*(ys[i]-ys[j]));
						}
					} else {
						if (0 <= xs[i]+dx && xs[i]+dx <= 5000 && 0 <= xs[j]+dx && xs[j]+dx <= 5000 &&
								0 <= ys[i]+dy && ys[i]+dy <= 5000 && 0 <= ys[j]+dy && ys[j]+dy <= 5000 &&
								map[xs[i]+dx][ys[i]+dy] && map[xs[j]+dx][ys[j]+dy]) {
							res = Math.max(res, (xs[i]-xs[j])*(xs[i]-xs[j])+(ys[i]-ys[j])*(ys[i]-ys[j]));
						} else if (0 <= xs[i]-dx && xs[i]-dx <= 5000 && 0 <= xs[j]-dx && xs[j]-dx <= 5000 &&
								0 <= ys[i]-dy && ys[i]-dy <= 5000 && 0 <= ys[j]-dy && ys[j]-dy <= 5000 &&
								map[xs[i]-dx][ys[i]-dy] && map[xs[j]-dx][ys[j]-dy]) {
							res = Math.max(res, (xs[i]-xs[j])*(xs[i]-xs[j])+(ys[i]-ys[j])*(ys[i]-ys[j]));
						}
					}
				}
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}