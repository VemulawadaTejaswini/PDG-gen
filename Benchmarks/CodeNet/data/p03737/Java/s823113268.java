import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int MOD = 1000000007;

		//入力
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		sc.close();

		//処理
		String ans = String.valueOf(a.charAt(0)) + b.charAt(0) + c.charAt(0);
		ans = ans.toUpperCase();

		//出力	
		out.println(ans);
		out.flush();
	}

	static class Pair{
		int w,v;
		public Pair(int a, int b){
			this.w = a;
			this.v = b;
		}
	}
}