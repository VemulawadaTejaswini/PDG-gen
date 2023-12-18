import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		String replace = "";
		String m;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '1') {
				m = "9";
			} else {
				m = "1";
			}
			replace = replace+m;
		}
		System.out.println(replace);
	}
}