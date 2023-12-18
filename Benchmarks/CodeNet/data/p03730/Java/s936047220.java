import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int a = sc.nextInt();// A
		int b = sc.nextInt();// B
		int c = sc.nextInt();// C

		// 計算
		String result = "";
		if(check(a,b,c)){
			result = "YES";
		}else{
			result = "NO";
		}

		// 出力
		System.out.println(result);
	}

	static boolean check(int a, int b, int c){
		for(int i = 1; i <= b; i++){
			if((i * a)%b == c) return true;
		}
		return false;
	}
}


