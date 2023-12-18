import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		int x = sc.nextInt();
		sc.close();

		//処理
		int ans = 0;
		int now = 0;
		for(int i = 1; true; i++){
			now += i;
			if(now >= x){
				ans = i;
				break;
			}
		}

		//出力
		out.println(ans);
		
		out.flush();
	}
}