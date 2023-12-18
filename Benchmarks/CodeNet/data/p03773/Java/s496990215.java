import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		//処理
		int ans = a + b;
		if(ans >= 24){
			ans -= 24;
		}

		//出力	
		out.println(ans);
		out.flush();
	}
}