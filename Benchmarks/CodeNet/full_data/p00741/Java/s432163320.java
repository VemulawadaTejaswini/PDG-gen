import java.io.IOException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int w = nextInt();
			if (w == 0) {
				break;
			}

			int h = nextInt();
			int[][] map = new int[h][w];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = nextInt();
				}
			}

			int island = 0;
			Stack<Integer[]> stack = new Stack<Integer[]>();
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j] == 1) {
						island++;
						Integer[] land = { i, j };
						stack.push(land);
						map[i][j] = 0;
						while (stack.size() > 0) {
							Integer[] pop = stack.pop();
							for (int k = -1; k <= 1; k++) {
								for (int l = -1; l <= 1; l++) {
									if (pop[0] + k >= 0
											&& pop[0] + k < map.length
											&& pop[1] + l >= 0
											&& pop[1] + l < map[0].length
											&& map[pop[0] + k][pop[1] + l] == 1) {
										Integer[] push = { pop[0] + k,
												pop[1] + l };
										stack.push(push);
										map[pop[0] + k][pop[1] + l] = 0;
									}
								}
							}
						}
					}
				}
			}
			System.out.println(island);
		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}