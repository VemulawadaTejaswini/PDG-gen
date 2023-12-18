import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();

		List<String> lines1 = Arrays.asList(line1.split(" "));

		Integer sx = Integer.parseInt(lines1.get(0));
		Integer sy = Integer.parseInt(lines1.get(1));
		Integer tx = Integer.parseInt(lines1.get(2));
		Integer ty = Integer.parseInt(lines1.get(3));

		Integer x = getXY(sx, tx);
		Integer y = getXY(sy, ty);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < x; i++) {
			sb.append("R");
		}

		for (int i = 0; i < y; i++) {
			sb.append("U");
		}

		for (int i = 0; i < x; i++) {
			sb.append("L");
		}

		for (int i = 0; i < y; i++) {
			sb.append("D");
		}

		sb.append("D");

		for (int i = 0; i < x + 1; i++) {
			sb.append("R");
		}
		for (int i = 0; i < y + 1; i++) {
			sb.append("U");
		}
		sb.append("L");
		sb.append("U");

		for (int i = 0; i < x+1; i++) {
			sb.append("L");
		}

		for (int i = 0; i < y+1; i++) {
			sb.append("D");
		}

		sb.append("R");

		System.out.println(sb.toString());
	}

	public static int getXY(int s, int t) {
		int x = 0;

		if (s >= 0 && t >= 0) {
			x = t - s;
		} else if (s < 0 && t < 0) {
			x = (s - t) * -1;
		} else if (s < 0 && t >= 0) {
			x = t + (-1 * s);
		}
		return x;
	}

}