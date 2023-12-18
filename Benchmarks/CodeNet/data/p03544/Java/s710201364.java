import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		long result = 0;
		long a = 2;
		long b = 1;
		for(int i = 1; i < n+1; i++){
		    if(i == 1) result = 1;
		    if(i > 1){
		        result = a + b;
		        a = b;
		        b = result;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

