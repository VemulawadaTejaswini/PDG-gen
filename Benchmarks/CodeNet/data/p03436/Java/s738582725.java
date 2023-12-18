import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();//height
		int w = sc.nextInt();//width
		char[][] path = new char[h][w];
		for (int i = 0; i < h; i++) {
			path[i] = sc.next().toCharArray();/// .  #
		}
		int cntBlack = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (path[i][j] == '#') {
					cntBlack++;
				}
			}
		}
		Set<Integer> seen = new HashSet<>();
		Deque<Integer> check = new ArrayDeque<>();
		Deque<Integer> cnt = new ArrayDeque<Integer>();
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		check.addLast(0);
		cnt.addLast(0);
		int tmpp = 0, tmpc = 0;
		while (tmpp != h * w - 1 && !check.isEmpty()) {
			tmpp = check.removeFirst();
			tmpc = cnt.removeFirst();
			seen.add(tmpp);
			for (int i = 0; i < 4; i++) {
				int nx = tmpp / w + dx[i];
				int ny = tmpp % w + dy[i];
				if (0 <= nx && nx < h && 0 <= ny && ny < w && path[nx][ny] != '#' && !check.contains(nx * w + ny)
						&& !seen.contains(nx * w + ny)) {
					check.addLast(nx * w + ny);
					cnt.addLast(tmpc + 1);
				}
			}
		}
		if (tmpp != h * w - 1) {
			System.out.println("-1");
		} else {
			System.out.println(h * w - cntBlack - tmpc - 1);
		}
	}

}
