import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int max = 0;
			int start = 0;
			String sa = in.next();
			String sb = in.next();
			StringBuilder sbb = new StringBuilder();
			int s = sa.length() + sb.length() - 1;
			for (int i = 0; i < s; i++) {
				if (max > sa.length() - start) {
					break;
				}
				if (i < sb.length()) {
					sbb.insert(0, sb.charAt(sb.length() - i - 1));
				} else {
					sbb.insert(0, ' ');
					start++;
				}
				if (i >= sa.length()) {
					sbb.setLength(sbb.length() - 1);
				}
				int count = 0;
				for (int posi = start; posi < sbb.length(); posi++) {
					if (sa.charAt(posi) == sbb.charAt(posi)) {
						count++;
					} else if (count != 0 || posi == sbb.length() - 1) {
						max = Math.max(count, max);
						count = 0;
					}
				}
			}
			System.out.println(max);
		}
		in.close();
	}
}