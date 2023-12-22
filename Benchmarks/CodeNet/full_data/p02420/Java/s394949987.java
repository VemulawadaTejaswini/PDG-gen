import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		final String END = "_";
		int shuffle;
		int replace;
		String word, str;
		
		while (true) {
			
			word = scan.next();
			if (word.equals(END)) break;
			
			shuffle = scan.nextInt();
			
			for (int i = 0; i < shuffle; i++) {
				replace = scan.nextInt();
				
			}
			
			System.out.println(word);
			
		} 
		
		scan.close();
		
	}
}

