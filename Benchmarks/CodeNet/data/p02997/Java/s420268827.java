import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算&出力
		if((n-1)*(n-2)/2 < k){
		    System.out.println(-1);
		    return;
		}
		int m = n-1 + (n-1)*(n-2)/2 - k;
		System.out.println(m);
		for(int i = 1; i <= n-1; i++){
		    System.out.println(n + " " + i);
		}
		int cnt = 1;
		for(int i = 1; i <= n-1; i++){
		    for(int j = i+1; j <= n-1; j++){
		        if(cnt > (n-1)*(n-2)/2 - k) return;
		        System.out.println(i + " " + j);
		        cnt++;
		    }
		}
	}
}
