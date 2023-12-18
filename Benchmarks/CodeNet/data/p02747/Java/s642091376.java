import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		boolean valid = false;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)=='h'&&s.charAt(i+1)=='i') {
				valid = true;
				break;
			}
		}
		System.out.println(valid? "Yes": "No");
	}
}