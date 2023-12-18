import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//参加人数
		int N = scanner.nextInt();
		//日数
		int D = scanner.nextInt();
		//チョコレートの残り
		int X = scanner.nextInt();

		//A_iをarrayに入力
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}

		//食べたチョコレートの合計sum
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int count = 0;
			//チョコレートを食べる日date
			List<Integer> date = new ArrayList<>();
			for (int j = 0; j < D; j++) {
				//j人目
				if (j * array[i] + 1 > D) {
					break;
				}
				date.add(j * array[i] + 1);
				//j人目の人がチョコレートを食べた日数の合計count
				count = date.size();
			}
			sum += count;
		}

		int chocolate = X + sum;
		System.out.println(chocolate);
	}

}