import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> numList = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}

		int answer = 0;

		for(int i = 0; i < N; i++) {
			//各数字に対しての処理
			int judge = numList.get(i);
			int measure = 0;
			for(int j = 0; j < N; j++) {
				if(judge % numList.get(j) == 0) {
					measure++;
					//System.out.println("numList.get(j) = " + numList.get(j));
					//System.out.println("numList.get(i) = " + numList.get(i));
				}

			}
			//最後に計測して2回以上割れたらダメ
			if(measure == 1) {
				answer++;
				//System.out.println(judge);
			}

		}

		System.out.println(answer);
	}

}
