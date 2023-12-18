import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int result = a + b;
		if(result >= 10){
		    System.out.println("error");
		    return;
		}

		// 出力
		System.out.println(result);
	}
}

