import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < q; i++){
		    int type = sc.nextInt();
		    if(type == 1){
		        sb.reverse();
		    }else{
		        int f = sc.nextInt();
		        char c = sc.next().charAt(0);
		        if(f == 1){
		            sb.insert(0, c);
		        }else{
		            sb.append(c);
		        }
		    }
		}
		// 計算
		String result = sb.toString();
		
		
		// 出力
		System.out.println(result);
	}
}
