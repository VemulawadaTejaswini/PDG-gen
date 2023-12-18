import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ac = new int[n];
		int[] penalty = new int[n];
		int acCnt = 0;
		int penaltyCnt = 0;
		for(int i = 0; i < m; i++){
		    int p = sc.nextInt() - 1;
		    String s = sc.next();
		    if(ac[p] == 1) continue;
		    if(s.equals("AC")){
		        ac[p] = 1;
		        acCnt++;
		        penaltyCnt += penalty[p];
		    }else{
		        penalty[p]++;
		    }
		}
		
		// 計算
		
		
		// 出力
		System.out.println(acCnt + " " + penaltyCnt);
	}
	
}


