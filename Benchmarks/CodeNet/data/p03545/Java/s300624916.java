import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		int a = s.charAt(0) - '0';
		int b = s.charAt(1) - '0';
		int c = s.charAt(2) - '0';
		int d = s.charAt(3) - '0';
		
		// 計算
		String op1 = "";
		String op2 = "";
		String op3 = "";
		for(int i = 0; i < 8; i++){
		    int sum = a;
		    if(((i>>0)&1) == 0){
		        op1 = "+";
		        sum += b;
		    }else{
		        op1 = "-";
		        sum -= b;
		    }
		    if(((i>>1)&1) == 0){
		        op2 = "+";
		        sum += c;
		    }else{
		        op2 = "-";
		        sum -= c;
		    }
		    if(((i>>2)&1) == 0){
		        op3 = "+";
		        sum += d;
		    }else{
		        op3 = "-";
		        sum -= d;
		    }
		    if(sum == 7) break;
		}
		
		// 出力
		System.out.println(a + op1 + b + op2 + c + op3 + d + "=7");
	}
}

