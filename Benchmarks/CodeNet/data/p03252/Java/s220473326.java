import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();

		// 計算
		String result = "Yes";
		int[] arrayS = new int[26];
		int[] arrayT = new int[26];
		Arrays.fill(arrayS, -1);
		Arrays.fill(arrayT, -1);
		for(int i = 0; i < s.length(); i++){
		    char x = s.charAt(i);
		    char y = t.charAt(i);
		    if(arrayS[x - 'a'] == -1){
		        arrayS[x - 'a'] = y;
		    }else{
		        if(arrayS[x - 'a'] != y) result = "No";
		    }
		    if(arrayT[y - 'a'] == -1){
		        arrayT[y - 'a'] = x;
		    }else{
		        if(arrayT[y - 'a'] != x) result = "No";
		    }
		}
		
		// 出力
		System.out.println(result);
		
	}
}
