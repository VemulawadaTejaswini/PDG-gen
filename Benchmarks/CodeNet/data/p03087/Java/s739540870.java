import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		
		// 計算
		int[] list = new int[n + 1];
		int cnt = 0;
		for(int i = 0; i < n - 1; i++){
		    if(s.substring(i, i + 2).equals("AC")){
		        cnt++;
		    }
		    list[i + 2] = cnt;
		}
		for(int i = 0; i < q; i++){
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    int result = list[r] - list[l];
		    System.out.println(result);
		}

		// 出力
		//System.out.println(result);
        
	}
}
