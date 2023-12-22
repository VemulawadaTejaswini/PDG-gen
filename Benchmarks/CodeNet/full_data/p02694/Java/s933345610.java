import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long x = sc.nextLong();
		
		// 計算
		long result = 0;
		long m = 100;
		while(m < x){
		    m = (long)(m * 1.01);
		    result++;
		}
		
		// 出力
		System.out.println(result);
	}
}

