import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		String s;
		String p;
		StringBuilder ling = new StringBuilder();
		final int MAX_LENGTH = 100;

		Scanner stdIn = new Scanner(System.in);

		s = stdIn.nextLine();
		p = stdIn.nextLine();

		while(ling.length() <= MAX_LENGTH) {
			ling.append(s);
		}

		if(ling.indexOf(p) == -1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}