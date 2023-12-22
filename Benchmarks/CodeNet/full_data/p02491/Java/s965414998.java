import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static int a,b;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		while(read())	solve();
	}

	static boolean read() {
		if(sc.hasNextInt()){
			a = sc.nextInt();
			b = sc.nextInt();
			return true;
		} else {
			return false;
		}
	}

	static void solve() {
		int d = a/b;
		int r = a%b;
		double f = (double)a/(double)b;
		System.out.println(d + " " + r + " " + f);
	}

}