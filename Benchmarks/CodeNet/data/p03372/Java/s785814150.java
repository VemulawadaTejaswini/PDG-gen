import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long c = sc.nextLong();
		long[][] xv = new long[n][2];
		for(int i = 0; i < n; i++){
		    xv[i][0] = sc.nextLong();
		    xv[i][1] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		long[] cal = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        cal[i+1] = cal[i] + xv[i][1] - (xv[i][0] - xv[i-1][0]); 
		    }else{
		        cal[i+1] = cal[i] + xv[i][1] - xv[i][0];
		    }
		}
		long[] rev = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        rev[i+1] = rev[i] + xv[n-1-i][1] - (xv[n-i][0] - xv[n-1-i][0]); 
		    }else{
		        rev[i+1] = rev[i] + xv[n-1-i][1] - (c - xv[n-1-i][0]);
		    }
		}
		long[] cal_return = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        cal_return[i+1] = cal_return[i] + xv[i][1] - 2*(xv[i][0] - xv[i-1][0]); 
		    }else{
		        cal_return[i+1] = cal_return[i] + xv[i][1] - 2*xv[i][0];
		    }
		}
		long[] rev_return = new long[n+1];
		for(int i = 0; i < n; i++){
		    if(i > 0){
		        rev_return[i+1] = rev_return[i] + xv[n-1-i][1] - 2*(xv[n-i][0] - xv[n-1-i][0]); 
		    }else{
		        rev_return[i+1] = rev_return[i] + xv[n-1-i][1] - 2*(c - xv[n-1-i][0]);
		    }
		}
		
		for(int i = 0; i < n; i++){
		    long[] array1 = Arrays.copyOf(rev, n+1-i);
		    Arrays.sort(array1);
		    result = max(result, cal_return[i] + max(0, array1[n-i]));
		    long[] array2 = Arrays.copyOf(cal, n+1-i);
		    Arrays.sort(array2);
		    result = max(result, rev_return[i] + max(0, array2[n-i]));
		}
		
		// 出力
		System.out.println(result);
	}
}

