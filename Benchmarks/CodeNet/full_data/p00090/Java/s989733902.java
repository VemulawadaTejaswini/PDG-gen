import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		Main instance = new Main();
		instance.execute();
	}
	
	private void execute() throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int rows = Integer.parseInt(sc.readLine());
			if(rows == 0){break;}
			
			Map<Integer, List<Integer>> cross = calculateCross(toDataArray(sc, rows));
			int result = 0;
			for(Integer num : cross.keySet()) {
				result = Math.max(result, countCrossover(cross, cross.get(num), 0));
			}
			
			System.out.println(result);
		}
	}
	
	/**
	 * BufferReaderから取得した座標情報を2次元配列に変換する
	 */
	private double[][] toDataArray(BufferedReader sc, int rows) throws IOException {
		double[][] dataArray = new double[rows][2];
		
		String[] line;
		for(int i = 0 ; i < rows ; i++) {
			line = sc.readLine().split(",");
			dataArray[i][0] = Double.parseDouble(line[0]);
			dataArray[i][1] = Double.parseDouble(line[1]);
		}
		return dataArray;
	}

	/**
	 * 座標情報（2次元配列）から、シールの重なり状態を示すMapを生成する
	 * {シール番号, [座標が重なるシール番号]}
	 */
	private Map<Integer, List<Integer>> calculateCross(double[][] dataArray) {
		Map<Integer, List<Integer>> cross = new HashMap<Integer, List<Integer>>();
		
		List<Integer> result;
		for(int i = 0 ; i < dataArray.length ; i++) {
			result = new ArrayList<Integer>();
			for(int j = i + 1 ; j < dataArray.length ; j++) {
				// x座標,y座標の各距離の二乗の和が4以下なら、シールが重なっていると判断
				if(Math.pow(dataArray[i][0] - dataArray[j][0], 2) + 
				   Math.pow(dataArray[i][1] - dataArray[j][1], 2) <= 4) {
					result.add(j);
				}
			}
			cross.put(i, result);
		}
		
		return cross;
	}
	
	/**
	 * シールの重なり状態を示すMapから、最大の重なり枚数を計算する
	 */
	private int countCrossover(Map<Integer, List<Integer>> cross, List<Integer> currentCross, int currentCount) {
		int result = 1;
		List<Integer> target;
		List<Integer> nextCross;
		
		for(Integer num : currentCross) {
			System.out.println(num + ":count=" + currentCount + " :result=" + result);

			target = cross.get(num);
			nextCross = new ArrayList<Integer>();
			nextCross.addAll(target);
			nextCross.retainAll(currentCross);
			target.removeAll(currentCross);

			result = Math.max(result, countCrossover(cross, nextCross, 1));
		}
		return currentCount + result;
	}
}