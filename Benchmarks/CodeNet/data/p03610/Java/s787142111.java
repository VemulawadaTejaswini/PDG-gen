
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		for(int i = 0,len = input.length(); i < len;i+=2) {
			System.out.print(input.charAt(i));;
		}
		scanner.close();
	}

}
