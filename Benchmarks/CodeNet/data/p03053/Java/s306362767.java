import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] path = new char[h][w];
		for (int i = 0; i < h; i++) {
			path[i] = sc.next().toCharArray();
		}
		Deque<Integer> check = new ArrayDeque<Integer>(h*w/2);
		Deque<Integer> cnt = new ArrayDeque<Integer>(h*w/2);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (path[i][j] == '#') {
					check.addLast(i * w + j);
					cnt.addLast(0);
				}
			}
		}
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		int place = 0;
		int time = 0;
		while (!check.isEmpty()) {
			place = check.removeFirst();
			time = cnt.removeFirst();
			path[place / w][place % w] = '#';
		//	System.out.println(place / w + "," + place % w);
			for (int i = 0; i < 4; i++) {
				int nx = place / w + dx[i];
				int ny = place % w + dy[i];
				if (0 <= nx && nx < h && 0 <= ny && ny < w && path[nx][ny] == '.' && !check.contains(nx * w + ny)) {
					check.addLast(nx * w + ny);
					cnt.addLast(time + 1);
				}
			}
		}
		System.out.println(time);
	}
}
