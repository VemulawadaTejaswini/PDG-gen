import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		Integer[] l = new Integer[n];
		for(int i = 0; i < n; i++){
		    l[i] = sc.nextInt();
		}

		// 計算
	    int result = 0;
	    Arrays.sort(l);
	    for(int i = 0; i < n; i++){
		    for(int j = i + 1; j < n; j++){
		        int index = lowerBound(l, l[i] + l[j]) - 1;
		        result += index - j;
		    }
		}

		// 出力
		System.out.println(result);
        
	}
	
	static int lowerBound(Integer[] array, int n){
	    int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) >= 0 ? 1 : -1);
	    return index;
	}
}
