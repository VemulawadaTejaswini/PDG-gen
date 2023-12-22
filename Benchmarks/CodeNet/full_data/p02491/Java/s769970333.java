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
		System.out.println((a/b) + " " + (a%b) + " " + (float)((float)a/b));
	}

}