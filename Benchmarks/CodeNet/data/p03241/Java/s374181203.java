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
		for(int i = 1; i <= sqrt(m); i++){
		    if(m%i == 0){
		        int a = m/i;
		        if(a >= n) result = max(result, i);
		        if(i >= n) result = max(result, a);
		    }
		}
		
		// 出力
		System.out.println(result);
		
	}
}