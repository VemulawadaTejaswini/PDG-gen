import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	class Panel {
		int c = 0;
		char[] b = new char[8];
		Panel(){};
		Panel(char[] b, int c) {
			for (int i = 0; i < 8; i++)
				this.b[i] = b[i];
			this.c = c;
		}
	}
	String ans = "01234567";
	
	boolean search(String[] map, int point, String b) {
		for (int i = 0; i < point; i++)
			if (map[i].equals(b)) return false;
		return true;
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String[] map = new String[40320];
			int point = 0;
			Panel panel = new Panel();
			for (int i = 0; i < 8; i++)
				panel.b[i] = scan.next().charAt(0);
			
			Queue<Panel> que = new LinkedList<Panel>();
			que.add(panel);
			map[point] = String.valueOf(panel.b);
			point++;
			while (!que.isEmpty()) {
				Panel p = que.poll();
				String b = String.valueOf(p.b);
				int index = b.indexOf("0");
				if (b.equals(ans)) {
					System.out.println(p.c);
					break;
				}
				if (index != 0 && index != 4) {
					char[] board = b.toCharArray();
					char tmp = board[index];
					board[index] = board[index - 1];
					board[index - 1] = tmp;
					String _b = String.valueOf(board);
					if (search(map, point, _b)) {
						map[point] = _b;
						point++;
						que.add(new Panel(board, p.c + 1));
					}
				}
				if (index != 3 && index != 7) {
					char[] board = b.toCharArray();
					char tmp = board[index];
					board[index] = board[index + 1];
					board[index + 1] = tmp;
					String _b = String.valueOf(board);
					if (search(map, point, _b)) {
						map[point] = _b;
						point++;
						que.add(new Panel(board, p.c + 1));
					}
				}
				if (index < 4) {
					char[] board = b.toCharArray();
					char tmp = board[index];
					board[index] = board[index + 4];
					board[index + 4] = tmp;
					String _b = String.valueOf(board);
					if (search(map, point, _b)) {
						map[point] = _b;
						point++;
						que.add(new Panel(board, p.c + 1));
					}
				}
				if (index > 3) {
					char[] board = b.toCharArray();
					char tmp = board[index];
					board[index] = board[index - 4];
					board[index - 4] = tmp;
					String _b = String.valueOf(board);
					if (search(map, point, _b)) {
						map[point] = _b;
						point++;
						que.add(new Panel(board, p.c + 1));
					}
				}
			}
		}
	}
	public static void main (String[] args) {
		new Main().run();
	}
}