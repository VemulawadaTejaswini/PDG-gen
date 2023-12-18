import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int length = S.length();
		String Ssub = S.substring(2, length -2);
		int countC = countC(Ssub, 'C');

		String lower = S.replace("A", "").replace("C", "");

		String AC = "AC";
		String WA = "WA";

		if (S.startsWith("A")) {
			if (countC != 1) {
				System.out.println(WA);
				return;
			}

			if (lower.equals(lower.toLowerCase())) {
				System.out.println(AC);
			} else {
				System.out.println(WA);
			}
		} else {
			System.out.println(WA);
		}



	}

	public static int countC (String str, char target) {
		int count = 0;
		for(char x: str.toCharArray()) {
			if(x == target) {
				count++;
			}
		}

		return count;
	}
}
