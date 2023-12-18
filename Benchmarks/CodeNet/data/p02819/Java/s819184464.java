import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long x = sc.nextLong();
		
		// 計算
		long result = 0;
		if(x == 2) result = 2;
		while(result == 0){
		    boolean flg = true;
		    for(int i = 2; i <= sqrt(x); i++){
		        if(x%i == 0){
		            flg = false;
		            break;
		        }
		    }
		    if(flg) result = x;
		    x++;
		}
		
		
		
		// 出力
		System.out.println(result);
	}
}
