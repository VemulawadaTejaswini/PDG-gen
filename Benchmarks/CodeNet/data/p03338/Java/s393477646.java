import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		
		// 計算
		int result = 0;
		for(int i = 1; i < n; i++){
		    int tmp = 0;
		    HashSet<Character> hs = new HashSet<Character>();
		    for(int j = 0; j < i; j++){
		        hs.add(s.charAt(j));
		    }
		    for(Character c : hs){
		        if(s.substring(i).contains(Character.toString(c))){
		            tmp++;
		        }
		    }
		    result = max(result, tmp);
		}
		
		// 出力
		System.out.println(result);
	}
}
