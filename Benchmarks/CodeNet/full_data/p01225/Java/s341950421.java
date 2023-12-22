import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		//データ入力の準備
		Scanner sc = new Scanner(System.in);
		
		//データセット数
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++){
			int[] temp = new int[9];
			List<Integer> red = new ArrayList<Integer>();
			List<Integer> blue = new ArrayList<Integer>();
			List<Integer> green = new ArrayList<Integer>();
			
			//一旦全ての数字をtempに保存
			for (int j = 0; j < 9; j++){
				temp[j] = sc.nextInt();
			}
			
			//色ごとのリストに格納
			for (int j = 0; j < 9; j++){
				String color = sc.next();
				
				if (color == "R"){
					red.add(temp[j]);
				}else if (color == "B"){
					blue.add(temp[j]);
				}else{
					green.add(temp[j]);
				}
			}
			
			//データのチェック
			if (check(red) == 1 || check(blue) == 1 || check(green) == 1){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			
		}
		
	}
	
	private static int check(List<Integer> data){
		int[] check = {0,0,0,0,0,0,0,0,0};
		boolean last = false;
		boolean one = false;
		boolean two = false;
		
		for (int i = 0; i < data.size(); i++){
				check[data.get(i)] += 1;
		}
		
		for (int i = 0; i < data.size(); i++){
			//同じ数字３つの判定
			/*if (data.get(i) >= 3){
				return 1;
			}*/
			
			
			//連番の判定
			two = one;
			one = last;
			
			if (data.get(i) >= 1){
				last = true;
			}else{
				last = false;
			}
			
			if (last == true && one == true && two == true){
				return 1;
			}
		}
			
		return 0;
	}
}
