import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		long result = 0;
		int n = s.length();
		int p = 2019;
		
		int[] sum = new int[n+1];
		int pow = 1;
		for(int i = 0; i < n; i++){
		    sum[i+1] = (sum[i] + (s.charAt(n-1-i)-'0')*pow)%p;
		    pow *= 10;
		    pow %= p;
		}
		int[] cnt = new int[p];
		for(int i = 0; i < n+1; i++){
		    result += cnt[sum[i]];
		    cnt[sum[i]]++;
		}
		
		// 出力
		System.out.println(result);
	}
}
