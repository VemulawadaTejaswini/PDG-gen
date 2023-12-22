import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void solve (int[] []map, int y, int x, int depth) {
		int[] moveX = {0,0,0,0,0,0,-1,-2,-3,1,2,3};
		int[] moveY = {-1,-2,-3,1,2,3,0,0,0,0,0,0};

		for (int i = 0; i < moveX.length; i++) {
			int nx = x + moveX[i];
			int ny = y + moveY[i];
			if (nx < 0 || nx >= map.length ||
					ny < 0 || ny >= map[0].length || map[ny][nx] == 0) continue;
			map[ny][nx] = 0;
			solve(map, ny, nx, depth + 1);
		}

		if (depth == 0) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++)
					System.out.print(map[i][j]);
				System.out.println();
			}
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		br.readLine();

		for (int i = 0; i < n; i++) {
			int[][] map = new int[8][8];
			for (int j = 0; j < map.length; j++) {
				char[] c = br.readLine().toCharArray();
				for (int k = 0; k < c.length; k++)
					map[j][k] = c[k] - '0';
			}
			int firstBombX = Integer.parseInt(br.readLine()) - 1;
			int firstBombY = Integer.parseInt(br.readLine()) - 1;
			System.out.println("Data " + (i + 1) + ":");
			solve(map, firstBombY, firstBombX, 0);
			if (i != n - 1) br.readLine();
		}

	}

}