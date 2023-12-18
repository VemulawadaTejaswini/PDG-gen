
public class Main {

	public static void main(String[] args) throws Exception {

//		System.setIn(new FileInputStream("D:\\Workspace\\SW\\src\\b\\tt2"));
//		long start = System.currentTimeMillis();

		// strat
		// B - ID
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

//		int[][] arr = new int[2][M + 1];// 0 保存原值P，1保存原值Y， 2州内顺序
		int[][][] P = new int[2][N + 1][M + 1];
//		int[] arrO = new int[M + 1];

//		long start1 = System.currentTimeMillis();
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());

			int p = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			P[0][0][i] = p;
//			arr[1][i] = y;

			int order = 1;
			for (int j = 1; j <= P[0][p][0]; j++) {
				if (y < P[0][p][j]) {
					P[1][0][P[1][p][j]]++;
				} else {
					order++;
				}
			}

			P[1][0][i] = order;
			P[0][p][++P[0][p][0]] = y;
			P[1][p][P[0][p][0]] = i;

			/*
			 * for (int j = 1; j < i; j++) { if(p == arr[0][j]) { if(y < arr[1][j]) {
			 * arr[1][j]++; }else { order++; } } }
			 */
			P[1][0][i] = order;
		}
//		long end1 = System.currentTimeMillis();
//
//		long start2 = System.currentTimeMillis();
		for (int i = 1; i <= M; i++) {
			System.out.format("%06d%06d\n", P[0][0][i], P[1][0][i]);
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
