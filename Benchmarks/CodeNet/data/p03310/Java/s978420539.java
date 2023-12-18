import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] sum = new long[n+1];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    sum[i+1] = sum[i] + a[i];
		}
		
		// 計算
		long result = Long.MAX_VALUE;
		for(int i = 2; i < n-1; i++){
		    long sumLeft = sum[i] - sum[0];
		    long sumRight = sum[n] - sum[i];
		    long[] left = calc(Arrays.copyOfRange(a, 0, i), sumLeft);
		    long[] right = calc(Arrays.copyOfRange(a, i, n), sumRight);
		    long max = max(left[1], max(left[2], max(right[1], right[2])));
		    long min = min(left[1], min(left[2], min(right[1], right[2])));
		    result = min(result, max - min);
		}
		// 出力
		System.out.println(result);
	}
	
	static long[] calc(long[] list, long sum){
	    long tmp = 0;
	    long[] res = new long[3];
	    for(int i = 0; i < list.length; i++){
	        tmp += list[i];
	        if(tmp >= sum/2){
	            if(abs(sum - 2*tmp) < abs(sum - 2*(tmp - list[i]))){
	                res[0] = i+1;
	                res[1] = tmp;
	                res[2] = sum - tmp;
	            }else{
	                res[0] = i;
	                res[1] = tmp - list[i];
	                res[2] = sum - (tmp - list[i]);
	            }
	            return res;
	        }
	    }
	    return res;
	}
}
