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
				leftCount += count;
				rightCount += s.length() - count;
				if (count == 0) {
					leftEnd = true;
				}
				if (count == s.length()) {
					rightEnd = true;
				}
			}
		}

		// 出力
		System.out.println(leftEnd && rightEnd && leftCount == rightCount || leftCount == 0 && rightCount == 0 ? "Yes" : "No");
		sc.close();
	}
}
