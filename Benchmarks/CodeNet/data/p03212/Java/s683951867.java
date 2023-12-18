import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

    static int result = 0;
    static long n = 0;
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		n = sc.nextLong();
		
		// 計算
		count(0, false, false, false);
		
		// 出力
		System.out.println(result);
	}
	
	static void count(long now, boolean bool3, boolean bool5, boolean bool7){
	    if(now > n) return;
	    if(bool3 && bool5 && bool7) result++;
	    long n3 = now * 10 + 3;
	    long n5 = now * 10 + 5;
	    long n7 = now * 10 + 7;
	    count(n3, true, bool5, bool7);
	    count(n5, bool3, true, bool7);
	    count(n7, bool3, bool5, true);
	}
}