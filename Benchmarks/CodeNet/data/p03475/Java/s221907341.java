import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] c = new int[n];
		int[] s = new int[n];
		int[] f = new int[n];
		for(int i = 0; i < n-1; i++){
		    c[i] = sc.nextInt();
		    s[i] = sc.nextInt();
		    f[i] = sc.nextInt();
		}
		
		// 計算
		int[] result = new int[n];
		for(int i = 0; i < n-1; i++){
		    result[i] = s[i] + c[i];
		    for(int j = i-1; j >= 0; j--){
		        if(result[j] <= s[i]){
		            result[j] = result[i];
		        }else{
		            result[j] += (f[i] - (result[j]-s[i])%f[i])%f[i] + c[i];
		        }
		    }
		}
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.println(result[i]);
		}
	}
}


