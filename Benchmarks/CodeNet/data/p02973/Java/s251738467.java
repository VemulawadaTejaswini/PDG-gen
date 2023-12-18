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
		TreeMap<Integer, Integer[]> tm = new TreeMap<Integer, Integer[]>();
		for(int i = 0; i < n; i++){
		    if(i == 0){
		        Integer[] list = {1, 0};
		        tm.put(a[i], new Integer[]{1, 0});
		    }else if(a[i-1] >= a[i]){
		        if(tm.containsKey(a[i-1])){
		            tm.get(a[i-1])[1]++;
		        }else{
		            tm.put(a[i-1], new Integer[]{0, 1});
		        }
		        if(tm.containsKey(a[i])){
		            tm.get(a[i])[0]++;
		        }else{
		            tm.put(a[i], new Integer[]{1, 0});
		        }
		    }
		    if(i == n-1){
		        if(tm.containsKey(a[i])){
		            tm.get(a[i])[1]++;
		        }else{
		            tm.put(a[i], new Integer[]{0, 1});
		        }
		    }
		}
		int cnt = 0;
		for(Integer i : tm.keySet()){
		    cnt += tm.get(i)[0];
		    result = max(result, cnt);
		    cnt -= tm.get(i)[1];
		}
		// 出力
		System.out.println(result);
		
	}
}