import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
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

		for (int i = 0; i < N - 1; i++) {
			if (S[i] == '#' && S[i + 1] == '#') {
				bw.write("No");
				bw.flush();
				bw.close();
				return;
			}
		}

		Queue<int[]> queue = new LinkedList<>();

		queue.add(new int[] { A, B });
		WHILE: while (!queue.isEmpty()) {
			int[] temp = queue.poll();
			int newA = 0, newB = 0;
			for (int d = 0; d < directions.length; d++) {
				newA = temp[0] + directions[d][0];
				newB = temp[1] + directions[d][1];
				int[] newP = new int[] { newA, newB };
				if (newA < N && newB < N && S[newA] == '.' && S[newB] == '.' && newA != newB && !queue.contains(newP)) {
					queue.add(newP);
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
