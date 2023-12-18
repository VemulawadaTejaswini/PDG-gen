
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);

		System.out.println("aさん>");
		String a = scan.nextLine();

		System.out.println("bさん>");
		String  b = scan.nextLine();

		System.out.println("cさん>");
		String  c = scan.nextLine();

		char result =c.charAt(c.length()-1);

		System.out.println("結果"+result);



		}

}

