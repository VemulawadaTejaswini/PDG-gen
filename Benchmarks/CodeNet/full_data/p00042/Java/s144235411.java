package jp.ac.saburou.volume0.p42;

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

	public static void main(String[] args){
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bagWeight = 0;
		int num_treasures = 0;
		int caseNumber = 1;
		ArrayList<Treasure> treasureList = new ArrayList<>();
		Thief thief = new Thief();
		while(true){
			//bagを生成
			bagWeight = Integer.parseInt(br.readLine());
			if(bagWeight <= 0 || bagWeight > MAX_BAG_WEIGHT) break;
			Bag bag = new Bag(bagWeight);
			
			thief.setBag(bag);
			
			//お宝リストを生成
			treasureList.clear();
			num_treasures = Integer.parseInt(br.readLine());
			if(num_treasures < 1 || num_treasures > MAX_NUM_TREASURES) break;
			for(int i = 0; i < num_treasures; i++){
				String[] inputs = (br.readLine()).split(",");
				int treasureValue = Integer.parseInt(inputs[WEIGHT]);
				int treasureWeight = Integer.parseInt(inputs[VALUE]);
				treasureList.add(new Treasure(treasureWeight, treasureValue));
			}
			
			//動的計画法
			int[] maxValueOfEachWeight = thief.getMaxValue(treasureList);
			
			//価値がもっとも高いときの、もっとも軽い重量を出力する
			System.out.println("Case " + caseNumber++ + ":");
			System.out.println(maxValueOfEachWeight[maxValueOfEachWeight.length - 1]);
			System.out.println(thief.getMinWeightWhenMaxValue(maxValueOfEachWeight));
		}
		}catch(IOException e){
			//DO NOTHING
		}
	}
}

class Bag{
	private int maxWeight;
	public Bag(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	public int getMaxWeight() {
		return this.maxWeight;
	}
}

class Treasure{
	private int weight;
	private int value;
	public Treasure(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	public int getWeight() {
		return this.weight;
	}
}

class Thief{
	private Bag bag;
	public void setBag(Bag bag) {
		this.bag = bag;
	}
	public int[] getMaxValue(ArrayList<Treasure> treasureList){
		int[] maxValue = new int[this.bag.getMaxWeight() + 1];	//各バッグ積載可能重量での最大valueを格納する
		//重量が0のとき、treasureはつめないためvalue = 0
		maxValue[0] = 0;			
		//バッグには何もつめられていないため、0で初期化
		Arrays.fill(maxValue, 0);	
		//各treasureについて、バッグ積載可能重量に空きがあり、
		//treasureを追加することでvalueが大きくなるなら追加していく
		for(int i = 0; i < treasureList.size(); i++){
			int treasureWeight = treasureList.get(i).getWeight();
			int treasureValue = treasureList.get(i).getValue();
			for(int weight = this.bag.getMaxWeight(); weight >= treasureWeight; weight--){
				if(maxValue[weight - treasureWeight] < 0){
					//treasureが詰められない場合は次のアイテムを検討する
					break;
				}
				int tmpValue = maxValue[weight - treasureWeight] + treasureValue;
				maxValue[weight] = Math.max(maxValue[weight], tmpValue);
			}
		}
		return maxValue;
	}
	public int getMinWeightWhenMaxValue(int[] maxValueOfEachWeight){
		int minWeight = this.bag.getMaxWeight();
		int maxValue = maxValueOfEachWeight[minWeight];
		for(int weight = this.bag.getMaxWeight(); weight >= 0; weight--){
			if(maxValue > maxValueOfEachWeight[weight]){
				break;
			}
			minWeight = weight;
		}
		return minWeight;
	}
}