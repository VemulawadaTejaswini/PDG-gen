import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	final static String END_SIGN = "-";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> resultList = new ArrayList<String>();

		String str;
		while (EndDecision(str = sc.nextLine())) {

			int shuffleCount = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < shuffleCount; i++) {
				str = Shuffle(str, Integer.parseInt(sc.nextLine()));
			}
			resultList.add(str);
		}

		for (String s : resultList) {
			System.out.println(s);
		}

	}

	static String Shuffle(String str, int num) {
		String result = str.substring(num);
		result += str.substring(0, num);
		return result;
	}

	// 終了判定
	public static boolean EndDecision(String array) {
		if (array.equals(END_SIGN)) {
			return false;
		} else {
			return true;
		}

	}

}

