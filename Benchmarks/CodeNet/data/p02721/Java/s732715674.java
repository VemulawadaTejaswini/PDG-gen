import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		
		// 計算
		long result = 0;
		boolean[] flg = new boolean[n];
		int now = -(c+1);
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    if(cnt == k) flg[i] = false;
		    if(cnt != k && s.charAt(i) == 'o'){
		        flg[i] = true;
		        if(now + c >= i){
		            flg[i] = false;
		        }else{
		            now = i;
		            cnt++;
		        }
		    }
		}
		//System.out.println(Arrays.toString(flg));
		now = n + c;
		cnt = 0;
		for(int i = 0; i < n; i++){
		    if(cnt == k) flg[n-i-1] = false;
		    if(cnt != k && s.charAt(n-i-1) == 'o'){
		        if(now - c <= n-i-1){
		            flg[n-i-1] = false;
		        }else{
		            now = n-i-1;
		            cnt++;
		        }
		    }
		}
		//System.out.println(Arrays.toString(flg));
		
		// 出力
		for(int i = 0; i < n; i++){
		    if(flg[i]) System.out.println(i+1);
		}
	}
}

