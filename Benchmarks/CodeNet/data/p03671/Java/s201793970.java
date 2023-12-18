import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			ArrayList<Integer> stateList = new ArrayList<Integer>();
					
			for (int i = 0; i < 3;i ++ ){
				// 整数の入力
				// スペース区切りの整数の入力
				stateList.add(sc.nextInt());
			}
			 
			Collections.sort(stateList);
			
			int sum = 0;
			sum = stateList.get(0) + stateList.get(1);

			// 出力
			System.out.println(sum);
		}
}
