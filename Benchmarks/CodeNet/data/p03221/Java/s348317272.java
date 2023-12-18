
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

//		System.setIn(new FileInputStream("D:\\Workspace\\SW\\src\\b\\tt"));
//		long start = System.currentTimeMillis();

		// strat
		// B - ID
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[2][M + 1];// 0 保存原值P，1保存原值Y， 2州内顺序
		int[][][] P = new int[2][N + 1][M + 1];
//		int[] arrO = new int[M + 1];

//		long start1 = System.currentTimeMillis();
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());

			int p = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[0][i] = p;
//			arr[1][i] = y;

			int order = 1;
			for (int j = 1; j <= P[0][p][0]; j++) {
				if (y < P[0][p][j]) {
					arr[1][P[1][p][j]]++;
				} else {
					order++;
				}
			}

			arr[1][i] = order;
			P[0][p][++P[0][p][0]] = y;
			P[1][p][P[0][p][0]] = i;

			/*
			 * for (int j = 1; j < i; j++) { if(p == arr[0][j]) { if(y < arr[1][j]) {
			 * arr[1][j]++; }else { order++; } } }
			 */
			arr[1][i] = order;
		}
//		long end1 = System.currentTimeMillis();
//
//		long start2 = System.currentTimeMillis();
		for (int i = 1; i <= M; i++) {
			System.out.format("%06d%06d\n", arr[0][i], arr[1][i]);
		}
//		long end2 = System.currentTimeMillis();
//
//		// end
//		long end = System.currentTimeMillis();
//		System.out.format("%.3f  ms", (end1 - start1) / 1000.0);
//		System.out.format("%.3f  ms", (end2 - start2) / 1000.0);
//		System.out.format("%.3f  ms", (end - start) / 1000.0);
	}

}
