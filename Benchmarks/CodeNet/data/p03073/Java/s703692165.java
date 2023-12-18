import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		String s = sc1.next();

		int l = s.length();

		String ansstrA = "";
		String ansstrB = "";

		int ansA = 0;
		int ansB = 0;

		for ( int i = 0 ; i < l ; i++ ) {
			if (i % 2 == 0) {
				ansstrA = ansstrA.concat("0");
				ansstrB = ansstrB.concat("1");
			}
			else {
				ansstrA = ansstrA.concat("1");
				ansstrB = ansstrB.concat("0");
			}
		}

		//System.out.println(s);
		//System.out.println(ansstrA);
		//System.out.println(ansstrB);


		for ( int i = 0 ; i < l ; i++ ) {
			if (s.charAt(i) == ansstrA.charAt(i)) {
				ansB++;
			}
			else {
				ansA++;
			}
		}

		if ( ansA > ansB ) {
			System.out.println(ansB);
		}
		else {
			System.out.println(ansA);
		}

		sc1.close();

	}

}