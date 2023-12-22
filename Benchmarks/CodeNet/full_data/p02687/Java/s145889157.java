package aProblemsOfABC;
import java.util.Scanner;

public class A166 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();

		if(str.equals("ABC")) {

			//S=ABC then the output is ARC
			System.out.println("ARC");

		}else if(str.equals("ARC")) {

			//S=ARC then the output is ABC
			System.out.println("ABC");

		}else{

			System.out.println("Incorrect input");

		}

		scan.close();

	}

}
