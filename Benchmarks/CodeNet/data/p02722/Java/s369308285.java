import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		
		// 計算
		long result = 2;
		for(int k = 2; k <= sqrt(n); k++){
		    long tmp = n;
		    if((tmp-1)%k == 0) result++;
		    while(tmp%k == 0){
		        tmp /= k;
		    }
		    if(tmp%k == 1) result++;
		}
		
		
		// 出力
		System.out.println(result);
	}
}
