import java.util.Scanner;

public class Main {

	public static String solve (String[] str) {
		int baseX = 0, baseY = 0;
		main : for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == '1') {
					baseY = i;
					baseX = j;
					break main;
				}
			}
		}

		// 右にある？
		if (str[baseX + 1].charAt(baseY) == '1') {

			// 下にある？
			if (str[baseX].charAt(baseY + 1) == '1')
				return str[baseX + 1].charAt(baseY + 1) == '1' ? "A" : "G";
			else
				return str[baseX + 2].charAt(baseY + 1) == '1' ? "E" : "C";

		} else {

			if (str[baseX].charAt(baseY + 2) == '1')
				return "B";
			else
				return str[baseX + 1].charAt(baseY + 1) == '1' ? "F" : "D";

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String[] str = new String[10];
			for (int i = 0; i < str.length - 2; i++)
				str[i] = sc.nextLine() + "00";
			sc.nextLine(); // 空行
			System.out.println(solve(str));
		}

	}

}