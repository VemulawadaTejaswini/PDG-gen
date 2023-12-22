

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String s  = sc.next();

		if(s.charAt(s.length() - 1) != 's') {
			System.out.println(s + "s");
		}else {
			System.out.println(s + "es");
		}



		sc.close();

	}

}
