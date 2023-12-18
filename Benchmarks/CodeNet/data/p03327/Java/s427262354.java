import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		if (num <= 999) {
			System.out.println("ABC");
		} else {
			System.out.println("ABD");
		}
		in.close();
	}

}