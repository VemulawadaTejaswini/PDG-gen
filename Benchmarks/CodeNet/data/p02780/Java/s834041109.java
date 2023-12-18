import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] sum = new double[n+1];
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    sum[i+1] = sum[i] + ((double)a + 1)/2;
		}
		
		// 計算
		double result = 0;
		for(int i = 0; i < n-k+1; i++){
		    result = max(result, sum[i+k]-sum[i]);
		}
		
		// 出力
		System.out.println(result);
	}
}

