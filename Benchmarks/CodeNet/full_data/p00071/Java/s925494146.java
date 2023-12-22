import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			char[][] board = new char[8][8];
			for (int y = 0; y < 8; y++) {
				board[y] = sc.next().toCharArray();
			}
			
			int sx = sc.nextInt() - 1;
			int sy = sc.nextInt() - 1;
			
			bomb(board, sx, sy);
			
			out.println("Data " + (i + 1) + ":");
			for (int y = 0; y < 8; y++) {
				for (int x = 0; x < 8; x++) {
					out.print(board[y][x]);
				}
				out.println();
			}
		}
		out.flush();
	}
	
	static void bomb(char[][] board, int bx, int by) {
		if (board[by][bx] == '1') {
			board[by][bx] = '0';
			for (int x = Math.max(0, bx - 3); x <= Math.min(7, bx + 3); x++) {
				bomb(board, x, by);
			}
			for (int y = Math.max(0, by - 3); y <= Math.min(7, by + 3); y++) {
				bomb(board, bx, y);
			}
		}
	}
	
}