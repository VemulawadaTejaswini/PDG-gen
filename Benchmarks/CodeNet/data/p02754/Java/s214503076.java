import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String strN = sc.next();
		String strA = sc.next();
		String strB = sc.next();
		long N = Long.parseLong(strN);
		long A = Long.parseLong(strA);
		long B = Long.parseLong(strB);

		boolean flg = false;

		if(A == 0) {
			System.out.println(0);
			return;
		}

		long roop = N / (A+B);
		long amari = N % (A+B) % A;

		System.out.println(roop * A + amari);

	}

}
