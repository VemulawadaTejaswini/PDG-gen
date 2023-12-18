import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int N = 0;
	private static int M = 0;
	private static int[][] abArray;
	private static Boolean[] flagArray;
	private static int count = 0;

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			N = Integer.parseInt(sc.next());
			M = Integer.parseInt(sc.next());
			sc.nextLine();
			abArray = new int[M][2];
			flagArray = new Boolean[N];

			for (int i = 0; i < N; i++) {
				abArray[i][0] = Integer.parseInt(sc.next());
				abArray[i][1] = Integer.parseInt(sc.next());
				//sc.nextLine();
				flagArray[i] = false;
			}
			exe(1);
			System.out.println(count);
		}
	}

	private static void exe(int now) {
		// nowは探索済み
		flagArray[now -1] = true;
		
		for (int i = 0; i < M; i++) {
			//toがnowでfrom値が探索済みでない
			if (abArray[i][0] == now && !flagArray[abArray[i][1] - 1]) {
				// fromへ飛ぶ
				exe(abArray[i][1]);
				//fromがnowでto値が探索済みでない
			} else if (abArray[i][1] == now && !flagArray[abArray[i][0] - 1]) {
				// toへ飛ぶ
				exe(abArray[i][0]);
			}
		}
		
		// 全て探索済みか？
		if(!Arrays.asList(flagArray).contains(false)) {
			count++;
		}
		// 探索済みでなくす
		flagArray[now -1] = false;
	}

}
