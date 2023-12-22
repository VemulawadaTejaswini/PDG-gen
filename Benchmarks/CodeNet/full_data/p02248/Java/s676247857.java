import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		final String word = scan.next();
		
		final String keyword = scan.next();
		scan.close();
		
		int i = word.indexOf(keyword);
		
		if (i != -1) {
			System.out.println(i);
			i = word.indexOf(keyword, i + 1);
			while (i != -1) {
				System.out.println(i);
				i = word.indexOf(keyword, i + 1);
			}
		}
		
	}
}

