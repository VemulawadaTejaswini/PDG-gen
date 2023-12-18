import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[][] w = new int[n][2];
		for(int i = 0; i < n; i++){
		    w[i][0] = sc.nextInt();
		    w[i][1] = sc.nextInt();
		}
		Arrays.sort(w, (a, b) -> Integer.compare(a[1], b[1]));
		
		// 計算
		String result = "Yes";
		int t = 0;
		for(int i = 0; i < n; i++){
		    t += w[i][0];
		    if(t > w[i][1]) result = "No";
		}

		// 出力
		System.out.println(result);
		
	}
}
