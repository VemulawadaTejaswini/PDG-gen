import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		String word;
		String str;
		int m;
		int h;
		
		while (true) {
			
			word = scan.next();
			if (word.equals("_")) break;
			
			m = scan.nextInt();
			
			for (int i = 0; i < m; i++) {
				h = scan.nextInt();
				str = word + word;
				int hh = h + word.length();
				word = str.substring(h, hh);
			}
			
			System.out.println(word);
			
		}
		
		scan.close();
		
	}
}

