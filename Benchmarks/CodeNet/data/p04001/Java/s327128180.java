import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private long Sum = 0;

	public static void main(String[] args) {
		String S;//長さ1~10
		Scanner scanner = new Scanner(System.in);
		S = scanner.next();
		scanner.close();
		Main main = new Main();
		System.out.println(main.calc(S));
	}

	private long calc(String S) {
		int maxPlus = S.length() - 1;//数0~9

		for (int i = 0; i <= maxPlus; i++) {
			//'+' がi個入ってないといけない
			if (i == 0) {
				Sum += Long.parseLong(S);
				continue;
			}
			if (i == maxPlus) {
				for (char charactor : S.toCharArray()) {
					Sum += (charactor - '0');
				}
				continue;
			}
			func(S, i, new ArrayList<String>());

		}
		return Sum;
	}

	private void func(String S, int plusCount, ArrayList<String> list) {
		// 100 0 1

		if (S == null || S.length() <= plusCount) return;
		if (plusCount == 0) {
			if (S.length() != 0) {
				list.add(S);
				long sum = 0;
				for (String str : list) {
					sum += Long.parseLong(str);
				}
				Sum += sum;
			}
		} else {
			for (int i = 1; i < S.length(); i++) {
				ArrayList<String> templist = (ArrayList<String>) list.clone();
				templist.add(S.substring(0, i));
				func(S.substring(i), plusCount - 1, templist);
			}
		}
	}
}
