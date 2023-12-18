import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();


		Character a = s.charAt(2);
		Character b = s.charAt(3);

		Character c = s.charAt(4);
		Character d = s.charAt(5);

		if(a.equals(b) && c.equals(d)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}
