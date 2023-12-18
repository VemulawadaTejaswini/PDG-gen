import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++){
		    p[i] = sc.nextInt();
		}
		// 計算
		int result = 0;
		int max = 0;
		int second = 0;
		for(int i = 0; i < n; i++){
		    max = p[i];
		    for(int j = i + 1; j < n; j++){
    		    if(max <= p[j]){
    		        second = max;
    		        max = p[j];
    		    }else if(second < p[j]){
    		        second = p[j];
    		    }
    		    result = result + second;
		    }
		    max = 0;
		    second = 0;
		}

		// 出力
		System.out.println(result);
	}
}
