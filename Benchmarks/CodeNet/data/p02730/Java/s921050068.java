import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "Yes";
		int n = s.length();
		String l = s.substring(0, (n-1)/2);
		String r = s.substring((n-1)/2 + 1);
		StringBuilder sbs = new StringBuilder(s);
		String revs = sbs.reverse().toString();
		StringBuilder sbl = new StringBuilder(l);
		String revl = sbl.reverse().toString();
		StringBuilder sbr = new StringBuilder(r);
		String revr = sbr.reverse().toString();
		if(!revs.equals(s)) result = "No";
		if(!revl.equals(l)) result = "No";
		if(!revr.equals(r)) result = "No";
		
		
		// 出力
		System.out.println(result);
		
	}
}
