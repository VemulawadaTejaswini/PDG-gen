import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] a = new long[n+1];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextLong();
		}
		
		// 計算
		int result = 0;
		long xor = a[0];
		long sum = a[0];
		int r = 0;
		int l = 0;
		while(l < n && r < n){
		    if(xor == sum){
		        result += r - l + 1;
		        r++;
		        xor = xor ^ a[r];
		        sum = sum + a[r];
		    }else{
		        xor = xor ^ a[l];
		        sum = sum - a[l];
		        l++;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
