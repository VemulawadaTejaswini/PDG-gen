import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] c = new int[m][2];
		for(int i = 0; i < m; i++){
		    c[i][0] = sc.nextInt();
		    c[i][1] = sc.nextInt();
		}
		
		// 計算
		int result = -1;
		for(int i = 0; i < 1000; i++){
		    boolean flg = true;
		    String s = String.valueOf(i);
		    if(s.length() != n) continue;
		    for(int j = 0; j < m; j++){
		        if(c[j][0] > s.length()){
		            flg = false;
		            break;
		        }
		        if(s.charAt(c[j][0]-1) - '0' != c[j][1]){
		            flg = false;
		            break;
		        }
		    }
		    if(flg){
		        result = i;
		        System.out.println(result);
		        return;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
