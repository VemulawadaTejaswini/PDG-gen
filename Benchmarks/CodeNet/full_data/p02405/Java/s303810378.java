import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ChessBoard chess = new ChessBoard();
		try (Scanner stdin = new Scanner(System.in)) {
			int h, w;
			while (stdin.hasNext()) {
				h = Integer.parseInt(stdin.next());
				w = Integer.parseInt(stdin.next());
				if (h < 0 || h > 300 || w < 0 || w > 300) {
					throw new RuntimeException("Input Error:Range 0 to 300");
				}
				if (h == 0 && w == 0) {
					break;
				}
				chess.draw(h, w);
				System.out.println("");
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}

abstract class AbstractDiagram {
	abstract void draw(int height, int width);
}

class ChessBoard extends AbstractDiagram {
	@Override
	void draw(int h, int w) {
		StringBuilder sb = new StringBuilder();
		for (int r = 1; r <= h; r++) {
			for (int c = 1; c <= w; c++) {
				if ((r % 2 == 1 & c % 2 == 1) || (r % 2 == 0 & c % 2 == 0)) {
					sb.append('#');
				} else {
					sb.append('.');
				}
			}
			System.out.println(sb);
			sb.setLength(0); // sb clear
		}
	}
}