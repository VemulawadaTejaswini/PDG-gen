import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0; i < n; i++){
		    d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		
		// 計算
		int result = d[n/2] - d[n/2 - 1];
		
		// 出力
		System.out.println(result);
		
	}
}
