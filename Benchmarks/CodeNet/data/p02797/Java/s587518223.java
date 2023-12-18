import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		// 計算
		String result = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
		    if(i < k){
		        sb.append(s);
		    }else{
		        sb.append(s+1);
		    }
		    sb.append(" ");
		}
		result = sb.toString();
		
		// 出力
		System.out.println(result);
	}
}


