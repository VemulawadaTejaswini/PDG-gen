import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();

		// 計算
		int result = x;
		for(int i = 1; i <= 10; i++){
		    result = result * r - d;
		    System.out.println(result);
		}
		
		// 出力
		//System.out.println(result);
	}
}