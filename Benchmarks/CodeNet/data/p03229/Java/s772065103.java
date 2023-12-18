import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> intList = new ArrayList <Integer> ();
		ArrayList <Integer> LastList = new ArrayList <Integer> ();
		int cost = 0;
		// 整数の入力　ループ回数
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N; i++){
			// 整数の入力　
			int A = sc.nextInt();
			intList.add(A);
		}
		//小さい順にソート
		Collections.sort(intList);
		
		int firstSmall = intList.get(0);
		int secondSmall = intList.get(1);
		int MostLarge =  intList.get(intList.size() -1);
		int MoreNumber =  intList.get(intList.size() -2);
		int Number =  intList.get(intList.size() -3);
		
		cost += MostLarge - firstSmall;
		cost += MostLarge - secondSmall;
		
		cost += Number - secondSmall;
		cost += MoreNumber - firstSmall;
		
		for(int i = intList.size()-4; i >= 2; i--){
			cost += intList.get(i + 2) - intList.get(i);
		}
		System.out.println(cost);
		
	}
}
