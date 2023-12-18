import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		// 値取得
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums  = new ArrayList<>();
		while(sc.hasNext()){
			nums.add(sc.nextInt());

		}
		int kilo1 = 0;
		int kilo2 = 0;
		int kilo3 = 0;

		// 最短の飛行時間を計算する
		// それぞれのパーターンで時間の和を計算して最少を求める
		kilo1 = nums.get(0) + nums.get(1);
		kilo2 = nums.get(0) + nums.get(2);
		kilo3 = nums.get(1) + nums.get(2);
		if(kilo1 <= kilo2 && kilo1 <= kilo3){

			System.out.println(kilo1);
		}else if(kilo2 <= kilo1 && kilo2 <= kilo3){

			System.out.println(kilo2);				
		}else{

			System.out.println(kilo3);

		}
	}

}