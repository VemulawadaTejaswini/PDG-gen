import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String output = new String();

		String buf = new String();

		for(int i = 0,len = input.length(); i < len;i+=2) {
			buf = String.valueOf(input.charAt(i));
			output = output.concat(buf);
		}

		System.out.print(output);

		scanner.close();
	}

}
