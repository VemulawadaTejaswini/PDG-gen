import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		
		// 整数の入力
		int a = sc.nextInt();//候補数
		int b = sc.nextInt();//何かの気温
		int c = sc.nextInt();//比較気温
		
		int xx = 0;
		
		double answer;//格納用
		int answer2;//答え用
		int answer3;//格納用２
		
		for(int i = 0; i < a; i++) {
			int d = sc.nextInt();//候補地高さ
			answer = b - d * 0.006; 
			answer2 = (int)answer; 
			answer2 = answer2 - c; 
			myList.add(Math.abs(answer2));
			xx++;
		}
		
		answer3 = Collections.min(myList);
		
		for(int x =0; x < a; x++ ) {
			if(answer3 == myList.get(x)) {
				System.out.println(x + 1);
			}else {
				
			}
		}

	}
		
}
