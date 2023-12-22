import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] terminal = {{0, 1, 2, 3}, {4, 5, 6, 7}};
		int[] dy = {0, -1, 0, 1};
		int[] dx = {-1, 0, 1, 0};
		
		while (in.hasNextInt()) {
			int[][] initial = new int[2][4];
			for (int y = 0; y < 2; y++) {
				for (int x = 0; x < 4; x++) {
					initial[y][x] = in.nextInt();
				}
			}
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(encode(initial), 0);
			ArrayDeque<int[][]> que = new ArrayDeque<int[][]>();
			que.add(initial);
			
			while (!map.containsKey(encode(terminal))) {
				int[][] arr = que.remove();
				int y0 = 0, x0 = 0;
				for (int y = 0; y < 2; y++) {
					for (int x = 0; x < 4; x++) {
						if (arr[y][x] == 0) {
							y0 = y;
							x0 = x;
						}
					}
				}
				for (int i = 0; i < 4; i++) {
					int _y = y0 + dy[i], _x = x0 + dx[i];
					if (_y < 0 || _y >= 2 || _x < 0 || _x >= 4) {
						continue;
					}
					int[][] _arr = new int[2][4];
					for (int y = 0; y < 2; y++) {
						for (int x = 0; x < 4; x++) {
							_arr[y][x] = arr[y][x];
						}
					}
					_arr[y0][x0] = arr[_y][_x];
					_arr[_y][_x] = arr[y0][x0];
					if (!map.containsKey(encode(_arr))) {
						map.put(encode(_arr), map.get(encode(arr)) + 1);
						que.add(_arr);
					}
				}
			}
			
			System.out.println(map.get(encode(terminal)));
		}
	}
	
	static int encode(int[][] arr) {
		int code = 0;
		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 4; x++) {
				code *= 8;
				code += arr[y][x];
			}
		}
		return code;
	}
}