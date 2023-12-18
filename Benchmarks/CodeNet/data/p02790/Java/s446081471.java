import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int result = 0;
		if(a > b){
		    for(int i = 0; i < a; i++){
		        System.out.print(b);
		    }
		}else{
		    for(int i = 0; i < b; i++){
		        System.out.print(a);
		    }
		}
		
		// 出力
		//System.out.println(result);
	}
}


