import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int a = sc.nextInt();// 500円玉の枚数
		int b = sc.nextInt();// 100円玉の枚数
		int c = sc.nextInt();// 50円玉の枚数
		int x = sc.nextInt();// 目標金額(50の倍数)

		// 操作が可能な限り実行する。
		int Num = NumberOfPatterns(a, b, c, x/50);

		// 出力
		System.out.println(Num);
	}

	// パターン数を再帰的に計算
	static int NumberOfPatterns(int a, int b, int c, int unit){
		
		int n = 0;

		if(unit == 0){
			return 1;
		}
		if(a >= 1 && unit >= 10){
			n = n + NumberOfPatterns(a - 1, b, c, unit - 10);
			n = n + NumberOfPatterns(0, b, c, unit);
		}else if(b >= 1 && unit >= 2){
			n = n + NumberOfPatterns(0, b - 1, c, unit - 2);
			n = n + NumberOfPatterns(0, 0, c, unit);
		}else if(c >= unit){
			n = n + NumberOfPatterns(0, 0, c - 1, unit - 1);
			n = n + NumberOfPatterns(0, 0, 0, unit);
		}
		return n;
	}
}


