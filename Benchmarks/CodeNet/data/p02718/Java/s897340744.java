import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		double sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			sum += Ai;
			pq.add(Ai);
		}
		
		double threshold = sum / (4 * M);
		
		boolean result = true;
		for (int i = 0; i < M; i++) {
			if (pq.poll() < threshold) {
				result = false;
				break;
			}
		}
		// 結果の出力
		System.out.println(result?"Yes":"No");

		sc.close();
	}

}
