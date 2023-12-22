package atcoder;

import java.util.Scanner;
public class AtcoderA {

	public static void Main(String[] args) {



		Scanner scan = new Scanner(System.in);

		String chara = scan.nextLine();

		if(Character.isUpperCase(chara.charAt(0))) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
		scan.close();

	}

}

