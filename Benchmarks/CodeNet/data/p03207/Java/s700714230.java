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
	    int index = 0;
	    for(int i = 0; i < n; i++){
		    max = max(max, p[i]);
		    index = i;
		}
	    for(int i = 0; i < n; i++){
	        if(i == index){
	            result += max/2;
	        }else{
	            result += p[i];
	        }
		}
	    
		// 出力
		System.out.println(result);
        
	}
}
