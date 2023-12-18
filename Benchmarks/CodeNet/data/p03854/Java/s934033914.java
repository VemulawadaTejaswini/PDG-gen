import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();

		// 計算
		String result = "NO";
		if(dfs(s)) result = "YES";
		
		// 出力
		System.out.println(result);
        
	}
	
	static boolean dfs(String s){
	    if("".equals(s)) return true;
	    int len = s.length();
	    if(len >= 5 && "dream".equals(s.substring(len - 5))) return dfs(s.substring(0, len - 5));
	    if(len >= 5 && "erase".equals(s.substring(len - 5))) return dfs(s.substring(0, len - 5));
	    if(len >= 6 && "eraser".equals(s.substring(len - 6))) return dfs(s.substring(0, len - 6));
	    if(len >= 7 && "dreamer".equals(s.substring(len - 7))) return dfs(s.substring(0, len - 7));
	    return false;
	}
}
