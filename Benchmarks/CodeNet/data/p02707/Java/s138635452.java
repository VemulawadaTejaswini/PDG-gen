import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int N = scan.nextInt();
		int[] A = new int[N - 1];

		for (int i = 0; i < N - 1; i++) {
			A[i] = scan.nextInt();
		}

		//WK変数
		SortedMap<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < N; i++) {
			map.put(i + 1, 0);
		}

		//演算
		for (int i = 0; i < N - 1; i++) {
			map.put(A[i], map.get(A[i]) + 1);
		}

		//結果出力
		for (int i = 0; i < N; i++) {
			System.out.println(map.get(i + 1));
		}
	}
}