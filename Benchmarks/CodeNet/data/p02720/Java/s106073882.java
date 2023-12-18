

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		k = sc.nextInt();

		dfs(0);

	}

	static int k;
	static final int DEPTH_MAX = 12;
	static int[] digits = new int[DEPTH_MAX];
	static int count = 1;


	static void dfs(int depth){
		if(depth == DEPTH_MAX){
			if(digits[DEPTH_MAX - 1] == -1){
				return;
			}
//			System.out.print(count+" ");
			if(count == k){
				printDigits();
			}

			count++;
			return;
		}

		int start = 0;
		if(depth == 0 || digits[depth - 1] == -1){
			start = -1;
		}
		for(int i = start; i <= 9; i++){
			if(i == 0 && (depth == 0 || digits[depth - 1] == -1)){
				continue;
			}
			if(i == -1 || (depth >= 1 && (digits[depth - 1] == -1 || Math.abs(digits[depth - 1] - i) <= 1))){
				digits[depth] = i;
				dfs(depth + 1);
 			}
		}
	}

	static void printDigits(){
		for(int i = 0; i < DEPTH_MAX; i++){
			if(digits[i] != -1){
				System.out.print(digits[i]);
			}
		}
		System.out.println();
	}

}
