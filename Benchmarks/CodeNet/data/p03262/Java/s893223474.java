import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] city = new int[n+1];
	    for(int i = 0; i < n; i++){
	        city[i] = sc.nextInt();
	    }
	    city[n] = x;
	    Arrays.sort(city);
		
		// 計算
		int result = city[1] - city[0];
		for(int i = 1; i < n - 1; i++){
	        int sabun = city[i+1] - city[i];
	        result = gcd(result, sabun);
	    }
		
		// 出力
		System.out.println(result);
		
	}
	
	static int gcd(int x, int y){
	    if(y == 0) return x;
	    return gcd(y , x%y);
	}
}
