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

	private Map<Integer, List<Integer>> calculateCross(double[][] dataArray) {
		Map<Integer, List<Integer>> cross = new HashMap<Integer, List<Integer>>();
		
		List<Integer> result;
		for(int i = 0 ; i < dataArray.length ; i++) {
			result = new ArrayList<Integer>();
			for(int j = i + 1 ; j < dataArray.length ; j++) {
				if(Math.pow(dataArray[i][0] - dataArray[j][0], 2) + 
				   Math.pow(dataArray[i][1] - dataArray[j][1], 2) <= 4) {
					result.add(j);
				}
			}
			cross.put(i, result);
		}
		
		return cross;
	}
	
	private int countCrossover(Map<Integer, List<Integer>> cross, List<Integer> currentCross, int currentCount) {
		int result = 1;
		List<Integer> target;
		for(int i = 0 ; i < currentCross.size() ; i++) {
			target = cross.get(currentCross.get(i));
			for(int j = i + 1 ; j < currentCross.size() ; j++) {
				if(target.contains(currentCross.get(j))) {
					target.remove(currentCross.get(j));
					result = Math.max(result, countCrossover(cross, target, currentCount + 1));
				}
			}
		}
		return currentCount + result;
	}
}