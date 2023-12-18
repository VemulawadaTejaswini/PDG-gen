import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		String Osplit[]  = O.split("");
		String Esplit[]  = E.split("");

		if(O.length() == E.length()) {
		for(int i = 0; i < (Osplit.length) ;i++) {
			System.out.print(Osplit[i]+Esplit[i]);
		}
		}
		if(O.length() > E.length()) {
			for(int i = 0; i < (Osplit.length-1) ;i++) {
				System.out.print(Osplit[i]+Esplit[i]);
			}
			System.out.print(Osplit[O.length()-1]);

		}
		if(E.length() > O.length()) {
			for(int i = 0; i < (Osplit.length) ;i++) {
				System.out.print(Osplit[i]+Esplit[i]);
			}
			System.out.print(Osplit[E.length()-1]);

		}



	}

}
