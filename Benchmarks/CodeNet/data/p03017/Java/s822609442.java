import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int N, A, B, C, D;
	static char[] S;
	static boolean isCheck;

	static int[][] directions = { { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 }, { 2, 1 }, { 2, 2 } };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		A = Integer.parseInt(st.nextToken()) - 1;
		B = Integer.parseInt(st.nextToken()) - 1;
		C = Integer.parseInt(st.nextToken()) - 1;
		D = Integer.parseInt(st.nextToken()) - 1;
		S = br.readLine().toCharArray();

		PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0] + o2[1] - (o1[0] + o1[1]);
			}
		});

		queue.add(new int[] { A, B });
		WHILE: while (!queue.isEmpty()) {
			int[] temp = queue.poll();
			int newA = 0, newB = 0;
			for (int d = 0; d < directions.length; d++) {
				newA = temp[0] + directions[d][0];
				newB = temp[1] + directions[d][1];
				if (newA < N && newB < N && S[newA] == '.' && S[newB] == '.' && newA != newB
						&& !queue.contains(new int[] { newA, newB })) {
					queue.add(new int[] { newA, newB });
					if (newA == C && newB == D) {
						isCheck = true;
						break WHILE;
					}
				}
			}
		}

		if (isCheck) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
