import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);			//文字の入力

	static int N = s.nextInt();
	static int A = s.nextInt();

	static int count =0;
	static int m =0;								//現在地の表示
	static int hanbetu = 0;


	static int ans = 0;
	public static void main(String[] args){

		solve();

	}


	static void solve() {
		N *= N;
		System.out.println(N - A);
		
	}
		
	}