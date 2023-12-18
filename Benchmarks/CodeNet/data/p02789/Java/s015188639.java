package AtCoderBeginnerContest152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int testCase,clearedTestCase;

		testCase=sc.nextInt();
		clearedTestCase=sc.nextInt();

		if(testCase==clearedTestCase) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}

}
