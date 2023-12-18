import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 計算
		int result = 1;
		for(int i = n; i <= m/2; i++){
		    if(m%i == 0){
		        result = m/i;
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
		
	}
}