import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int K = sc.nextInt();

		System.out.println(solve(s, K));
	}

	public static String solve(String s, int K) {

		StringBuilder builder = new StringBuilder(s);

		char[] chars = s.toCharArray();
		int lastIndex = -1;
		int length = s.length();
		for(char i=0; i<length; i++) {
			char c = builder.charAt(i);
			int count = chage2a(c, K);
			if(count > 0) {
				builder.setCharAt(i, 'a');
				K -= count;
			}
			else {
				lastIndex = i;
			}
		}

		if(K > 0 && lastIndex > 0) {
			char c = (char)(builder.charAt(lastIndex) + K);
			builder.setCharAt(lastIndex, c);
		}

		return builder.toString();
	}

	public static int chage2a(char c, int count) {
		// 文字cをaにするために必要な回数
		int needCount = ('z' - c) + 1;

		if(count >= needCount) {
			return needCount;
		}
		else {
			return -1;
		}
	}
}