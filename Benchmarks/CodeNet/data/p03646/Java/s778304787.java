import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long k = sc.nextLong();
		
		// 計算
		if(k <= 1){
		    System.out.println(2);
		    System.out.println((k+1) + " " + 0);
		    return;
		}
		int n = (int)min(k, 50);
		long[] result = new long[n];
		for(int i = 0; i < n; i++){
		    result[i] = max(k, 0);
		    k--;
		}
		
		// 出力
		System.out.println(n);
		for(int i = 0; i < n; i++){
		    System.out.print(result[i] + " ");
		}
	}

}


