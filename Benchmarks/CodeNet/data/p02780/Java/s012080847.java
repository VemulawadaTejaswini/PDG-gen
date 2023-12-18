import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String[] s1 = reader.readLine().split(" ");
			int[] A = Stream.of(s1).mapToInt(Integer::parseInt).toArray();
			int N = A[0];
			int K = A[1];
			String[] s2 = reader.readLine().split(" ");
			int[] p = Stream.of(s2).mapToInt(Integer::parseInt).toArray();

			Queue<Integer> e = new PriorityQueue<Integer>(Collections.reverseOrder());
			for(int i=0; i<=N-K; i++) {
				int sum = 0;
				for(int j=0; j<K; j++) {
					sum += p[i+j];
				}
				e.add(sum);
			}

			double ans = (double)(e.peek() + K) / 2;
			System.out.println(String.format("%.7f", ans));
		}catch(IOException e) {

		}
	}

}

