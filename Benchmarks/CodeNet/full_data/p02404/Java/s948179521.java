import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 || w == 0) {
				sc.close();
				break;
			}
			System.out.println(createFrame(h, w));
		}
	}

	static String createFrame(int h, int w) {
		StringBuilder sb = new StringBuilder();
		createLine(w, sb);
		createMiddle(h, w, sb);
		createLine(w, sb);
		return sb.toString();
	}

	static StringBuilder createLine(int w, StringBuilder sb) {
		for (int i = 0; i < w; i++) {
			sb.append('#');
		}
		sb.append("\n");
		return sb;
	}

	static StringBuilder createMiddle(int h, int w, StringBuilder sb) {

		for (int i = 0; i < h - 2; i++) {
			sb.append('#');
			for (int j = 0; j < w - 2; j++) {
				sb.append('.');
			}
			sb.append("#\n");
		}
		return sb;
	}
}