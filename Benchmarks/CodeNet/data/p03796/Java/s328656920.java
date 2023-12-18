import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// N回

		// 計算
		int p = 1;
		for(int i = 0; i < n; i++){
			p = (p * (i + 1))%((int)pow(10 ,9) + 7);
		}

		// 出力
		System.out.println(p);

	}
}
