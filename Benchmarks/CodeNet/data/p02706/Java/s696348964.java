import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		long sum = 0;
		for(int i = 0; i < m; i++){
		    sum += sc.nextInt();
		}
		
		// 計算
		long result = -1;
		result= max(n-sum, -1);
		
		
		// 出力
		System.out.println(result);
	}
}

