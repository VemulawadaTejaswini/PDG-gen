import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++){
		    String w = sc.next();
		    if(map.containsKey(w)){
		        map.put(w, map.get(w) + 1);
		    }else{
		        map.put(w, 1);
		    }
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++){
		    String w = sc.next();
		    if(map.containsKey(w)){
		        map.put(w, map.get(w) - 1);
		    }
		}
		
		// 計算
		int result = 0;
		for(Integer cnt : map.values()){
		    result = max(result, cnt);
		}
		
		// 出力
		System.out.println(result);
	}
}


