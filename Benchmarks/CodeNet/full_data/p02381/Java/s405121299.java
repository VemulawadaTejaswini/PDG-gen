import java.util.*;

public class Main {
	
//	入力されるデータセット
	public static Scanner inputData = null; 
//	 入力された生徒数:n
	public static int iStudentNum = 0;
//	 入力された生徒の点数の配列を格納したList(n<1000のため1000)
	public static int[] iScoreList = new int[1000];
//	点数の平均値
	public static double dScoreMean = 0;
//	標準偏差
	public static double dSD = 0;
	
	public static void main(String[] args) {
//		TODO データセットを取得する処理
		getData();
		while( true) {
//			TODO 生徒数nを取得する処理
			getStudentNum();
//			TODO n=0の時、処理を終了する
			if( iStudentNum == 0) {
				inputData.close();
				break;
			}
//			TODO 生徒の点数の配列 LScoreList を取得する処理
			getScore();
//			TODO LScoreList から、平均値を出す処理
			getMeanScore();
//			TODO 標準偏差を割り出す処理
			getSD();
//			TODO 標準偏差を出力する処理
			outputResult();
		}
	}

	private static void outputResult() {
		// TODO 値を出力する処理
		System.out.println(dSD);
		}

	private static void getSD() {
		// TODO 平均値から標準偏差を割り出す処理
		double sumSigmaResult = 0;
		for(int count=0; count<iStudentNum; count++ ) {
			sumSigmaResult += Math.pow( iScoreList[count] - dScoreMean, 2);
		}
		dSD = Math.sqrt( sumSigmaResult / ( double)iStudentNum);
	}

	private static void getMeanScore() {
		// TODO Listのデータから平均値を出す処理
		int sumScore = 0;
		for(int count=0; count<iStudentNum; count++ ) {
			sumScore += iScoreList[count];
		}
		dScoreMean = sumScore / ( double)iStudentNum;
	}

	private static void getScore() {
//		TODO 生徒の点数の配列 LScoreList を取得する処理
//		初期化
		for( int count=0; count<iScoreList.length; count++) {
			iScoreList[count] = 0;
		}
		for( int count=0; count<iStudentNum; count++) {
			iScoreList[count] = inputData.nextInt();
		}
	}

	private static void getStudentNum() {
		// TODO 生徒数nを取得する処理
		if( inputData.hasNext() ) {
			iStudentNum = inputData.nextInt();
		}
	}
	
	private static void getData() {
		// TODO データセットを取得する処理
		inputData = new Scanner(System.in);
	}
}
