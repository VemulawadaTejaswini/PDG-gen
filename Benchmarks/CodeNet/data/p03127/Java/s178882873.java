import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		// 計算
		int result = 0;
		int min = a[0];
		int nowIndex = Integer.MAX_VALUE;
		int nextIndex = 0;
		while(nowIndex != nextIndex){
		    nowIndex = nextIndex;
		    for(int i = 0; i < n; i++){
		        if(i == nowIndex) continue;
		        int now = min;
		        int r = a[i]%now;
		        if(r != 0 && r < min){
		            min = r;
		            nextIndex = i;
		        }
		    }
		}
		result = min;
		
		// 出力
		System.out.println(result);
        
	}
}
