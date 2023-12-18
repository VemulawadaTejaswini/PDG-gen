import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		int len = t.length();
		int max = 1000;

		int[] indexArray = new int[len];
		for (int i = 0; i < len; i++) {
			indexArray[i] = -1;
		}

		String tmpS = "";
		char[] tChars = t.toCharArray();
		int lastIndex = -1;
		int tmpIndex = -1;
		int loopCnt = 0;
		int ans = -1;
		int cnt = 0;

		for (char c : tChars) {
			tmpIndex = s.indexOf(c, lastIndex + 1);
			if (tmpIndex == -1) {
				loopCnt++;
				if (loopCnt > max) {
					break;
				}
				tmpS = s.substring(0, lastIndex + 1);
				lastIndex = tmpS.indexOf(c);
				if (lastIndex == -1) {
					break;
				}
			}
			else {
				lastIndex = tmpIndex;
			}
			cnt++;
			if (cnt == len) {
				ans = (s.length() * loopCnt) + lastIndex + 1;
			}
		}
		System.out.println(ans);
	}
}
