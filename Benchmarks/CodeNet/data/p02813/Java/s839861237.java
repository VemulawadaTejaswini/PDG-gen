import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		for(int i = 0; i < n; i++){
		    p[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    q[i] = sc.nextInt();
		}
		int P = 0;
		for(int i = 0; i < n; i++){
		    P += p[i]*(int)pow(10, (n-i-1));
		}
		int Q = 0;
		for(int i = 0; i < n; i++){
		    Q += q[i]*(int)pow(10, (n-i-1));
		}
		
		// 計算
		int result = Q;
		int[] usea = new int[n];
		int[] useb = new int[n];
		int a = func(n, P, usea, 0, 0);
		int b = func(n, Q, useb, 0, 0);
		
		// 出力
		System.out.println(abs(a-b));
	}
	
	static int func(int n, int p, int[] use, int num, int r){
	    int res = 0;
	    if(String.valueOf(num).length() == n){
	        r++;
	        if(p == num) return r;
	    }
	    for(int i = 1,; i <= n; i++){
	        if(use[i-1] == 1) continue;
	        use[i-1] = 1;
	        res = func(n, p, use, num*10+i, r);
	    }
	    return res;
	}
	
}


