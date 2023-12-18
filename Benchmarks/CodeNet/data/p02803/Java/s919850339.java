import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] S = new char[H][W];
		for (int i=0;i<H;i++) {
			String tmp = sc.next();
			for (int j=0;j<W;j++) {
				S[i][j] = tmp.charAt(j);
			}
		}
		int ans = 0;

		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				int sh = i;
				int sw = j;
				int dist = 0;
				int[] first = {sh, sw, dist};
				boolean[][] visited = new boolean[H][W];
				ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
				queue.add(first);
				while (!queue.isEmpty()) {
					int[] rem = queue.poll();
					if (rem[0]<0 || H<=rem[0] || rem[1]<0 || W<=rem[1]) continue;
					if (S[rem[0]][rem[1]]=='#') continue;
					if (visited[rem[0]][rem[1]]) continue;
					visited[rem[0]][rem[1]] = true;
					ans = Math.max(ans, rem[2]);

					int[] add_1 = {rem[0]+1, rem[1], rem[2]+1};
					int[] add_2 = {rem[0]-1, rem[1], rem[2]+1};
					int[] add_3 = {rem[0], rem[1]+1, rem[2]+1};
					int[] add_4 = {rem[0], rem[1]-1, rem[2]+1};
					queue.add(add_1);
					queue.add(add_2);
					queue.add(add_3);
					queue.add(add_4);
				}
			}
		}

		System.out.println(ans);
	}
}