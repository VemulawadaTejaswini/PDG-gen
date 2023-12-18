import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int MOD = 1000000007;

		//入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		//処理
		boolean f = false;
		for(int i = 0; i < b; i++){
			if(a * i % b == c) f = true;
		}

		//出力	
		out.println(f ? "YES" : "NO");
		out.flush();
	}

	static class Pair{
		int a,b;
		public Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
}