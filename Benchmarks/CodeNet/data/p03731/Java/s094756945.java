import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int result = 0;
		int t1 = sc.nextInt();
		int pre = t1;
		for(int i = 1; i < n; i++){
		    int next = sc.nextInt();
		    result += min(t, next - pre);
		    pre = next;
		}
		result += t;
		
		// 計算
		
		// 出力
		System.out.println(result);
	}
}
