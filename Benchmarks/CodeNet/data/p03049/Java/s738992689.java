import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 空振り用
		sc.nextLine();
		int abCount = 0;
		int startWithBCount = 0;
		int endWithACount = 0;
		int btoaCount = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			if (str.charAt(0) == 'B') {
				startWithBCount++;
				if (str.endsWith("A")) {
					btoaCount++;
				}
			}
			if (str.endsWith("A")) {
				endWithACount++;
			}
			int initLength = str.length();
			String trimStr = str.replaceAll("AB", "");
			abCount += (initLength - trimStr.length()) / 2;
		}
		sc.close();
		int ba = Math.min(startWithBCount, endWithACount);
		int baMax = Math.max(startWithBCount, endWithACount);
		if (btoaCount == baMax) {
			ba--;
		}
		System.out.println(abCount + ba);
	}
}
