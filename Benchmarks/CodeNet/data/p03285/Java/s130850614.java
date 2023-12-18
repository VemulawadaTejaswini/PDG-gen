import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		String result = "No";
		for(int i = 0; i <= 100/4; i++){
		    for(int j = 0; j <= 100/7; j++){
		        if(n == 4*i + 7*j){
		            result = "Yes";
		            System.out.println(result);
		            return;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
