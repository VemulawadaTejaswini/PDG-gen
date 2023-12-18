import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}

		// 計算
		int result = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
		    if(list.size() == 0){
		        list.add(a[i]);
		    }else{
		        int lowerIndex = lowerBound(list, a[i]) - 1;
		        if(lowerIndex >= 0){
		            list.remove(lowerIndex);
		            list.add(lowerIndex, a[i]);
		        }else{
		            list.add(0, a[i]);
		        }
		    }
		}
		result = list.size();
		
		// 出力
		System.out.println(result);
		
	}
	
	static int lowerBound(ArrayList<Integer> list, int n){
		Integer[] array = list.toArray(new Integer[list.size()]);
		int index = ~Arrays.binarySearch(array, n, (x,y) -> x.compareTo(y) >= 0 ? 1 : -1);
		return index;
	}
}