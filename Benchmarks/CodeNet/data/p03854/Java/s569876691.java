import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Daydream dd = new Daydream();
		dd.run();
	}
}

class Daydream {
	
	String S;
	String[] words;
	
	Daydream() {
		Scanner cin = new Scanner(System.in);
		this.S = cin.nextLine();
		this.words = new String[] {"dream", "dreamer", "erase", "eraser"};
	}
	
	void run() {
		String T = "";
		if (makeWords(T)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	boolean makeWords(String newString) {
		System.out.println(newString);
		if (newString.equals(S)) {
			return true;
		}
		
		if (newString.length() > S.length()) {
			return false;
		}
		
		for (String word: words) {
			if (makeWords(newString + word)) {
				return true;
			}
		}
		return false;
	}
	
}
