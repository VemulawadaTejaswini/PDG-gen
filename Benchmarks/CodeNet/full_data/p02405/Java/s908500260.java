import java.util.Scanner;

public class Main {
	static final boolean SHARP = true;
	static final boolean DOT = false;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 || w == 0) {
				sc.close();
				break;
			}
			StringBuilder sb = new StringBuilder();
			boolean rowToggle = SHARP;
			for (int i = 0; i < h; i++) {
				boolean charToggle = rowToggle;
				for (int j = 0; j < w; j++) {
					char c = charToggle ? '#' : '.';
					sb.append(c);
					charToggle = charToggle ? DOT : SHARP;
				}
				sb.append("\n");
				rowToggle = rowToggle ? DOT : SHARP;
			}
			System.out.println(sb);
		}
	}
}