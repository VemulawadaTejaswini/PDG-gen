import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 計算
		long result = 0;
		//int cnt = 1;
		int now = 1;
		int to = n;
		boolean flg = false;
		if(n%2 != 0) flg = true;
		int[][] list = new int[m][2];
		for(int i = 0; i < m; i++){
		    list[i][0] = now;
		    list[i][1] = to;
		    now++;
		    to--;
		    if(!flg && (n+3)/4 >= i+1){
		        now++;
		    }
		    //cnt++;
		}
		
		// 出力
		for(int i = 0; i < m; i++){
		    System.out.println(list[i][0] + " " + list[i][1]);
		}
		//System.out.println(result);
	}
}

