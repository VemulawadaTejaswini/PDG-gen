package 日立製作所;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		ArrayList<String> hitatiList = new ArrayList<>();
		String anser = "No";

		//日立文字の作成
		for (int i = 0; i < 5; i++) {
			String hitati = "";

			for (int j = 0; j <= i; j++) {
				hitati += "hi";
			}
			hitatiList.add(hitati);
		}

		for (String str : hitatiList) {
			if (s.equals(str)) {
				anser = "Yes";
			}
		}
		System.out.println(anser);
	}

}
