
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

//		System.setIn(new FileInputStream("D:\\Workspace\\SW\\src\\c\\tt"));
//		long startTime = System.currentTimeMillis();
		// strat

		// C - 点蜡烛
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] xArr = new int[N + 1];

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= N; i++) {
			xArr[i] = Integer.parseInt(st.nextToken());
		}

		int minRoute = 0;

		for (int i = 1; i <= N - K + 1; i++) {

			int start = xArr[i];
			int end = xArr[i + K - 1];

			int route = 0;

			if (end <= 0) {
				route = -start;
			} else if (start >= 0) {
				route = end;

			} else {
				route = end - start + Math.min(end, -start);
			}

			if (minRoute > route || minRoute == 0) {
				minRoute = route;
			}

		}

		System.out.println(minRoute);

		// end
//		long endTime = System.currentTimeMillis();
//		System.out.format("%.3f  ms", (endTime - startTime) / 1000.0);
	}

}
