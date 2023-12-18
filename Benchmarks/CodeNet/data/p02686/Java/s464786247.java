import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();

		boolean leftEnd = false;
		boolean rightEnd = false;
		int leftCount = 0;
		int rightCount = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			while (s.contains("()")) {
				s = s.replace("()", "");
			}
			if (!s.equals("")) {
				int count = 0;
				while (count < s.length() && s.substring(count, count + 1).equals(")")) {
					count++;
				}
				int rightCloseCount = count;
				int leftCloseCount = s.length() - count;

				if (rightCloseCount == 0) {
					leftEnd = true;
				}
				if (leftCloseCount == 0) {
					rightEnd = true;
				}
				if (rightCloseCount < leftCloseCount) {
					leftCount += leftCloseCount - rightCloseCount;
				} else {
					rightCount += rightCloseCount - leftCloseCount;
				}
			}
		}

		// 出力
		System.out.println(leftEnd && rightEnd && leftCount == rightCount ? "Yes" : "No");
		sc.close();
	}
}
