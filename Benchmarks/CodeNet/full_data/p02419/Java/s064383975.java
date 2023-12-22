import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text;
		text = scan.next();
		text = text.toLowerCase();
		String data;
		int count = 0;

		while(!(data = scan.next()).equals("END_OF_TEXT")) {
			data = data.toLowerCase();
			if(data.equals(text)) {
				count++;
			}
		}
		System.out.println(count);

	}
}

