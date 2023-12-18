import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		sc.close();

		//処理
		boolean f = a >= 3200;

		//出力
		System.out.println(f ? s : "red");
	}
}
