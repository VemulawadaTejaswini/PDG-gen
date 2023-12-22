import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();

		for (int i = 0; i < c.length; i++) {
			String s = Character.toString(c[i]);
			if (s.equals(s.toUpperCase()))
				System.out.print(s.toLowerCase());
			else
				System.out.print(s.toUpperCase());
		}
		System.out.println();

	}

}