import java.util.*;

public class Main {
	public static void main(String[] a) {
		try (Scanner s = new Scanner(System.in)) {
			int sx = s.nextInt();
			int sy = s.nextInt();
			int tx = s.nextInt();
			int ty = s.nextInt();
			output(tx - sx, 'R');
			output(ty - sy, 'U');
			output(1, 'R');
			output(ty - sy + 1, 'D');
			output(tx - sx + 1, 'L');
			output(ty - sy + 1, 'U');
			output(tx - sx, 'R');
			output(1, 'U');
			output(tx - sx + 1, 'L');
			output(ty - sy + 1, 'D');
			output(1, 'R');
		}
	}

	static void output(int count, char c) {
		count = Math.abs(count);
		for (int i = 0; i < count; i++) {
			System.out.print(c);
		}
	}
}
