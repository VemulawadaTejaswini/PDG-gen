import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		// 計算
		long result = 0;
		while(true){
		    if(n >= k){
		        n = n%k;
		    }else{
		        if(n > abs(n-k)) n = abs(n-k);
		        break;
		    }
		}
		result = n;
		
		// 出力
		System.out.println(result);
	}
}

