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
	String[] reverseWords;
	String reverseS;
	
	Daydream() {
		Scanner cin = new Scanner(System.in);
		this.S = cin.nextLine();
		this.words = new String[] {"dream", "dreamer", "erase", "eraser"};
		this.reverseWords = new String[4];
		this.reverseS = "";
	}
	
	void run() {
//		for (int j = 0; j < 4; j++) {
//			String reverseWord = "";
//			for (int i = words[j].length() - 1; i >= 0; i--) {
//				reverseWord += words[j].charAt(i);
//			}
//			reverseWords[j] = reverseWord;
//		}
		
		for (int i = S.length() - 1; i >= 0; i--) {
			reverseS += S.charAt(i);
		}
		
		if (readFromBack()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
	
	boolean readFromBack() {
		
		int index = 0;
		while (index <= S.length()) {
			
			if (reverseS.length() == index) {
				return true;
			}
			
			if (reverseS.substring(index, index + 5).equals("maerd")) {
				index = index + 5;
				continue;
			} 
			
			if (reverseS.substring(index, index + 5).equals("esare")) {
				index = index + 5;
				continue;
			}
			
			if (reverseS.substring(index, index + 7).equals("remaerd")) {
				index = index + 7;
				continue;
			}
			
			if (reverseS.substring(index, index + 6).equals("resare")) {
				index = index + 6;
				continue;
			}
			
			return false;
		}
		return true;
	}
	
}
