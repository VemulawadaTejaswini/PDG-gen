import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		int cnt = 0;
		for(int i = 1; i <= n; i++){
		    int c = i;
		    int tmp = 0;
		    while(c%2 == 0){
		        c /= 2;
		        tmp++;
		    }
		    if(cnt <= tmp){
		        result = i;
		        cnt = tmp;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

