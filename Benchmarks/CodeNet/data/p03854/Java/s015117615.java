//第 4 問: ABC 087 B - Coinsi (200 点)

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		int count = S.length()/5 + 1;


		while(true) {

			String A = "";
			String B = "";
			String C = "";


			int counter = S.length();

			if (counter >6) {
			A = S.substring(0,5);
			B = S.substring(0,6);
			C = S.substring(0,7);
			}
			else if (counter >5) {
			A = S.substring(0,5);
			B = S.substring(0,6);
			}
			else if (counter > 4 ) {
			A = S.substring(0,5);
			}
			else {
				System.out.println("NO");
				//System.out.println("2");
				break;
			}

			//System.out.println(A + B + C);

			if (C.equals("dreamer")){

				if (counter == 7) {
					System.out.println("Yes");
					break;
				}
				else {
					if(S.substring(7,8).equals("a")) {
						S = S.substring(5);
						//System.out.println("A-1");

					}
					else {
						S = S.substring(7);
						//System.out.println("A-2");
					}
				}

			}
			else if(B.equals("eraser")){

				if (counter == 6){
					System.out.println("Yes");
					break;
				}
				else {
				S = S.substring(6);
				//System.out.println("B");
				}
			}
			else if ((A.equals("dream")) || (A.equals("erase"))) {

				if (counter == 5){
					System.out.println("Yes");
					break;
				}
				else {
				S = S.substring(5);
				//System.out.println("C");
				}
			}
			else {
				System.out.println("NO");
				//System.out.println("3");
				break;
			}

		}

	}
}

