import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		for(int i = 1; i <= n; i++){
		    if(i%2 == 0) continue;
		    int cnt = 0;
		    for(int j = 1; j <= i; j++){
		        if(i%j == 0) cnt++;
		    }
		    if(cnt == 8) result++;
		}
		
		// 出力
		System.out.println(result);
	}
}
