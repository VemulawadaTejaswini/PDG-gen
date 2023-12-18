import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long[] h = new long[n];
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		long l = -1;
		long r = Long.MAX_VALUE - 1;
		while(r-l > 1){
			long c = (r + l)/2;
			
			if(func(c, a, b, h)){
				r = c;
			}else{
				l = c;
			}
		}
		result = r;
		
		// 出力
		System.out.println(result);
	}
	
	static boolean func(long cnt, long a, long b, long[] h){
	    long tmp = 0;
	    for(long i : h){
	        tmp += (max(i - b*cnt, 0) + (a-b-1))/(a-b);
	    }
	    if(cnt < tmp) return false;
	    return true;
	}
}
