import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String divide[] = {"dream","dreamer","erase","eraser"};
		String S = sc.next();

		boolean dp[] = new boolean[100010];
		dp[0] = true;

		for (int i = 0; i < S.length(); i++) {
			if (!dp[i]) {
				continue;
			}

			for (int j = 0; j < divide.length; j++) {
				//うまく切れたら次に進む
				if (S.substring(i, S.length()).equals(divide[j])) {
					dp[i + divide[j].length()]  = true;
				}
			}
		}
		if (dp[S.length()]) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
