import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		int k = sc.nextInt();
		
		// 計算
		String result = "";
		TreeSet<String> ts = new TreeSet<String>();
		for(int i = 0; i < s.length(); i++){
		    for(int j = i; j < min(i+k, s.length()); j++){
		        ts.add(s.substring(i, j+1));
		    }
		}
		for(int i = 0; i < k; i++){
		    result = ts.pollFirst();
		}
		
		// 出力
		System.out.println(result);
	}
}
