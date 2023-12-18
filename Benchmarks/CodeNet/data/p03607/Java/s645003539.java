import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    map.put(a, map.getOrDefault(a, 0) + 1);
		}
		
		// 計算
		int result = 0;
		for(Integer i : map.values()){
		    if(i%2 == 1) result++;
		}
		
		// 出力
		System.out.println(result);
		
	}
}
