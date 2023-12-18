
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {

		//		solveA();
		//		solveB();
		//		solveC();
		//		solveC2();
		solveD();
		//		solveD2();
	}

	private static void solveA() {

		try (Scanner scanner = new Scanner(System.in)) {
			String numT = "";
			String numX = "";

			numT = scanner.next();
			numX = scanner.next();

			BigDecimal result = new BigDecimal(numT).divide(
					new BigDecimal(numX), 6, RoundingMode.HALF_UP);
			System.out.println(result.floatValue());

		}
	}

	private static void solveB() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = 0;
			numN = scanner.nextInt();
			int[] wkArray = new int[numN];
			for (int i = 0; i < numN; i++) {
				wkArray[i] = scanner.nextInt();
			}

			Arrays.sort(wkArray);

			int max = 0;
			int others = 0;
			for (int i = numN - 1; i >= 0; i--) {
				if (i == numN - 1) {
					max = wkArray[i];
				} else {
					others += wkArray[i];
				}

			}
			System.out.println(max < others ? "Yes" : "No");

		}
	}

	//	private static void solveC() {
	//
	//		try (Scanner scanner = new Scanner(System.in)) {
	//			int numN = 0;
	//			int numM = 0;
	//			numN = scanner.nextInt();
	//			numM = scanner.nextInt();
	//			if (numM == 1 && numN >= numM) {
	//				System.out.println(0);
	//				return;
	//			}
	//			int[] distArray = new int[numM];
	//			for (int i = 0; i < numM; i++) {
	//				distArray[i] = scanner.nextInt();
	//			}
	//
	//			Arrays.sort(distArray);
	//
	//			int moveDist = Math
	//					.abs((distArray[distArray.length - 1] - distArray[0])
	//							/ numN);
	//
	//			int[] komaArray = new int[numN];
	//
	//			int distTime = 0;
	//			int prevKomaNo = 0;
	//			for (int i = 0; i < distArray.length; i++) {
	//				if (i == 0) {
	//					komaArray[distTime] = distArray[i];
	//					prevKomaNo = distTime;
	//					distTime++;
	//					continue;
	//				}
	//				int distance = moveDist * distTime;
	//				if (distArray[komaArray[prevKomaNo]] + distance > distArray[i]) {
	//					komaArray[distTime] = distArray[i];
	//					prevKomaNo = distTime;
	//					distTime++;
	//					continue;
	//				}
	//				if (i == distArray.length - 1) {
	//					komaArray[komaArray.length - 1] = distArray[i];
	//				}
	//			}
	//
	//		}
	//	}

	private static void solveC2() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = 0;
			int numM = 0;
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			if (numM == 1 && numN >= numM) {
				System.out.println(0);
				return;
			}
			/*
			 * 各地点を取り込む
			 */
			int[] distArray = new int[numM];
			for (int i = 0; i < numM; i++) {
				distArray[i] = scanner.nextInt();
			}
			/*
			 * 地点を座標順に並び替える
			 */
			Arrays.sort(distArray);
			/*
			 * 座標間の距離を取得
			 */
			int[] sabunArray = new int[distArray.length - 1];
			for (int i = 0; i < sabunArray.length; i++) {
				sabunArray[i] = distArray[i + 1] - distArray[i];
			}

			/*
			 * 座標間の距離を並び替える
			 */
			Arrays.sort(sabunArray);

			int result = 0;
			/*
			 * 移動量が大きいところには駒を置いてしまうので
			 * 小さいところから合算すると移動しないといけない量を算出できる
			 */
			for (int i = 0; i < numM - numN; i++) {
				result += sabunArray[i];
			}

			System.out.println(result);

		}
	}

	/*
	 * 桁DP
	 */
	private static void solveD() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = 0;
			int numK = 0;
			numN = scanner.nextInt();
			numK = scanner.nextInt();

			long[] wk = LongStream.range(0, numN).map(i -> scanner.nextLong()).toArray();

			//			Arrays.sort(wk);
			final int MAX_DIGIT = 50;
			/*
			 * DP用配列の準備と初期化
			 * dp[0]が50桁目で、dp[49]が0桁目となる
			 */
			long[][] dp = new long[100][2];
			for (long[] ls : dp) {
				Arrays.fill(ls, -1);
			}
			dp[0][0] = 0;

			/*
			 * 桁DP開始
			 * 上から(50桁目)から順に舐めていく
			 */
			for (int d = 0; d < MAX_DIGIT; d++) {
				//調査対象の桁のmaskを生成
				final long mask = 1L << (MAX_DIGIT - d - 1);
				//				final long mask = (long) Math.pow(2, MAX_DIGIT - d - 1);
				//１が立っている数を調べる
				long numOne = 0;
				//				numOne = Arrays.stream(wk).filter(arrayElm -> {
				//					if ((arrayElm & mask) > 0) {
				//						return true;
				//					}
				//					return false;
				//				}).count();

				for (long arrayElm : wk) {
					if ((arrayElm & mask) > 0) {
						numOne++;
					}
				}

				// X の d 桁目を 0, 1 にしたときのコスト
				long cost0 = mask * numOne;
				long cost1 = mask * (numN - numOne);
				//				long cost0 = 0;
				//				long cost1 = 1;

				// smaller -> smaller
				/*
				 * 上の桁からdp[d]桁まで決めた時、kの値と一致するかどうか
				 * dp[d][1] != -1　（）であれば、
				 * dp[d][1]（）
				 */
				if (dp[d][1] != -1) {
					dp[d + 1][1] = Long.max(dp[d + 1][1], dp[d][1] + Long.max(cost0, cost1)); // 0 でも 1 でも自在に大きい方
				}

				// exact -> smaller
				if (dp[d][0] != -1) {
					if ((numK & mask) > 0) { // K の d 桁目が 1 だったら、X の d 桁目は 0 にする
						dp[d + 1][1] = Long.max(dp[d + 1][1], dp[d][0] + cost0);
					}
				}

				// exact -> exact (K にぴったり合わせる)
				if (dp[d][0] != -1) {
					if ((numK & mask) > 0) {
						/*
						 * K にぴったり合わせる=>その時採用するべき最大値に合わせる
						 */
						dp[d + 1][0] = Long.max(dp[d + 1][0], dp[d][0] + cost1);
					} else {
						/*
						 * ここはそもそもなんでcost0を無条件で突っ込めるの？
						 * ここは、Kとちょうど一致しなくてはいけない箇所なので、一致しないのであれば0埋めでもよい？
						 */
						dp[d + 1][0] = Long.max(dp[d + 1][0], dp[d][0] + cost0);
					}
				}
			}

			System.out.println(Long.max(dp[MAX_DIGIT][0], dp[MAX_DIGIT][1]));
		}

	}
}