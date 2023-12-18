import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		long n = sc.nextInt();
		long k = sc.nextInt();
		long[] list = new long[n]; 
		for(int i = 0; i < n; i++){
			list[i] = sc.nextLong();
		}

		// 計算
		long maxSum = 0;
		for(int i = 0; i <= k; i++){
		    long sum = 0;
		    for(int j = 0; j < n; j++){
		        sum = sum + (long)(i^list[j]);
		        //System.out.println("k:" + i + " n:" + list[j] + " k xor n: " + String.valueOf(i^list[j]));
		        //System.out.println("sum:" + sum);
		    }
			maxSum = max(maxSum, sum);
			//System.out.println("maxSum:" + maxSum);
		}

		// 出力
		System.out.println(maxSum);
	}

}
