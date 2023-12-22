import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String text = scan.nextLine();
	String decryptedText;
	int no = 0;
	while (true) {
	    decryptedText = decrypt(text, no);
	    if (decryptedText.contains("the") || decryptedText.contains("this") ||
		decryptedText.contains("that")) {
		break;
	    }
	    no++;
	}
	System.out.println(decryptedText);
    }
    public static String decrypt (String text, int no) {
	String result = "";
	char letter;
	String tmp = "";
	for (int i = 0; i < text.length(); i++) {
	    letter = (char)text.charAt(i);
	    if ('a' <= letter && letter <= 'z') {
		letter = (char)(letter - no);
		if (letter < 97) {
		    letter = (char)(122 + letter - 97);
		}
		tmp = String.valueOf((char)(letter));
	    } else {
		tmp = String.valueOf(letter);
	    }
	    result += tmp;
	}
	return result;
    }
}