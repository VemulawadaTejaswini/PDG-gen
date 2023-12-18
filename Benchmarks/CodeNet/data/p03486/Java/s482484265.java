import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();

		int loopCount = Math.min(s1.length(), s2.length());

		String[] os1 = stringSort(s1);
		String[] os2 = stringRevSort(s2);
		String res = "No";

		System.out.println(String.join("", os1));
		System.out.println(String.join("", os2));

		if (String.join("", os1).equals(String.join("", os2))) {
			res = "No";
		} else {
			for (int i = 0; i < loopCount; i++) {
				System.out.println("i:"+i);
				if (os1[i].compareTo(os2[i]) < 0) {
					res = "Yes";
					break;
				} else if (os1[i].compareTo(os2[i]) == 0) {
					if (i == loopCount-1) {
						res = "Yes";
					}
					continue;
				} else {
					continue;
				}
			}
		}

		System.out.println(res);
		sc.close();
	}

	public static String[] stringSort(String inString) {

		String[] inStrings = inString.split("");
		String[] outStrings;

		Arrays.sort(inStrings, new Comparator<String>() {

			public int compare(String obj1, String obj2) {
				return obj1.compareTo(obj2);
			}
		});
		outStrings = inStrings;

		return outStrings;
	}

	public static String[] stringRevSort(String inString) {

		String[] inStrings = inString.split("");
		String[] outStrings;

		Arrays.sort(inStrings, new Comparator<String>() {

			public int compare(String obj1, String obj2) {
				return obj2.compareTo(obj1);
			}
		});
		outStrings = inStrings;

		return outStrings;
	}
}
