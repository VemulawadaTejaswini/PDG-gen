import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt() - (i + 1);
		    sum += a[i];
		}
		
		// 計算
		long result = 0;
		long b1 = sum/n;
		long b2 = sum/n + 1;
		long b3 = sum/n - 1;
		long absSum1 = 0;
		long absSum2 = 0;
		long absSum3 = 0;
		for(int i = 0; i < n; i++){
		    absSum1 += abs(a[i] - b1);
		    absSum2 += abs(a[i] - b2);
		    absSum3 += abs(a[i] - b3);
		}
		result = min(absSum1, min(absSum2, absSum3));
		
		// 出力
		System.out.println(result);
	}
}
