import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		int sNumber = s.length();
		int tNumber = t.length();

		List<String> sList = new ArrayList<>();
		List<String> tList = new ArrayList<>();

		String[] sAllay = s.split("");
		String[] tAllay = t.split("");
		for (String ss : sAllay) {
			sList.add(ss);
		}
		for (String tt : tAllay) {
			tList.add(tt);
		}

		Collections.sort(sList);
		Collections.sort(tList, Collections.reverseOrder());
		String yn = null;
		int index = 0;
		int difference = sNumber - tNumber;
		if (difference < 0) {
			index = sNumber - 1;
			yn = "YES";

		} else if (difference >= 0) {
			index = tNumber - 1;
			yn = "NO";
		}

		for (int index1 = 1; index1 <= index; index1++) {
			for (int index2 = 1; index2 <= index; index2++) {
				if (index1 == index2) {
					String x = sList.get(index1);
					String y = tList.get(index2);
					int n = x.compareTo(y);
					if (n == 0) {
						break;
					} else if (n > 0) {
						System.out.println("NO");
						return;
					} else if (n < 0) {
						System.out.println("YES");
						return;
					}
				}
			}
		}
		System.out.println(yn);
	}
}