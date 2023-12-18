import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String i = s.nextLine();

		if (i.charAt(2) == i.charAt(3) && i.charAt(4) == i.charAt(5)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		s.close();
	}

}
