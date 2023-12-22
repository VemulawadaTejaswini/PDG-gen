
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	protected static final int MAX_BAG_WEIGHT = 1000;
	protected static final int MAX_NUM_TREASURES = 1000;
	protected static final int MAX_VALUE = 10000;
	protected static final int WEIGHT = 0;
	protected static final int VALUE = 1;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bagWeight = 0;
		int num_treasures = 0;
		int caseNumber = 1;
		ArrayList<Treasure> treasureList;
		while(true){
			//bagを生成
			bagWeight = Integer.parseInt(br.readLine());
			if(bagWeight <= 0 || bagWeight > MAX_BAG_WEIGHT) break;
			
			//お宝リストを生成
			treasureList = new ArrayList<Treasure>();
			num_treasures = Integer.parseInt(br.readLine());
			if(num_treasures < 1 || num_treasures > MAX_NUM_TREASURES) break;
			for(int i = 0; i < num_treasures; i++){
				String[] inputs = (br.readLine()).split(",");
				int treasureValue = Integer.parseInt(inputs[WEIGHT]);
				int treasureWeight = Integer.parseInt(inputs[VALUE]);
				treasureList.add(new Treasure(treasureWeight, treasureValue));
			}
		
			//動的計画法
			int[] maxValueOfEachWeight = getMaxValue(bagWeight, treasureList);
			
			//価値がもっとも高いときの、もっとも軽い重量を出力する
			System.out.println("Case　" + caseNumber++ + ":");
			System.out.println(maxValueOfEachWeight[maxValueOfEachWeight.length - 1]);
			System.out.println(getMinWeightWhenMaxValue(maxValueOfEachWeight));
		}
	}
	
	public static int[] getMaxValue(int bagWeight, ArrayList<Treasure> treasureList){
		int[] maxValue = new int[bagWeight + 1];	//各バッグ積載可能重量での最大valueを格納する
		//重量が0のとき、treasureはつめないためvalue = 0
		maxValue[0] = 0;			
		//バッグには何もつめられていないため、0で初期化
		Arrays.fill(maxValue, 0);	
		//各treasureについて、バッグ積載可能重量に空きがあり、
		//treasureを追加することでvalueが大きくなるなら追加していく
		for(int i = 0; i < treasureList.size(); i++){
			int treasureWeight = treasureList.get(i).getWeight();
			int treasureValue = treasureList.get(i).getValue();
			for(int j = bagWeight; j >= treasureWeight; j--){
				if(maxValue[j - treasureWeight] < 0){
					//treasureが詰められない場合は次のアイテムを検討する
					break;
				}
				int tmpValue = maxValue[j - treasureWeight] + treasureValue;
				maxValue[j] = Math.max(maxValue[j], tmpValue);
			}
		}
		return maxValue;
	}
	public static int getMinWeightWhenMaxValue(int[] maxValueOfEachWeight){
		int minWeight = maxValueOfEachWeight.length - 1;
		int maxValue = maxValueOfEachWeight[minWeight];
		for(int weight = maxValueOfEachWeight.length - 2; weight >= 0; weight--){
			if(maxValue > maxValueOfEachWeight[weight]){
				break;
			}
			minWeight = weight;
		}
		return minWeight;
	}
}