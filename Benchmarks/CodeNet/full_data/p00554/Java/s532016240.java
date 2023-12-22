import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static BufferedReader br;

	// 入力されるデータセットを格納するためのリスト
	private static ArrayList<String> dataSet = new ArrayList<String>();

	// mainメソッド
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] splitedLine = line.split(" ");
		int N = Integer.parseInt(splitedLine[0]);
		int M = Integer.parseInt(splitedLine[1]);

		inputDataSet(M); // データセットを読み込み、dataSetに格納する

		int costSum = 0;
		int max = 0;
		for(String data : dataSet) {
			int missNum = Integer.parseInt((data.split(" "))[1]);
			if(missNum > N) {
				if(missNum > max) {
					max = missNum;
				}

				costSum += missNum - N;
			}
		}
		if(max > N) {
			costSum -= max - N;
		}

		System.out.println(costSum);
	}

	// 指定された行数だけ読み込み、行ごとにdataSetに格納していくメソッド
	public static void inputDataSet(int rawNum) {
		for(int i = 0;i < rawNum;i++) {
			String line = null;
			try {
				line = br.readLine(); // 標準入力から読み込む
			} catch (IOException e) {
				e.printStackTrace();
			}

			// 行の終わりに達した場合、終了
			if(line == null)break;

			dataSet.add(line); // 読み込んだ行をdataSetに追加
		}
	}

	// 終端(terminal)まで読み込み、行ごとにdataSetに格納していくメソッド
	public static void inputDataSet(String terminal) {
		while(true) {
			String line = null;
			try {
				line = br.readLine(); // 標準入力から読み込む
			} catch (IOException e) {
				e.printStackTrace();
			}

			// 行の終わり、もしくはterminalと一致した場合、終了
			if(line == null || line.equals(terminal))break;

			dataSet.add(line); // 読み込んだ行をdataSetに追加
		}
	}
}

