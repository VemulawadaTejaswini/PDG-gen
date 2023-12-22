import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int h = Integer.parseInt(input[0]), w = Integer.parseInt(input[1]), k = Integer.parseInt(input[2]);
		input = reader.readLine().split(" ");
		int x1 = Integer.parseInt(input[0]) - 1, y1 = Integer.parseInt(input[1]) - 1, x2 = Integer.parseInt(input[2]) - 1, y2 = Integer.parseInt(input[3]) - 1;
		char[][] arr = new char[h][];
		for(int i = 0; i < h; i++) {
			arr[i] = reader.readLine().toCharArray();
		}
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		PriorityQueue<Move> pq = new PriorityQueue<Move>((A, B) -> A.moves - B.moves);
		pq.add(new Move(-1, 0, x1, y1));
		int[][] visited = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		int ans = Integer.MAX_VALUE;
//		System.out.println(x1 + " " + x2);
		while(pq.size() > 0) {
			Move curr = pq.remove();
			if(curr.x == x2 && curr.y == y2) {
				ans = Math.min(curr.moves, ans);
				break;
			}
			for(int i = 0; i < 4; i++) {
				if(curr.dir == i) {
					continue;
				}
				int temp = 1;
				for(int j = 1; ; j++) {
					int X = curr.x + dx[i] * j, Y = curr.y + dy[i] * j;
					if(X < 0 || X >= h || Y < 0 || Y >= w || (visited[X][Y] <= curr.moves + temp) || arr[X][Y] == '@') {
						break;
					}
					pq.add(new Move(i, curr.moves + temp, X, Y));
					visited[X][Y] = curr.moves + temp;
					if(j % k == 0) {
						temp++;
					}
				}
			}
		}
		out.print(ans == Integer.MAX_VALUE ? -1 : ans);
		out.close();
	}

}

class Move {
	int dir, moves, x, y;
	Move(int d, int m, int a, int b) {
		dir = d;
		moves = m;
		x = a;
		y = b;
	}
}
