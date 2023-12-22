import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	point = 0;

		while ((point = parseNum()) != 0) {
			int[][]	map     = new int[point][point];
			int		route   = parseNum();
			for (int i = 0; i < point; i++) {
				for (int j = 0; j < point; j++) {
					map[i][j] = -1;
				}
			}

			for (int n = 0; n < route; n++) {
				int[]	dist = parseDist();
				map[dist[0]][dist[1]] = dist[2];
				map[dist[1]][dist[0]] = dist[2];
			}

			System.out.println(dijkstra(0, map));
		}
	}

	private static int dijkstra(int start, int[][] map) {
		int			res  = 0;
		int[]		cost = new int[map.length];
		boolean[]	used = new boolean[map.length];

		for (int n = 0; n < map.length; n++) {
			cost[n] = Integer.MAX_VALUE;
		}
		cost[start] = 0;

		while(true) {
			int	cur = -1;
			for (int n = 0; n < map.length; n++) {
				if (!used[n] && (cur == -1 || cost[n] < cost[cur])) {
					cur = n;
				}
			}

			if (cur == -1) {
				break;
			}
			used[cur]  = true;
			res       += cost[cur];

			for (int n = 0; n < map.length; n++) {
				if (map[n][cur] != -1) {
					cost[n] = Math.min(cost[n], map[n][cur]);
				}
			}
		}

		return res;
	}

	private static int[] parseDist() {
		int[]	dist  = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	split = strIn.split(",");
			dist    = new int[3];
			dist[0] = Integer.parseInt(split[0]); 
			dist[1] = Integer.parseInt(split[1]); 
			dist[2] = Integer.parseInt(split[2]) / 100 - 1; 
		}
		
		return dist;
	}

	private static int parseNum() {
		int		num   = 0;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			num = Integer.parseInt(strIn); 
		}
		
		return num;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}