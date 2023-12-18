import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		splitWord(0, S, "", 0);

		System.out.println(ans);
	}

	public static int ans = 0;

	public static void splitWord(int index, String str, String beforeStr, int count){
		if (index == str.length()) {
			if (ans < count) {
				ans = count;
			}
		}

		for (int i = 1; i < 3 && i < str.length() - index + 1; i++) {
			String splitword = str.substring(index, index + i);
			if (! beforeStr.equals(splitword)) {
				splitWord(index + i, str, splitword, count + 1);
			}
		}
	}
}