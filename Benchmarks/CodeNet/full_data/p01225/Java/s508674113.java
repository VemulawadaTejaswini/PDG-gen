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
		int[] check1 = {0,0,0,0,0,0,0,0,0};
		int set = 0;
		boolean last = false;
		boolean one = false;
		boolean two = false;
		
		for (int i = 0; i < data.size(); i++){
				check1[data.get(i)] += 1;
		}
		
		//同じ数字３つを使わない場合
		int temp = renban(check1,0);
		if (temp == 1){
			return 1;
		}
		
		//同じ数字３つを試みる
		List<Integer> triple = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++){
			if (check1[i] >= 3){
				triple.add(i);
			}
		}
		
		if (triple.size() == 0){
			return 0;
		}else if (triple.size() == 1){
			check1[triple.get(0)] -= 3;
			
			int res = renban(check1,1);
			return res;
		}else if (triple.size() == 3){
			return 1;
		}else{
			int[] check2 = new int[9];
			int[] check3 = new int[9];
			
			for (int i = 0; i < 9; i++){
				check2[i] = check1[i];
				check3[i] = check1[i];
			}
			
			check1[triple.get(0)] -= 3;
			check1[triple.get(1)] -= 3;
			int res1 = renban(check1,2);
			if(res1 == 1){
				return 1;
			}
			
			check2[triple.get(0)] -= 3;
			int res2 = renban(check2,1);
			if(res2 == 1){
				return 1;
			}
			
			check3[triple.get(1)] -= 3;
			int res3 = renban(check3,1);
			if(res3 == 1){
				return 1;
			}
		}
		
			
		return 0;
	}



	
	private static int renban(int[] input, int initialSet){
		int[] data = new int[9];
		for (int i = 0; i < 9; i++){
			data[i] = input[i];
		}
		int set = initialSet;
		boolean last = false;
		boolean one = false;
		boolean two = false;
		
		for (int i = 0; i < 9; i++){
			two = one;
			one = last;
			if (data[i] >= 1){
				last = true;
			}else{
				last = false;
			}
			
			if (last == true && one == true && two == true){
				set++;
				data[i] -= 1;
				data[i - 1] -= 1;
				data[i - 2] -= 1;
				i = -1;
				last = false;
				one = false;
				two = false;
			}
		}
		
		if (set >= 3){
			return 1;
		}else{
			return 0;
		}
	}
}
