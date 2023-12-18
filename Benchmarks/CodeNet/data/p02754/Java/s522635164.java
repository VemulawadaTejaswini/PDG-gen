import java.util.Scanner;


public class Main {

	//残り数問が結果合わない
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String strN = sc.next();
		String strA = sc.next();
		String strB = sc.next();
		// 1 <= N <= 10^18
		long N = Long.parseLong(strN);

		//A >= 0
		long A = Long.parseLong(strA);

		//B >= 0
		long B = Long.parseLong(strB);

		boolean flg = false;

		if(A == 0) {
			System.out.println(0);
			return;
		}

		long roop = N / (A+B);
		long amari = N % (A+B);
		if(amari > A) {
			amari = A;
		}

		System.out.println(roop * A + amari);

	}

}
