import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] sum = new int[26];
		Arrays.fill(sum, Integer.MAX_VALUE);
		for(int i = 0; i < n; i++){
		    String s = sc.next();
		    int[] cnt = new int[26];
		    for(int j = 0; j < s.length(); j++){
		        cnt[s.charAt(j)-'a']++;
		    }
		    for(int j = 0; j < sum.length; j++){
		        sum[j] = min(sum[j], cnt[j]);
		    }
		}
		
		// 計算
		//String result = "";
		for(int i = 0; i < sum.length; i++){
		    for(int j = 0; j < sum[i]; j++){
		        System.out.print((char)(i + 'a'));
		    }
		}
		
		// 出力
		//System.out.println(result);
	}
}

