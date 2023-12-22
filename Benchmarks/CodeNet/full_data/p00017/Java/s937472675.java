import java.util.Scanner;

public class Main {
	private StringBuffer letter;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		
		String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		while (scan.hasNext()) {
			String str = scan.nextLine();
			
			for (int p = 0; p < s.length; p++) {
				letter = new StringBuffer();
				for (int i = 0; i < str.length(); i++) {
					String c = str.substring(i, i + 1);
					if (c.equals(" ") || c.equals(".")) {
						letter.append(c);
					}else {
						for (int j = 0; j < s.length; j++) {
							if (c.equals(s[j])) {
								if (j + p >= s.length) {
									letter.append(s[j + p - s.length]);
								}else {
									letter.append(s[j + p]);
								}
							}
						}
					}
				}
				
				if (letter.indexOf("this") != -1 || letter.indexOf("the") != -1 || letter.indexOf("that") != -1) {
					break;
				}
			}
			System.out.println(letter);
		}
	}
	
	private void debug() {
		System.out.println();
	}

}