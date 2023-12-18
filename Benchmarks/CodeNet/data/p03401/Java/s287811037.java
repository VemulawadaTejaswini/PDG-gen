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
		int sum = abs(a[0]);
		for(int i = 0; i < n-1; i++){
		    sum += abs(a[i+1] - a[i]);
		}
		sum += abs(a[n-1]);
		int[] d = new int[n];
		for(int i = 0; i < n; i++){
		    if(i == 0){
		        d[i] = abs(a[i+1]) - (abs(a[i]) + abs(a[i+1] - a[i]));
		    }else if(i < n-1){
		        d[i] = abs(a[i+1] - a[i-1]) - (abs(a[i] - a[i-1]) + abs(a[i+1] - a[i]));
		    }else{
		        d[i] = abs(a[i-1]) - (abs(a[i] - a[i-1]) + abs(a[i]));
		    }
		}
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.println(sum + d[i]);
		}
		
	}
}


