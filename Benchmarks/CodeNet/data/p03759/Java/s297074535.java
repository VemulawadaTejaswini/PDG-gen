import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		//処理
		boolean f = (b - a == c - b);

		//出力	
		out.println(f ? "YES" : "NO");
		out.flush();
	}
}