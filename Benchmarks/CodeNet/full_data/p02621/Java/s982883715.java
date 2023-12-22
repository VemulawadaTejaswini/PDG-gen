import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
 		//入力された値の取得
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//計算
		int answer = a + a * a + a * a * a;
		//出力
		System.out.println(answer);
	}
}
