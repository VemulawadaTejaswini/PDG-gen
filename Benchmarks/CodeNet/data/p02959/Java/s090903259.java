import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		long[] a = new long[n + 1];
		long[] b = new long[n + 2];
		
		for(int i = 0; i < n + 1; i++){
		    a[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextLong();
		}
		b[n] = 0;
		b[n + 1] = 0;

		// 計算
		long result = 0;
		
		for(int i = 0; i < n + 1; i++){
		    long m = b[i] - a[i];
		    if(m >= 0){
		        result = result + a[i];
		        b[i + 1] = b[i + 1] + min(m, b[i]);
		    }else{
		        result = result + b[i];
		    }
		}
		// 出力
		System.out.println(result);
	}
	
}
