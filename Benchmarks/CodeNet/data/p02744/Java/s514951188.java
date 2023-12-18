import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static int N;
	static Set<String> list = new TreeSet<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();

		String str = "a"; // 最初がaは確定

		for (int i = 0; i <= N - 1; i++) {
			appendNum(str, true);
			appendNum(str, false);
		}

		for (String s : list) {
			System.out.println(s);
		}
	}

	public static void appendNum(String str, boolean isEqual) {
		if (str.length() == N) {
			list.add(str);
			return;
		}
		String s = str;
		if (isEqual) {
			s += "a";
			appendNum(s, true);
			appendNum(s, false);
		} else {
			char last = str.charAt(str.length() - 1);
			char next = (char) (last + 1);
			s += next;
			appendNum(s, true);
			appendNum(s, false);
		}
	}
}
