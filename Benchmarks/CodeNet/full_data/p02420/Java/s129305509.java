import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text;
		while(!(text = scan.next()).equals("-")){
			int num = scan.nextInt();
			for (int i = 0; i < num; i++) {
				int c = scan.nextInt();
				text = text.substring(c, text.length()) + text.substring(0 , c);
			}
			System.out.println(text);

		}

	}
}

