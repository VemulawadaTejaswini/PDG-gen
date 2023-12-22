import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		final String END = "_";
		String word = "a", str;
		int m, h;
		
		while (true) {
			
			word = scan.next();
			if (word.equals(END)) break;
			
			m = scan.nextInt();
			
			
			
			System.out.println(word);
			
		}
		
		scan.close();
		
	}
}

