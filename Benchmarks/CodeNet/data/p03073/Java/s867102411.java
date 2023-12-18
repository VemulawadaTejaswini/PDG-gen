import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		int result = 0;
		int a = 0;
		int b = 0;
		for(int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);
		    if(i%2 == 0){
		        if(c == '0') a++;
		        if(c == '1') b++;
		    }else{
		        if(c == '1') a++;
		        if(c == '0') b++;
		    }
		}
		result = min(a, b);
		
		// 出力
		System.out.println(result);
        
	}
}
