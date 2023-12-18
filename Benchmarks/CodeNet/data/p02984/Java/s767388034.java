import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		int[] result = new int[n];
		for(int i = 0; i < n; i++){
		    if(i%2 == 0){
		        result[0] += a[i];
		    }else{
		        result[0] += -a[i];
		    }
		}
		
		for(int i = 1; i < n; i++){
		    result[i] = 2*a[i-1] - result[i-1];
		}
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.print(result[i] + " ");
		}
		
	}
}
