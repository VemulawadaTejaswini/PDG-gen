import java.util.Scanner;
/**
 *
 * https://atcoder.jp/contests/abc158/tasks/abc158_b
 * @author shouma
 *
 */

public class Main {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] stries = str.split(" ");
		int[] ballNum = new int[stries.length];
		for(int i = 0;i < stries.length;i++) {
			ballNum[i] = Integer.parseInt(stries[i]);
		}
		//全体のボールの個数
			if(ballNum[1] != 0) {
				//個数が求められたら、プリントアウト
				System.out.println(count(ballNum));
			}else{
				//0ならプリントアウト
				System.out.println(ballNum[1]);
			}
        scan.close();
	}

	public static int count(int[] ballNum) {
		int answer = 0;
		int allBall = ballNum[0];
		int blueBall = ballNum[1];
		int redBall = ballNum[2];

		if(allBall != blueBall + redBall) {
			int aaa = 0;
			aaa = allBall - (blueBall + redBall);
//			System.out.println(aaa);
			if(aaa == 0) {
				answer = blueBall;
//				System.out.println(answer);
			}else {
				answer = blueBall + aaa;
//				System.out.println(+ answer);
			}
		}else{
			answer = blueBall;
		}
		return answer;
	}
}
