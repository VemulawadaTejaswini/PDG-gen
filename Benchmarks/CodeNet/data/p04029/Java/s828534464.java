import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.round;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputCount = sc.nextInt();
		List<Integer> inputList = new ArrayList<Integer>();
		for(int i=0;i<inputCount;i++){
			inputList.add(sc.nextInt());
		}
		
		//平均値を求める
		int sum = 0;
		for(Integer input : inputList){
			sum += input;
		}
		int ave = (int)round((double)sum/(double)inputCount);
		
		//コスト計算
		int cost = 0;
		for(Integer input : inputList){
			cost += (ave - input)*(ave - input);
		}
		sc.close();
		System.out.print(cost);
	}
}
