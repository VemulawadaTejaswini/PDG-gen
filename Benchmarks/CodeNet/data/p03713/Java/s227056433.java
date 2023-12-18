import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long h = sc.nextLong();
		long w = sc.nextLong();
		
		// 計算
		long result = 0;
		if(h%3 != 0 && w%3 != 0){
		    long S1 = (h/3)*w;
		    result = minS(h - h/3, w, S1);
		    S1 = ((h+2)/3)*w;
		    result = min(result, minS(h - (h+2)/3, w, S1));
		    S1 = h*(w/3);
		    result = min(result, minS(h, w - w/3, S1));
		    S1 = h*((w+2)/3);
		    result = min(result, minS(h, w - (w+2)/3, S1));
		}
		
		// 出力
		System.out.println(result);
	}
	
	static long minS(long h, long w, long S1){
	    long S2 = max((h/2)*w, h*(w/2));
	    long S3 = h*w - S2;
	    return max(S1, max(S2, S3)) - min(S1, min(S2, S3));
	}
}
