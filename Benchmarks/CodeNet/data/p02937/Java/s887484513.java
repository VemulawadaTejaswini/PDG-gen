import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();

		// 最大値を超えるような条件は与えられない
//		double max = Math.pow(10, 100);

		char[] tChars = t.toCharArray();
		int lastIndex = -1;
		int tmpIndex = -1;
		int loopCnt = 0;
		boolean notExists = false;

		for (char c : tChars) {
			// 続きから後ろを確認
			tmpIndex = s.indexOf(c, lastIndex + 1);
			if (tmpIndex == -1) {
				// 見つからなければ、次週に
				loopCnt++;
//				if (loopCnt >= max) {
//					break;
//				}

				lastIndex = s.indexOf(c);
//				tmpS = s.substring(0, lastIndex + 1);
//				lastIndex = tmpS.indexOf(c);
				// 前から探しても見つからなければ、その文字は無いため終了
				if (lastIndex == -1) {
					notExists = true;
					break;
				}
			}
			else {
				lastIndex = tmpIndex;
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
