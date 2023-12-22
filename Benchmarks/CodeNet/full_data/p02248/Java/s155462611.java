import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		StringBuilder str = new StringBuilder ();
		StringBuilder count = new StringBuilder ();
		
		final String word = scan.next();
		str.append(word);
		
		final String keyword = scan.next();
		scan.close();
		
		int i = str.indexOf(keyword);
		
		
		if (i != -1) {
			count.append(i).append("\n");
			i = str.indexOf(keyword, i + 1);
			while (i != -1) {
				count.append(i).append("\n");
				i = str.indexOf(keyword, i + 1);
			}
		}
		
		System.out.print(count);
		
	}
}

