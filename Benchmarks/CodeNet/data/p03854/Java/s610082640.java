//第 4 問: ABC 087 B - Coinsi (200 点)

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		int count = S.length()/5 + 1;

		/*
		String A = "";
		String B = "";
		String C = "";
		*/

		while(true) {

			int counter = S.length();

			if (counter > 7) {

				if (S.substring(0,8).equals("dreamera")){

					S = S.substring(5);

				}
				else if(S.substring(0,7).equals("dreamer")){

					S = S.substring(7);

				}
				else if(S.substring(0,6).equals("eraser")){

					S = S.substring(6);

				}
				else if ((S.substring(0,5).equals("dream")) || (S.substring(0,5).equals("erase"))) {

					S = S.substring(5);

				}
				else {
					System.out.println("NO");
					break;
				}

			}
			else if (counter == 7) {
				if(S.equals("dreamer")) {
					System.out.println("YES");
					break;
				}
				else {
					System.out.println("NO");
					break;
				}

			}
			else if (counter == 6) {

				if(S.equals("eraser")) {
					System.out.println("YES");
					break;
				}
				else {
					System.out.println("NO");
					break;
				}
			}
			else if (counter == 5) {
				if ((S.equals("dream")) || (S.equals("erase"))) {
					System.out.println("YES");
					break;
				}
				else{
					System.out.println("NO");
					break;
				}
			}
			else {
				System.out.println("NO");
				break;
			}


		}

	}
}

