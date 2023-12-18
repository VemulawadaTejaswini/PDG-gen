import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();

		if(input.toCharArray()[0] != 'A') {
			System.out.print("WA");
			return;
		}
		if(input.toCharArray()[1] == 'C') {
			System.out.print("WA");
			return;
		}
		if(input.toCharArray()[input.length() - 1] == 'C') {
			System.out.print("WA");
			return;
		}
		if(input.replaceAll("C","").length() == input.length()) {
			System.out.print("WA");
			return;
		}
		if(input.replaceAll("C","").length() < input.length() - 1) {
			System.out.print("WA");
			return;
		}
		if(!input.toLowerCase().equals(input.replaceAll("A","a").replaceAll("C","c"))) {
			System.out.print("WA");
			return;
		}
		System.out.print("AC");
	}
	
}