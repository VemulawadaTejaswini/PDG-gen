import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int caseNum = 1;
		while(true){
			int weightLimit = Integer.parseInt(br.readLine());

			if(weightLimit == 0){
				break;
			}

			int n = Integer.parseInt(br.readLine());
			Treasure[] treasures = new Treasure[n];

			for(int i = 0; i < n; i++){
				String[] tmpArray = br.readLine().split(",");
				treasures[i] = new Treasure(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]));
			}

			//int[][] result = new int[n][weightLimit];
			Result[][] resultTable = new Result[n][weightLimit + 1];

			for(int i = 0; i <= weightLimit ; i++){
				resultTable[0][i] = new Result(0, 0);
			}

			//int getCount = 0;
			for(int i = 1 ; i < n ; i++){
				for(int j = 0; j <= weightLimit ; j++){
					if(treasures[i].weight <= j && j-treasures[i].weight >= 0){
						int result1 = resultTable[i-1][j].value;
						int result2 = resultTable[i-1][j-treasures[i].weight].value + treasures[i].value;
//						resultTable[i][j] = new Result( Math.max(, ), ;
						if(result1 >= result2){
							resultTable[i][j] = new Result(result1, resultTable[i-1][j].count);
						}
						else {
							resultTable[i][j] = new Result(result2, resultTable[i-1][j-treasures[i].weight].count + 1);
							//resultTable[i][j].selected[i] = true;
						}
					}
					else {
						resultTable[i][j] = new Result(resultTable [i-1][j].value, resultTable[i-1][j].count);
					}
				}
			}
			
			int weight = 0;
			int maxValue = resultTable[n-1][weightLimit-1].value;
			for(int j = 0; j <= weightLimit ; j++){
				for(int i = 0; i < n; i++){
					if(resultTable[i][j].value == maxValue){
						weight = j;
						break;
					}
				}
				if(weight != 0){
					break;
				}
			}

			System.out.println("Case "+caseNum+":");
			System.out.println(maxValue);
			System.out.println(weight);
			
			caseNum++;
		}

	}

}

class Result {
	int value;
	//boolean[] selected;

//	public Result (int value, boolean[] selected){
//		this.value = value;
//		this.selected = Arrays.copyOf(selected, selected.length);
//	}
	int count;

	public Result (int value, int count){
		this.value = value;
		this.count = count;
	}
//
//	public int countTreasure(){
//		int count = 0;
//		for(int i = 0; i < selected.length ; i++){
//			if(selected[i]){
//				count++;
//			}
//		}
//		return count;
//	}
}

class Treasure {
	int weight;
	int value;

	public Treasure(int v, int w){
		this.weight = w;
		this.value = v;
	}
}