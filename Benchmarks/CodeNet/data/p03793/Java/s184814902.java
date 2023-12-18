import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	private static String[] a = {"aa", "b", "bb", "c", "cc", "d", "dd", "e", "ee", "f",
			"ff", "g", "gg", "h", "hh", "i", "ii", "j", "jj", "k", "kk", "l",
			"ll", "m", "mm", "n", "nn", "o", "oo", "p", "pp", "q", "qq", "r",
			"rr", "s", "ss", "t", "tt", "u", "uu", "v", "vv", "w", "ww", "x",
			"xx", "y", "yy", "z", "zz", "",};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			String tmp = s.substring(l - 1, r);
			while (changeI(tmp));
		}
	}
	private static boolean changeI(String chars) {
		String tmp = chars;
		for (int i = 0; i < 26; i++) {
			tmp.replace(a[0 + i * 2], a[1 + i * 2]);
		}
		if (chars.equals(tmp)) {
			if ("".equals(tmp)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			return false;
		}
		return true;
	}
}
