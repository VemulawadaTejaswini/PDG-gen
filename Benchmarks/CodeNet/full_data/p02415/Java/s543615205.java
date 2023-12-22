import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char[] line = string.toCharArray();

		char c = ' ';
		for (int i = 0; i < line.length; i++) {
			if (Character.isUpperCase(line[i])) {
				c = Character.toLowerCase(line[i]);
			}
			else if (Character.isLowerCase(line[i])) {
				c = Character.toUpperCase(line[i]);
			} else {
				c = line[i];
			}
			System.out.print(c);
		}
System.out.println();

	}

}