import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0252/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aojxxxx/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			if (R == 0 && C == 0)
				break;
			int a[][] = new int[R][C];
			for (int r = 0; r < R; r++)
				for (int c = 0; c < C; c++)
					a[r][c] = sc.nextInt();

			int best = 0;
			for (int set = 0; set < (1 << R); set++) {
				int temp = 0;
				for (int c = 0; c < C; c++) {
					int b = 0;
					for (int r = 0; r < R; r++) {
						int flip = (set >> r) & 1;
						b += (a[r][c] == flip ? 0 : 1);
					}
					temp += max(b, R - b);
				}
				best = max(best, temp);
			}
			System.out.println(best);
		}
	}
}