import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();
		int sn = sc.nextInt();
		int tn = sc.nextInt();
		String u = sc.next();
		
		// 計算
		//int result = 0;
		if(u.equals(s)){
		    sn--;
		}else{
		    tn--;
		}
		
		// 出力
		System.out.println(sn + " " + tn);
	}
}

