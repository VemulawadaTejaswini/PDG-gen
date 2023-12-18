import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] t = scan.nextLine().toCharArray();

		// 最大値を超えるような条件は与えられない
//		double max = Math.pow(10, 100);

		int lastIndex = -1;
		int loopCnt = 0;
		boolean notExists = false;

		for (char c : t) {
			// 続きから後ろを確認
			lastIndex = s.indexOf(c, lastIndex + 1);
			if (lastIndex == -1) {
				// 見つからなければ、次周に
				loopCnt++;
				lastIndex = s.indexOf(c);
				// 前から探しても見つからなければ、その文字は無いため終了
				if (lastIndex == -1) {
					notExists = true;
					break;
				}
			}
		}
		if (notExists) {
			System.out.println(-1);
		}
		else {
			System.out.println((s.length() * loopCnt) + lastIndex + 1);
		}
	}
}
