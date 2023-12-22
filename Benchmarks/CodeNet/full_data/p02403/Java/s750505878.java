import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			Main m = new Main();
			while (true) {
				int h = stdIn.nextInt();
				int w = stdIn.nextInt();
				if (h > 300 || w > 300) {
					throw new RuntimeException("Out of Range Error");
				}
				if (h == 0 && w == 0) {
					break;
				}
				m.setChar('#');
				m.DrawSquare(h, w);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private Character displayChar;
	/**
	 * Draw square by define character
	 * @param height Square of height
	 * @param width  Square of width
	 */
	protected void DrawSquare(int height, int width) {
		if (height < 0 || width < 0) {
			throw new RuntimeException("Error:Minus Value Input");
		}
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print(this.displayChar);
			}
			System.out.println("");
		}
		System.out.println("");
	}

	/**
	 * Define character to draw square
	 * @param displayChar Set a character
	 */
	protected void setChar(Character displayChar) {
		this.displayChar = displayChar;
	}
}