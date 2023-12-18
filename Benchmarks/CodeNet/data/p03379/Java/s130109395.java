import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
		    x[i] = sc.nextInt();
		    y[i] = x[i];
		}
		Arrays.sort(y);
		
		// 計算
		int l = y[n/2 - 1];
		int r = y[n/2];
		
		// 出力
		for(int i = 0; i < n; i++){
		    if(x[i] <= l){
		        System.out.println(r);
		    }else{
		        System.out.println(l);
		    }
		}
		
	}

}


