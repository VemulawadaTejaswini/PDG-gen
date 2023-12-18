package ans_20170701;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;

		// 最安値の合計
		if(a <= b){
			ans = a;
		}else{
			ans = b;
		}

		if(b <= c){
			ans = ans + b;
		}else{
			ans = ans + c;
		}


// 出力
		System.out.println(ans));

		sc.close();
	}
}