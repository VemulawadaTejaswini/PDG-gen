import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		float result = 0;
		if(n == 1){
		    result = 1; 
		}else if(n%2 == 0){
		    result = (float)1/2;
		}else{
		    result = (float)(n/2 + 1)/n;
		}
		
		// 出力
        System.out.println(result);
	}
}