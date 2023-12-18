import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] train = new int[m][2];
		for(int i = 0; i < m; i++){
		    train[i][0] = sc.nextInt();
		    train[i][1] = sc.nextInt();
		}
		Arrays.sort(train, (s, t) -> Integer.compare(s[0], t[0]));
		int[][] query = new int[q][2];
		for(int i = 0; i < q; i++){
		    query[i][0] = sc.nextInt();
		    query[i][1] = sc.nextInt();
		}
		
		
		// 計算
		Integer[] from = new Integer[m];
		for(int i = 0; i < m; i++){
		    from[i] = train[i][0];
		}
		for(int i = 0; i < q; i++){
		    int result = 0;
		    int indexFrom = lowerBound(from, query[i][0]);
		    Integer[] to = new Integer[m - indexFrom];
		    for(int j = 0; j < to.length; j++){
		        to[j] = train[j+indexFrom][1];
		    }
		    Arrays.sort(to);
		    int indexTo = upperBound(to, query[i][1]) - 1;
		    if(indexFrom <= indexTo) result += indexTo + 1;
		    System.out.println(result);
		}
	}
	
    static int upperBound(Integer[] array, int n){
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) > 0 ? 1 : -1);
		return index;
	}
	static int lowerBound(Integer[] array, int n){
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) >= 0 ? 1 : -1);
		return index;
	}
}
