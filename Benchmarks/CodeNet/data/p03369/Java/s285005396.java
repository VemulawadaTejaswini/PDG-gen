import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		String[] array = s.split("");
		int oCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("o")) {
				oCount++;
			}
		}
		System.out.println(700 + 100 * oCount);
	}
}
