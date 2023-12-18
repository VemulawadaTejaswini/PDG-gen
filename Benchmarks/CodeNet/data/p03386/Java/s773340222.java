import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		
		// 出力
		for(int i = 0; i < k; i++){
		    if(a+i <= b) System.out.println(a+i);
		}
		for(int i = k-1; i >= 0; i--){
		    if(b-i > a+k-1) System.out.println(b-i);
		}
		
	}

}


