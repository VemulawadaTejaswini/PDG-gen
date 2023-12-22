import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			String line = sc.nextLine();
			String[] words = line.split(" ");

			char[] nico = new char[26];
			
			int a = 0;
			int b = 0;
			for (int j = 0; j < words.length; j++) {
				String word = words[j];
				if (word.length() == 4) {
					a = word.charAt(0) - word.charAt(1);
					
					int counter = 0;
					while ((a % 12 != 0) || (a <= 0) || (a % 24 == 0) || (a % 156 == 0) || (counter < 12)) {
						a = a + 26;
						if (a > 0) counter++;
					}
					if (counter == 12) continue;
					a = a / 12;
					
					b = word.charAt(0) - a * 19 - 'a';
					while (b < 0) {
						b = b + 26;
					}
					
					for (int k = 0; k < nico.length; k++) {
						nico[(a * k + b) % 26] = (char)(k + 'a');
					}
					
					String tt = "";
					for (int k = 0; k < 4; k++) {
						tt = tt + nico[word.charAt(k) - 'a'];
					}
					
					if (tt.equals("this") || tt.equals("that") == true) break;
				}
			}
			
			for (int j = 0; j < line.length(); j++) {
				if (Character.isAlphabetic(line.charAt(j)) == true) {
					System.out.print(nico[line.charAt(j) - 'a']);
				} else {
					System.out.print(line.charAt(j));
				}
			}
			System.out.println();
		}
	}
}