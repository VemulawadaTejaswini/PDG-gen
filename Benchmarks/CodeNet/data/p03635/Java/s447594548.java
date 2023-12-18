import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 計算
		int result = 0;
		result = (n-1)*(m-1);
		
		
		// 出力
		System.out.println(result);
	}
}

