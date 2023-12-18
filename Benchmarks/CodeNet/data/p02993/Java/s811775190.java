
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();

			char before = ' ';
			for(char c : s.toCharArray()) {
				if(c == before) {
					System.out.println("Bad");
					return;
				}
				before = c;
			}
			System.out.println("Good");
		}
	}
}
