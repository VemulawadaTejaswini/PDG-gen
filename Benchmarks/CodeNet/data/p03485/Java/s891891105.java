import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int nA = sc.nextInt();
        int nB = sc.nextInt();
		int  nX = 0;
//		a
//		, 
//		b
//		 の平均値を 
//		x
//		 とします。 
//		x
//		 の小数点以下を切り上げて得られる整数を出力してください。
//
//		制約
//		a
//		, 
//		b
//		 は整数である。
//		1
//		≤
//		a
//		,
//		b
//		≤
//		100

		nX = nA - nB;
		
		// 出力
		System.out.println(nX);
	}
}