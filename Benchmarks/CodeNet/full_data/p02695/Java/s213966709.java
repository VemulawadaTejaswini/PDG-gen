import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] query = new int[q][4];
		for(int i = 0; i < q; i++){
		    query[i][0] = sc.nextInt()-1;
		    query[i][1] = sc.nextInt()-1;
		    query[i][2] = sc.nextInt();
		    query[i][3] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		int[] list = new int[n];
		result = func(list, m, 0, 0, query);
		
		// 出力
		System.out.println(result);
	}
	
	static int func(int[] list, int m, int i, int result, int[][] query){
	    if(list.length == i){
	        return calc(list, query);
	    }
	    int from = 1;
	    if(i > 0) from = list[i-1];
	    for(int j = from; j <= m; j++){
	        list[i] = j;
	        result = max(result, func(list, m, i+1, result, query));
	    }
	    return result;
	}
	
	static int calc(int[] list, int[][] query){
	    int sum = 0;
	    for(int i = 0; i < query.length; i++){
	        if(list[query[i][1]] - list[query[i][0]] == query[i][2]){
	            sum += query[i][3];
	        }
	    }
	    return sum;
	}
}

