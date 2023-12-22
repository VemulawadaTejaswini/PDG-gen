

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test {
	
	public static void main(String[] args){
		
		//リストを用意
		ArrayList<Integer> testInt = new ArrayList<Integer>();
		
		//リストに要素を追加
		testInt.add(5);
		testInt.add(222);
		testInt.add(1);
		testInt.add(10);
		
		//リストを降順で並べたい
		Collections.sort(testInt);
		
		//結果を表示
		for(int i = 0;i < 4;i++){
			System.out.println(testInt.get(i));
		}
	}

}

//降順に並べたい
class testCompare implements Comparator {
	
	public int compare(Object s, Object t) {
		//比較する数
		int ss = Integer.parseInt(s.toString());
		int tt = Integer.parseInt(t.toString());
		
		//降順で結果を返す
		return  -(ss - tt);
	}
}