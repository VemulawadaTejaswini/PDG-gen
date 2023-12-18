import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final String S = s.nextLine();
			int aa = Integer.parseInt(S.substring(0, 2));
			int bb = Integer.parseInt(S.substring(2, 4));

			String ret;
			if (aa < 1 || bb < 1) {
				ret = "NA";
			} else if (aa > 12) {
				// YYbb
				if (bb > 12) {
					ret = "NA";
				} else {
					ret = "YYMM";
				}
			} else {
				// ??bb
				if (bb > 12) {
					ret = "MMYY";
				} else {
					ret = "AMBIGUOUS";
				}
			}
			System.out.println(ret);
		}
	}
}
