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
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			if (str.charAt(0) == 'B') {
				startWithBCount++;
			}
			if (str.endsWith("A")) {
				endWithACount++;
			}
			int initLength = str.length();
			String trimStr = str.replaceAll("AB", "");
			abCount += (initLength - trimStr.length()) / 2;
		}
		sc.close();
		int ba;
		if(startWithBCount == endWithACount) {
			ba = Math.min(startWithBCount, endWithACount) -1;
		}else {
			ba = Math.min(startWithBCount, endWithACount);
		}
		System.out.println(abCount + ba);
	}
}