import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n]; 
		for(int i = 0; i < n; i++){
			list[i] = sc.nextInt();
		}

		// 計算
		int maxSum = 0;
		for(int i = 0; i <= k; i++){
		    int sum = 0;
		    for(int j = 0; j < n; j++){
		        sum = sum + (int)(i^list[j]);
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
