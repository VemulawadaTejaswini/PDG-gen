import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		Integer[] a = new Integer[m];
		for(int i = 0; i < m; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		int result = Integer.MAX_VALUE;
		int index = upperBound(a, x);
		result = min(m - index, index);
		
		// 出力
		System.out.println(result);
		
	}
	
	static int upperBound(Integer[] array, int n){
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) > 0 ? 1 : -1);
		return index;
	}
}


