import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static int a,b;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		read();
		solve();
	}

	static void read() {
		a = sc.nextInt();
		b = sc.nextInt();
	}

	static void solve() {
		int d = a/b;
		int r = a%b;
		double f = ((double)a)/((double)b);
		System.out.printf("%d %d %.10f\n",d,r,f);
	}

}