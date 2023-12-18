import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] set = {"dream",  "erase", "eraser", "dreamer" };
		String testStr = "";
		int current = 0;
		boolean isContinue = false;

		Scanner sc = new Scanner(System.in);
		testStr = sc.next();

		StringBuffer sb = new StringBuffer(testStr);
		testStr = sb.reverse().toString();

		while(true) {
			for(int i = 0; i < set.length ; i++) {
				StringBuffer setSb = new StringBuffer(set[i]);
				String setReverse = setSb.reverse().toString();

				if(!(testStr.length() < current + setReverse.length())) {
					String testPick = testStr.substring(current, current + setReverse.length());
					if(testPick.equals(setReverse)) {
						current += setReverse.length();
						isContinue = true;
						break;
					}
				} else {
					System.out.println("NO");
					return;
				}
			}
			if(current == testStr.length()) {
				System.out.println("YES");
				return;
			} else if(!isContinue) {
				System.out.println("NO");
				return;
			}
		}
	}
}