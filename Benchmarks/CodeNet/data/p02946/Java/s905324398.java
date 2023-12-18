import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int k = sc.nextInt();
		int x = sc.nextInt();

		// 計算
		int from = x - k + 1;
		int to = x + k - 1;
		
		// 出力
		for(int i = from; i <= to; i++){
		    System.out.print(i + " ");
		}
	}
}
