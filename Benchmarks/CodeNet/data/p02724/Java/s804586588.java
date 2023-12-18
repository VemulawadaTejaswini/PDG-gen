import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		
		// 計算
		int result = 0;
		result += (x/500)*1000;
		result += ((x%500)/5)*5;
		
		// 出力
		System.out.println(result);
	}
}

