import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Diagram diagram = new Diagram();
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
				diagram.draw(h, w);
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

class Diagram extends AbstractDiagram {
	//
	@Override
	void draw(int h, int w) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if ((i == 1 || i == h) || (j == 1 || j == w)) {
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