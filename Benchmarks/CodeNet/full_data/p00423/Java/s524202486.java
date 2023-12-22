import java.util.Scanner;

public class Game {
	private int a = 0;
	private int b = 0;
	
	void play(int _a, int _b) {
		if (_a < _b) {
			b += _a + _b;
		} else if (_a > _b) {
			a += _a + _b;
		} else {
			a += _a;
			b += _b;
		}
	}

	void printPoint() {
		System.out.println(a + " " + b);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int data, a, b;
		data = a = b = 0;
		while (true) {
			Game game = new Game();
			try {
				data = stdin.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				data = 0;
			}
			if (data == 0)
				break;
			
			for (int i = 0; i < data; ++i) {
				try {
					a = stdin.nextInt();
					b = stdin.nextInt();
				} catch (Exception e) {
					e.printStackTrace();
				}
				game.play(a, b);
			}
			game.printPoint();
		}
		stdin.close();
	}
}