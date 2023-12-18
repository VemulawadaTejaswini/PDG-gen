import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sa = sc.nextLine();
		sc.close();
		char one = sa.charAt(0);
		char two = sa.charAt(1);
		char three = sa.charAt(2);
		char four = sa.charAt(3);

		if((one == two)) {
			if((one != three) && (three == four)) {
				System.out.println("Yes");
			}
		}else if((one == three)) {
			if((one != two) && (two == four)) {
				System.out.println("Yes");
			}
		}else if((one == four)) {
			if((one != two) && (two == three)) {
				System.out.println("Yes");
			}
		}else {
			System.out.println("No");
		}
	}
}