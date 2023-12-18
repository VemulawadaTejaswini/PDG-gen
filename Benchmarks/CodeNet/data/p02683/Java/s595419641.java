
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();

		int[][] arrayAddedSkillBoard = new int[N][M+1];

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M+1; j++) {
				arrayAddedSkillBoard[i][j] = sc.nextInt();
			}
		}

		int answerCost = -1;

		for(int i = 0; i < Math.pow(2, N);i++) {
			//格納用配列作成
			int[] answer = new int[M+1];
			for(int t = 0; t < M+1; t++) {
				answer[t] = 0;
			}

//			System.out.println(Integer.toBinaryString(i));

			//bit変換
			int bit = Integer.parseInt(Integer.toBinaryString(i));



			//N種類試していく
			for(int j = 0; j < N; j++ ) {
				int bbb = bit>>j & 1;
				if(bbb == 1) {
					//買う場合
					for(int k = 0; k < M+1; k++) {
						answer[k] += arrayAddedSkillBoard[j][k];
					}
				}else {
					//何もしない
				}

			}

/*
			String S = "";
			for(int oo = 0; oo < answer.length; oo++) {
				S += answer[oo];
				S += " ";
			}
			System.out.println(S);
*/

			boolean judge = true;
			//試し終わった後に判定
			for(int m = 1; m < answer.length; m++) {
//				System.out.println("M = " + m);
				if(answer[m] >= X && judge) {
					//Xを満たす場合trueのまま
				}else {
					//一回でも外れたらfalse
					judge = false;
				}
			}
//			System.out.println(judge);
			if(judge) {
				if(answerCost == -1) {
					answerCost = answer[0];
				}else {
					if(answerCost >= answer[0]) {
						answerCost = answer[0];
					}
				}
			}

		}

		System.out.println(answerCost);
	}

}
