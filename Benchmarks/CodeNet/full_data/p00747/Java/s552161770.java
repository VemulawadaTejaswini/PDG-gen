import java.awt.Point;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kumar1
 *
 */
public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		InputStream in = System.in;
		Scanner scanner = new Scanner(in);
		LinkedList<Integer> ans = new LinkedList<Integer>();
		while(true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if(w == 0 && h == 0)
				break;
			ArrayList<ArrayList<Boolean> > board = new ArrayList<ArrayList<Boolean> >();
			//ArrayList<ArrayList<Boolean> > r_walls = new ArrayList<ArrayList<Boolean> >();
			//ArrayList<ArrayList<Boolean> > b_walls = new ArrayList<ArrayList<Boolean> >();
			ArrayList<Boolean> wallrow = new ArrayList<Boolean>();
			for(int i=0; i < w * 2 + 1; i++)
				wallrow.add(false);
			board.add(wallrow);
			for(int i=0; i < h; i++) {
				ArrayList<Boolean> row = new ArrayList<Boolean>();
				row.add(false);
				for(int j=0; j < w - 1; j++) {
					row.add(true);
					if(scanner.nextInt() == 0)
						row.add(true);
					else
						row.add(false);
				}
				row.add(true);
				row.add(false);
				board.add(row);
				if(i >= h - 1)
					break;
				row = new ArrayList<Boolean>();
				for(int j=0; j < w * 2 + 1; j++) {
					row.add(false);
				}
				for(int j=0; j < w; j++) {
					if(scanner.nextInt() == 0)
						row.set(1 + 2 * j, true);
				}
				board.add(row);
			}
			board.add(wallrow);
			// ここまで入力
			
			Point start = new Point(1, 1);
			Point goal = new Point(w * 2 - 1, h * 2 - 1);
			// 左, 右, 上, 下
			int[] dx = {-1, 1, 0, 0};
			int[] dy = {0, 0, -1, 1};
			int[][] fp = new int[board.size()][board.get(0).size()];
			fp[1][1] = 1;
			Deque<Point> deque = new LinkedList<Point>();
			deque.offer(start);
			while(true) {
				if(deque.isEmpty()) {
					ans.add(0);
					break;
				}
				Point crt = deque.poll();
				if(crt.equals(goal)) {
					ans.add(fp[goal.y][goal.x] / 2 + 1);
					break;
				}
				for(int i=0; i < 4; i++) {
					int nx = crt.x + dx[i];
					int ny = crt.y + dy[i];
					if(board.get(ny).get(nx) == true && fp[ny][nx] == 0) {
						deque.add(new Point(nx, ny));
						fp[ny][nx] = fp[crt.y][crt.x] + 1;
					}
				}
			}
			
		}
		scanner.close();
		
		for(Iterator<Integer> it = ans.iterator(); it.hasNext();)
			System.out.println(it.next());
	}

}