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
			String zAfter = s.substring(zIndex);
			String[] zAfterArr = zAfter.split("");
			String tmp = "";
			outside: for (int i = 0; i < zAfterArr.length; i++) {
				if (zAfterArr[i].equals(reverseArr[i])) {
					tmp += zAfterArr[i];
				} else {
					for (int j = i; j < reverseArr.length; j++) {
						if (!zBefore.contains(reverseArr[j]) && !zAfter.equals(tmp + reverseArr[j])) {
							next = zBefore + tmp + reverseArr[j];
							break outside;
						}
					}
				}
			}
			if (next.length() == 0) {
				if (zBefore.length() == 0) {
					next = "-1";
				} else {
					String nextBefore = zBefore.substring(0, zBefore.length() - 1);
					String zBeforeLast = zBefore.substring(zBefore.length() - 1);

					for (int i = 0; i < indexArr.length; i++) {
						if (!nextBefore.contains(indexArr[i]) && indexArr[i].compareTo(zBeforeLast) > 0) {
							next = nextBefore + indexArr[i];
							break;
						}
					}
				}
			}
		}
		System.out.println(next);
	}

	private static String[] reverse(String[] array) {
		List<String> list = Arrays.asList(array.clone());
		Collections.reverse(list);
		return list.toArray(new String[list.size()]);
	}
}
