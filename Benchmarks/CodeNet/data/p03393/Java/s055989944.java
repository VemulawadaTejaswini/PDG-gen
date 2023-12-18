import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		String next = "";
		String index = "abcdefghijklmnopqrstuvwxyz";
		String[] indexArr = index.split("");
		if (s.length() < 26) {
			for (String i : indexArr) {
				if (!s.contains(i)) {
					next = s + i;
					break;
				}
			}
		} else {
			String[] reverseArr = reverse(indexArr);
			int zIndex = s.indexOf(reverseArr[0]);
			String zBefore = s.substring(0, zIndex);
			String[] zBeforeArr = zBefore.split("");
			String[] zAfterArr = s.substring(zIndex).split("");
			if (zBeforeArr.length == 0) {
				next = "-1";
			} else {
				String tmp = "";
				for (int i = 0; i < zAfterArr.length; i++) {
					if (zAfterArr[i].equals(reverseArr[i])) {
						tmp += zAfterArr[i];
					} else {
						next = zBefore + tmp + reverseArr[i];
						break;
					}
				}
				if (next.length() == 0) {
					String zBeforeLast = zBefore.substring(zBefore.length() - 1);
					int nextCharIndex = index.indexOf(zBeforeLast) + 1;
					String nextChar = index.substring(nextCharIndex, nextCharIndex + 1);
					next = zBefore.substring(0, zBefore.length() - 1) + nextChar;
				}
			}
		}
		System.out.println(next);
	}

	private static String[] reverse(String[] array) {
		List<String> list = Arrays.asList(array);
		Collections.reverse(list);
		return list.toArray(new String[list.size()]);
	}
}
